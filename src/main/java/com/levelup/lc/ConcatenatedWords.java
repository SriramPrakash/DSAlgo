package com.levelup.lc;

import java.util.*;

public class ConcatenatedWords {
    public static void main(String[] args){
        String[] strings = {"cat", "fox"};
        findAllConcatenatedWordsInADict("catfoxcat",strings);
    }

    public static List<Integer> findAllConcatenatedWordsInADict(String search,String[] words) {
        List<Integer> response = new ArrayList<>();
        int wordLength = words[0].length();
        int numberOfWords = words.length;
        HashMap<String,Integer> occurenceMap = new HashMap<>();
        for(int i=0;i<search.length()-(wordLength*numberOfWords);i++){
            int j = i + wordLength;
            //String subStr = search.contains(search.substring(i,j));
        }
        return response;
    }
}
