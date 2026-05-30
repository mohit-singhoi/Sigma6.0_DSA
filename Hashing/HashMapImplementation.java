//HashMap Implementation in Java

import java.util.*;
public class HashMapImplementation {
    static class HashMap<K,V>{ // generic

        private class Node {
            K key;
            V values;


            public Node(K key, V values) {
                this.key = key;
                this.values = values;
            }
        }

        private int n; // size
        private int N; // buckets.length
        private LinkedList<Node> buckets[]; // N = buckets.length

       // @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4]; // initial capacity
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N; // 0 to buckets.length-1
        }

        private int SearchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for (int i=0; i<ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return di; // valid index
                }
                di++;
            }
            return -1; // invalid index
        }

        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;

            buckets = new LinkedList[2 * N];
            N = 2 * N;
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // nodes -> add in bucket
            for (int i=0; i<oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j=0; j<ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.values);
                }
            }
        }


        // Put key, value in hashmap
        public void put(K key, V value) { // O(Lambda)- O(1)
            int bi = hashFunction(key); //  0 to 3
            int di =  SearchInLL(key , bi); // valid 

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.values = value; // update
            } else {
                buckets[bi].add(new Node(key, value)); // add new node
                n++;
            }

            double lambda = (double)n / N; // load factor
            if (lambda > 2.0) {
                rehash();
            }
        }

        // Get value for key
        public boolean containsKey(K key) { // O(Lambda) - O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) { // valid index
                return true;
            } else {
                return false;
            }
        }

        // Get value for key
        public V get(K key) { // O(Lambda) - O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) { // valid index
                Node node = buckets[bi].get(di);
                return node.values;
            } else {
                return null;
            }
        }


        // Remove key, value from hashmap
        public V remove(K key) { // O(Lambda) - O(1)
            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) { // valid index
                Node node = buckets[bi].remove(di);
                n--;
                return node.values;
            } else {
                return null;
            }
        }


        // Get all keys in hashmap
        public ArrayList<K> keySet() { // O(N)
            ArrayList<K> keys = new ArrayList<>();

            for (int i=0; i<buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {

                    keys.add(node.key);
                }
            }
            return keys;
        }


            public boolean isEmpty() {
                return n == 0;
            }



    }

    // Main
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("USA", 45); 
        map.put("China", 140);
        map.put("Russia", 30);
        map.put("Japan", 20);
        map.put("Germany", 25);


        System.out.println(map.get("India"));
        System.out.println(map.containsKey("India"));
        System.out.println(map.remove("India"));
        System.out.println(map.containsKey("India"));   


    }
    
}


