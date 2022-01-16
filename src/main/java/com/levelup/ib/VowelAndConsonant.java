package com.levelup.ib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelAndConsonant {

    public static void main(String[] args){
        System.out.println(allSubStrings("aba"));
    }

    public static Integer allSubStrings(String a){
        List<String> subStrings = new ArrayList<>();
        List<Integer> subStringVowel = new ArrayList<>();
        List<Integer> subStringConsonant = new ArrayList<>();
        final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < a.length(); i++) {
            String subStr="";
            if(!vowels.contains(a.charAt(i))){
                subStringVowel.add(0);
                subStringConsonant.add(1);
            }else {
                subStringVowel.add(1);
                subStringConsonant.add(0);
            }
        }
        for(int i=1;i<subStringVowel.size();i++){
            subStringVowel.set(i,subStringVowel.get(i) + subStringVowel.get(i-1));
            subStringConsonant.set(i,subStringConsonant.get(i) + subStringConsonant.get(i-1));
        }
        int finalCount = 0;
        for(int i=0;i<subStringVowel.size();i++){
            if(!vowels.contains(a.charAt(i))){
                finalCount += subStringVowel.get(subStringVowel.size()-1) - subStringVowel.get(i);
            }else{
                finalCount += subStringConsonant.get(subStringConsonant.size()-1) - subStringConsonant.get(i);
            }
            finalCount %= (1000000007);
        }
        return finalCount;
    }
}
