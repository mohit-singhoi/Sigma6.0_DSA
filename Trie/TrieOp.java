// Create a Trie (also known as a Prefix Tree).
// A Trie is a tree-like data structure that is used to efficiently store and retrieve keys in a dataset of strings.
public class TrieOp {

    public static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
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


    public static void main(String [] args){
        String words[] = {"the" , "a" , "there", "their", "any" , "thee"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println("the exists: " + search("the")); // true
        System.out.println("these exists: " + search("these")); // false

        // The trie has been created with the given words.
        System.out.println("a exists: " + root.children[0] != null); // true (for 'a')
        

    }
    
}
