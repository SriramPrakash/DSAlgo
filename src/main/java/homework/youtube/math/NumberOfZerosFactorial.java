package homework.youtube.math;

public class NumberOfZerosFactorial {

    public static void main(String[] args){
        int num =75;
        int countOfZero = 0;
        if(num<5){
            countOfZero = 0;
        }else{
            for(int i=5;i<=num;i=i+5) {
                int j = i;
                while (j % 5 == 0) {
                    countOfZero++;
                    j/=5;
                }
            }
        }
        System.out.println(countOfZero);
    }
}
