package com.levelup.ib;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

    public static void main(String[] args){
        System.out.println(longestCommonPref(Arrays.asList("abab", "ab", "abcd")));
    }

    public static String longestCommonPref(List<String> strings){
        StringBuilder longestPrefix = new StringBuilder();
        for(int i=0;i<strings.get(0).length();i++){
            int doesAllStringContain = 0;
            for(String str:strings){
                if(i < str.length() && str.charAt(i) == strings.get(0).charAt(i)){
                    doesAllStringContain++;
                }
            }
            if(doesAllStringContain == strings.size()){
                longestPrefix.append(strings.get(0).charAt(i));
            }
        }
        return longestPrefix.toString();
    }
}
