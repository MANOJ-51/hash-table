package com.hashtable;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Hash Table");
        System.out.println("");
        System.out.println("Frequency of words /Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations/ is  :");

        String string = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        Map<String, Integer> hashTable = new Hashtable<>();               //initialising hashtable
        String[] words = string.toLowerCase().split(" ");  //changing words to lower case and split
        for (String word : words) {                                  // repeat for every single word
            Integer integer = hashTable.get(word);                   //assign integer value to the word
            if (integer == null) {                                   //integer will be initially 0 for every new word
                hashTable.put(word, 1);                              // so we assign 1 for every new word
            } else {                                               //if the word repeat again
                hashTable.put(word, integer + 1);                      // we increase the integer value with one
            }
        }
        System.out.println(hashTable);                 //printing the hash map
    }
}
