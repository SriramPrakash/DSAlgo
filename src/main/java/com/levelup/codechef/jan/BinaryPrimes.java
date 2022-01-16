package com.levelup.codechef.jan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryPrimes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        in.nextLine();
        boolean doesPrimeExist=false;
        for (int i = 0; i < testCases; i++) {
            String binaryStr = in.nextLine();
            if(binaryStr.contains("11") || binaryStr.contains("10")){
                doesPrimeExist=true;
            }
            if(doesPrimeExist){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            doesPrimeExist = false;
        }
    }
}
