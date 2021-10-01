package org.robert.c130.assessments;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age?: ");
        int age = scanner.nextInt();
        int maxHeartRate = calculateMaxHeartRate(age);
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        String targetHeartRateZone = calculateTargetHeartRateZone(maxHeartRate);
        System.out.println("Your target HR Zone is " + targetHeartRateZone + " beats per minute");
    }

    private static int calculateMaxHeartRate(int age) {
        return 220 - age;
    }

    private static String calculateTargetHeartRateZone(int maxHeartRate) {
        int min = maxHeartRate/2;
        int max = (int) Math.round(maxHeartRate*0.85);
        return min + " - " + max;
    }
}
