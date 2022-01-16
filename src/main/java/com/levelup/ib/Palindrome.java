package com.levelup.ib;

import java.util.Locale;

public class Palindrome {
    public static void main(String... args){
        String str = "a";
        System.out.println(isPalindrome(str));
    }

    public static int isPalindrome(String A) {
        String replacementString = A.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        for(int i=0;i<replacementString.length();i++){
            if(replacementString.charAt(i) != replacementString.charAt(replacementString.length()-1-i)){
                return 0;
            }
        }
        return 1;
    }
}
