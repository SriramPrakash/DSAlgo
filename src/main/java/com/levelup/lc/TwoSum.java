package com.levelup.lc;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TwoSum {

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{11,9,7,2}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int start=0,end=1;
        int[] returnedNum = new int[2];
        while(start<end){
            if(nums[start]>=target){
                start=end;
                end+=1;
            }
            if(nums[end]>target){

            }
            if(nums[start]+nums[end]==target){
                returnedNum[0]=start;
                returnedNum[1]=end;
                break;
            }
        }
        return returnedNum;
    }
}
