package com.bootcamp.day01;

public class Problem04 {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        showPrimeNumber(15);
    }

    static void showPrimeNumber(final int n){
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(final int n){
        for (int i = 2; i < n ; i++) {
            if (n % i == 0)
                return false;
        }

        //default return
        return true;
    }
}

