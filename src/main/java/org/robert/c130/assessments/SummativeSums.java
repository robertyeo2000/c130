package org.robert.c130.assessments;

import org.robert.c130.basics.Factoriser;

public class SummativeSums {

    public static void main(String[] args) {
        int[][] array = {{ 1, 90, -33, -55, 67, -16, 28, -55, 15 }, { 999, -60, -77, 14, 160, 301 },
                { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 }};


        for (int i=0; i<3; i++)
        System.out.println("#" + i + " Array Sum: " + sumArray(array[i]));
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
