// Create a Trie (also known as a Prefix Tree).

import java.util.*;
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

    public static void main(String [] args){
        String words[] = {"the" , "a" , "there", "their", "any" , "thee"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        // The trie has been created with the given words.
        // Print the root node to verify the structure of the trie.
        System.out.println(root.children[0] != null); // true (for 'a')

    }
    
}
