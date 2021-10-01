package org.robert.c130.assessments;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] percentages = getRandomPercentages();

        System.out.print("What is your dog's name?: ");
        String dogName = scanner.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background" +
                " right here.\n\n" + dogName + " is:\n");
        System.out.println(percentages[0] + "% St. Bernard");
        System.out.println(percentages[1] + "% Chihuahua");
        System.out.println(percentages[2] + "% Dramatic RedNosed Asian Pug");
        System.out.println(percentages[3] + "% Common Cur");
        System.out.println(percentages[4] + "% King Doberman");
    }

    private static int[] getRandomPercentages() {
        // Method that creates 5 random integers that sum to 100
        Random random = new Random();
        double[] percentages = new double[5];
        int[] percentagesRounded = new int[5];
        for (int i=0; i<percentages.length; i++) {
            percentages[i] = random.nextDouble();
        }
        double sum = percentages[0] + percentages[1] + percentages[2] + percentages[3] + percentages[4];

        for (int i=0;i<percentages.length;i++) {
            percentages[i] = percentages[i] * 100 / sum;
            percentagesRounded[i] = (int) Math.round(percentages[i]);
        }
        percentagesRounded[percentagesRounded.length - 1] = 100 - (percentagesRounded[0] + percentagesRounded[1]
                + percentagesRounded[2] + percentagesRounded[3]);
        return percentagesRounded;
    }
}
