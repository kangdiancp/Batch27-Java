package com.bootcamp.day01;

public class Problem02 {
    public static void main(String[] args) {
        extractDigit(1245);
        extractDigit(1249875);
        int count = countDigit(12374632);
        System.out.println("Total Digit : "+count);
    }

    static void extractDigit(final int startValue){
        //1245 % 10 ==  5
        //1245/10 = 124
        int sisa = startValue;
        while (sisa > 0){
            int digit = sisa %10;
            System.out.println(digit);
            sisa = sisa/10;
        }
    }

    static int countDigit(final int digits){
        //default return
        int count =0;
        int sisa = digits;
        while(sisa > 0){
            sisa = sisa /10;
            count++;
        }

        return count;
    }


}
