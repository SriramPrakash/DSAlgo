package com.levelup.codechef.jan.second;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        in.nextLine();
        for (int i = 0; i < testCases; i++) {
            String highScorer = "";
            List<Integer> dragonMark = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> slothMark = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            int totalDragonMark = dragonMark.stream().reduce(0,Integer::sum);
            int totalSlotMark = slothMark.stream().reduce(0,Integer::sum);
            if(totalDragonMark
                    == totalSlotMark){
                for(int j=0;j<dragonMark.size();j++){
                    if("DRAGON".equalsIgnoreCase(whoScoredMore(dragonMark.get(j),slothMark.get(j))) ||
                            "SLOTH".equalsIgnoreCase(whoScoredMore(dragonMark.get(j),slothMark.get(j)))){
                        highScorer = whoScoredMore(dragonMark.get(j),slothMark.get(j));
                        break;
                    }else{
                        highScorer = "TIE";
                    }
                }
            }
            else if(totalDragonMark
                    > totalSlotMark){
                highScorer = "DRAGON";
            }else{
                highScorer = "SLOTH";
            }
            System.out.println(highScorer);
        }
    }

    public static String whoScoredMore(int dragon,int sloth){
        if(dragon == sloth){
            return "TIE";
        }else if(sloth>dragon){
            return "SLOTH";
        }else{
            return "DRAGON";
        }
    }
}
