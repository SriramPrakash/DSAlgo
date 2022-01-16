package com.levelup.codechef.jan;

import java.util.Scanner;

public class KeplerLaw {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int T1 = in.nextInt();
            int T2 = in.nextInt();
            int R1 = in.nextInt();
            int R2 = in.nextInt();
            if((Math.pow(T1,2)/Math.pow(R1,3))==(Math.pow(T2,2)/Math.pow(R2,3))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
