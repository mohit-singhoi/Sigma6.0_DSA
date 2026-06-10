// Word Break problem: Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

// Create a Trie (also known as a Prefix Tree).
// A Trie is a tree-like data structure that is used to efficiently store and retrieve keys in a dataset of strings.

public class WordBreakProblem{

    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

       public Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert a word into the Trie.
    public static void insert(String word){ // O(length of the word)
        Node curr = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];

        }
        curr.eow = true;

        
    }

    // Search for a word in the Trie.
    public static boolean search(String key){ // O(length of the word)
        Node curr = root;
        for(int level=0;level<key.length();level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }

    // Recursive function to check if the key can be segmented into words from the Trie.
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true; // Base case: if the key is empty, it can be segmented.
        }
        for(int i=1;i<=key.length();i++){
            String prefix = key.substring(0, i); // Get the prefix of the key.
            String suffix = key.substring(i); // Get the suffix of the key.

            // If the prefix is in the Trie and the suffix can be segmented, return true.
            if(search(prefix) && wordBreak(suffix)){
                return true;
            }
        }
        return false; // If no segmentation is found, return false.
    }

    public static void main(String [] args){
        String arr[] = {"i" , "like" , "sam" , "sung", "samsung", "mobile" , "ice" , "cream", "icecream"};

        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        String key = "ilikesamsung";
        String key2 = "ilikeicecream";
        String key3 = "ilikeicecreams"; // This should return false as "icecreams" is not in the Trie.

        // Check if the key can be segmented into a space-separated sequence of one or more dictionary words.
        // We can use a recursive approach to check if the key can be segmented.
        System.out.println("Breakable: " + wordBreak(key)); // true
        System.out.println("Breakable: " + wordBreak(key2)); // true
        System.out.println("Breakable: " + wordBreak(key3)); // false
        System.out.println("Breakable: " + wordBreak("samsungmobile")); // true

        

    }
    
}

