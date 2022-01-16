package com.levelup.codechef.november;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EyeColor {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] parents = in.nextLine().split(" ");
        Map<String,Integer> priorityMap = new HashMap<>();
        priorityMap.put("G",3);
        priorityMap.put("B",2);
        priorityMap.put("R",1);
        if(parents[0].equals(parents[1])){

            System.out.println(parents[0]);
        }else{
            int child = Math.min(priorityMap.get(parents[0]),priorityMap.get(parents[1]));
            if(child == 1){
                System.out.println("R");
            }else if(child == 2){
                System.out.println("B");
            }else{
                System.out.println("G");
            }

        }
    }
}
