package com.bootcamp.day01;

public class Problem05 {
    public static void main(String[] args) {
       // fiboVar(10);
        fiboArray(10);
    }

    static void fiboArray(final int maxNumber){
        //initial array
        int array[] = new int[maxNumber];
        array[0] =0;
        array[1]=1;

        for (int i = 2; i < maxNumber; i++) {
            array[i] = array[i-1]+ array[i-2];
        }

        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }

    // use sliding door pattern
    static void fiboVar(final int maxNumber){
        int first =0;
        int second =1;
        int fib =1;

        for (int i = 0; i <= maxNumber; i++) {
            System.out.print(fib + " ");
            fib = first + second;
            first = second;
            second = fib;
        }
    }
}
