package com.levelup.codechef.jan.second;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CryingColor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int countOfBall = in.nextInt();
            int numberOfMoves = 0;
            in.nextLine();
            List<Integer> redDistribution = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> greenDistribution = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> blueDistribution = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            numberOfMoves = Math.min(redDistribution.get(1),greenDistribution.get(0));
            int n1 = Math.abs(redDistribution.get(1)-greenDistribution.get(0));
            numberOfMoves += Math.min(n1+redDistribution.get(2),blueDistribution.get(0));
            int n2 = Math.abs(n1+redDistribution.get(2)-blueDistribution.get(0));
            numberOfMoves += Math.min(n2+greenDistribution.get(2),blueDistribution.get(1));
            int n3 = Math.abs(n2+greenDistribution.get(2)-blueDistribution.get(1));
            numberOfMoves += n3;
            System.out.println(numberOfMoves);
        }
    }
}
