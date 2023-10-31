package com.bootcamp.day02;


public class IntroArray {
    public static void main(String[] args) {
        initArray();

        int[] nums = new int[]{12,15,1,5,20};

       /*  Arrays.sort(nums);
        
        System.out.println(nums[nums.length-1]);

        System.out.println(sumArray(nums));
        System.out.println(displayMax(nums)); */

        printArrayInt(shifting(nums));

    }

    static int[] shifting(int[] values){
        int temp = values[0];
        for (int i = 1; i < values.length; i++) {
            values[i-1]=values[i];
        }

        values[values.length-1] = temp;

        return values;   
    }

    static void printArrayInt(final int[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+" ");
        }
    }

    static int displayMax(final int[] values){
        int max =values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max)
                max = values[i];
        }
        return max;
    }

    static int sumArray(final int[] values){
        int sum =0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }



    static void initArray(){
        int[] myNums = new int[5];
        myNums[0] =1;

        String[] programs = new String[]{"java","dotnet"};
        String[] students ={"widi","yuli","rini"};
        //students[3] = "Agus";

        printArrayString(programs);
        printArrayString(students);

    }

    static void printArrayString(final String[] values){
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+" ");
        }
    }
}
