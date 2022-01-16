package com.levelup.codechef.november;

import java.util.Scanner;

public class MakePal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String("123");
        str.intern();
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int N = in.nextInt();
            int oddNumber = 0,evenCount = 0;
            in.nextLine();
            String array = in.nextLine();
            String[] allNumber  = array.split(" ");
            for(int j=0;j<allNumber.length;j++){
                if(Integer.valueOf(allNumber[i]) % 2 == 0){
                    evenCount++;
                }else{
                    oddNumber++;
                }
            }
            if(oddNumber == 0)
            {
                System.out.println(0);
            }
            else{
                System.out.println(oddNumber/2);
            }
        }
    }
}
