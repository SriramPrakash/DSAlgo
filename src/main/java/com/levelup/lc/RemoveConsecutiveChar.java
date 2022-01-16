package com.levelup.lc;

public class RemoveConsecutiveChar {

    public static void main(String[] args){
        String s = "aaabbbgccddd";
        int num = 3;
        System.out.println(solve(s,num));
    }

    public static String solve(String A, int B) {
        String ans = "";
        for(int i = 0 ; i < A.length() ; i++){
            int j = i + 1;
            while(j < A.length() && A.charAt(j) == A.charAt(i))
                j++;

            if(j - i != B)
                ans += A.substring(i , j);

            i = j - 1;
        }
        return ans;
    }
}
