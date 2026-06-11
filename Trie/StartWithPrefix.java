// Create a function boolean startsWithPrefix(String prefix) that checks if there is any word in the Trie that starts with the given prefix.

public class StartWithPrefix {
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

    // Function to check if there is any word in the Trie that starts with the given prefix.
    public static boolean startsWithPrefix(String prefix){
        Node curr = root;
        for(int level=0;level<prefix.length();level++){
            int idx = prefix.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false; // If we reach a null node, it means there is no word with this prefix.
            }
            curr = curr.children[idx];
        }
        return true; // If we successfully traverse the prefix, it means there is at least one word with this prefix.
    }

    public static void main(String[] args) {
        insert("hello");
        insert("hell");
        insert("heaven");
        insert("goodbye");

        System.out.println(startsWithPrefix("he")); // true
        System.out.println(startsWithPrefix("hell")); // true
        System.out.println(startsWithPrefix("good")); // true
        System.out.println(startsWithPrefix("bye")); // false
    }
    
}
