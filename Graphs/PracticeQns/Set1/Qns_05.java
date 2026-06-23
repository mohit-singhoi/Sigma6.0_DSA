// Qns_05 : Word Ladder Problem

// We have a dictionary, and two words 'start' and 'target'
// (both of same length).
//
// Find length of the smallest chain from 'start' to 'target'
// such that adjacent words in the chain differ by only one character
// and each word in the chain exists in dictionary.
//
// Input:
//
// Dictionary = {POON, PLEE, SAME, POIE, PLEA, PLIE, POIN}
// Start = TOON
// Target = PLEA
//
// Output:
// 7
//
// Explanation:
//
// TOON - POON - POIN - POIE - PLIE - PLEE - PLEA
//
// Length of chain = 7


import java.util.*;

public class Qns_05 {


    static int wordLadder(
        Set<String> dict,
        String start,
        String target
    ) {


        Queue<String> q = new LinkedList<>();

        q.add(start);


        int level = 1;


        while(!q.isEmpty()) {


            int size = q.size();


            for(int i = 0; i < size; i++) {


                String word = q.remove();


                if(word.equals(target))
                    return level;



                char arr[] = word.toCharArray();



                for(int j = 0; j < arr.length; j++) {


                    char original = arr[j];



                    for(char c = 'A'; c <= 'Z'; c++) {


                        arr[j] = c;


                        String next = new String(arr);



                        if(dict.contains(next)) {

                            q.add(next);
                            dict.remove(next);
                        }
                    }


                    arr[j] = original;
                }
            }


            level++;
        }


        return 0;
    }



    public static void main(String args[]) {


        Set<String> dict = new HashSet<>();

        dict.add("POON");
        dict.add("PLEE");
        dict.add("SAME");
        dict.add("POIE");
        dict.add("PLEA");
        dict.add("PLIE");
        dict.add("POIN");



        String start = "TOON";
        String target = "PLEA";


        System.out.print("Minimum number of words in the transformation chain from start word to target word : ");
        System.out.println(wordLadder(dict,start,target));

    }
}