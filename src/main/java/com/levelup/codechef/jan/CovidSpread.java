package com.levelup.codechef.jan;

import java.util.Scanner;

public class CovidSpread {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int N = in.nextInt();
            int D = in.nextInt();
            int patients = 0;
            if(D<=10){
                patients = (int) Math.pow(2,D);
            }else{
                patients = (int) Math.pow(2,10);
                for(int j=11;j<=D;j++){
                    if(patients>=N)
                        break;
                    patients *= 3;
                }
            }
            if(patients<=N){
                System.out.println(patients);
            }else{
                System.out.println(N);
            }
        }
    }
}
