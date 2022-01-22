package com.levelup.ib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Water {

    public static void main(String[] args){
        ArrayList<Integer> ai = new ArrayList<>();
        ai.add(1);
        ai.add(20);
        ai.add(20);
        ai.add(1);
        System.out.println(maxArea(ai));
    }

    private static int maxArea(ArrayList<Integer> A) {
        int left=0,right = A.size()-1,area=0;
        while(left<right){
            area = Math.max(area,Math.min(A.get(left),A.get(right))*(right-left));
            if(A.get(left)<A.get(right)) right--;
            else left++;
        }
        return area;
    }
}
