package com.bootcamp.day01;

public class Problem01 {

    public static void main(String[] args) {
        printBox(6);
        patternA(6);
        patternB(6);
    }

    static void printBox(final int n){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patternA(final int n){
        //outer loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i +1; j++) {
                System.out.print("* ");
            }
            //pindah baris
            System.out.println();
        }
    }

    static void patternB(final int n){
        //outer loop
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            //pindah baris
            System.out.println();
        }
    }


}
