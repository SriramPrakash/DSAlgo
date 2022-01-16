package homework.youtube.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EratosthenesSieve {

    public static void main(String[] args){
        int number = 31;
        int countOfPrimes = 0;
        int[] allNumber = new int[number];
        for(int i=2;i<allNumber.length;i++){
            allNumber[i]=1;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            for(int j=2*i;j<number;j+=i){
                allNumber[j]=0;
            }
        }
        countOfPrimes+= Arrays.stream(allNumber).reduce(0,Integer::sum);
        System.out.println(countOfPrimes);
    }
}
