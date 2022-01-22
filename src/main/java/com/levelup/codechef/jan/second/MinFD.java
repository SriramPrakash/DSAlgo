package com.levelup.codechef.jan.second;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MinFD {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int numberOfFD = in.nextInt();
            int amountReqd = in.nextInt();
            in.nextLine();
            List<Integer> totalFD = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            int totalAmt = totalFD.stream().reduce(0,Integer::sum);
            if(totalAmt<amountReqd){
                System.out.println(-1);
                continue;
            }
            if(totalAmt==amountReqd){
                System.out.println(numberOfFD);
                continue;
            }
            Collections.sort(totalFD);
            int amountCollected = 0;
            int j = 0;
            for(;j<numberOfFD;j++){
                if(amountCollected<amountReqd){
                    amountCollected+=totalFD.get(numberOfFD-(j+1));
                }else{
                    break;
                }
            }
            System.out.println(j);
        }
    }
}
