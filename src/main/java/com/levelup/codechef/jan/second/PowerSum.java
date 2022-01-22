package com.levelup.codechef.jan.second;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class PowerSum {

    public static int power(int p){
        p=p-1;
        while((p&p-1)!=0){
            p=p&p-1;
        }
        return p<<1;
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int z = 0; z < testCases; z++) {
            int p=in.nextInt();
            int[] a = new int[p];
            int[] b = new int[p];
            int i,j=0,min=0,k=0,c=1,s=0,ans=0,m=0;
            for(i=0;i<p;i++){
                a[i]=in.nextInt();
                b[i]=a[i];
                s=s+a[i];
            }
            Arrays.sort(b);
            m=power(s);
            min=b[0];
            s-=min;
            ans=s;
            c=(m-s)/min;
            if(c==1){
                System.out.println("0");
            }else{
                System.out.println("1");
                System.out.println("1 "+c);
                int index = Arrays.binarySearch(a,min);
                System.out.println(index);
            }
        }
    }
}
