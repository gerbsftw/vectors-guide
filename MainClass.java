package com.callmegerbs;

public class MainClass {
    public static void main(String[] args) {
        int[] array = new int[20];

        // manual
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        System.out.println(array[0] + ", " + array[1] + ", " + array[2]);

        // automated
        for (int i = 0; i < 5; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

        // method
        System.out.println(sumOfArray(array));
    }

    public static int sumOfArray(int[] vector) {
        int sum = 0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i];
        }

        return sum;
    }
}
