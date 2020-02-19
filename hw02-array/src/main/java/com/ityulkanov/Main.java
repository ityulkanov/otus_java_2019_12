package com.ityulkanov;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        DiyArray diyArray = new DiyArray<>();
        DiyArray diyDestArray = new DiyArray<>();
        String sampleStirng = Constants.SAMPLE_STRING;
        for (int i = 0; i < sampleStirng.length(); i++) {
            diyArray.add((Character.toString(sampleStirng.charAt(i))));
        }
        String sampleSecondString = Constants.SAMPLE_SECOND_STRING;
        for (int i = 0; i < sampleSecondString.length(); i++) {
            diyDestArray.add(Character.toString(sampleSecondString.charAt(i)));

        }

        Collections.addAll(diyArray, " sample", " sample1", " sample2");
        printArray(diyArray);
        for (int i = 0; i < 3; i++) {
            diyArray.remove(diyArray.size() - 1);
            System.out.println("\nElement has been removed");
            printArray(diyArray);
        }

        Collections.copy(diyDestArray, diyArray);
        printArray(diyDestArray);
        Collections.sort(diyArray, null);
    }

    private static void printArray(DiyArray diyArray) {
        for (int i = 0; i < diyArray.size(); i++) {
            System.out.print(diyArray.get(i));
        }
    }
}
