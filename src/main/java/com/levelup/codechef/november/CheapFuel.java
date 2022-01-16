package com.levelup.codechef.november;

import java.util.Scanner;

public class CheapFuel {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int X = in.nextInt();
            int Y = in.nextInt();
            if((X+(Y*2))%2==0){
                System.out.println("YES");
            }else if(X==0 && Y%2!=0){
                System.out.println("NO");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
