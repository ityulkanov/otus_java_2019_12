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
        System.out.println("\n----- Adding elements into collection via addAll method: -----");
        Collections.addAll(diyArray, " sample", " sample1", " sample2");
        printArray(diyArray);
        System.out.println("\n----- Removing elements from collection ----- ");
        for (int i = 0; i < 3; i++) {
            diyArray.remove(diyArray.size() - 1);
            System.out.println("\nElement has been removed");
            printArray(diyArray);
        }

        System.out.println("\n ----- Copying one collection into another -----");
        Collections.copy(diyDestArray, diyArray);
        printArray(diyDestArray);

        System.out.println("\n ----- Sorting collection: -----");
        Collections.sort(diyArray, null);
        printArray(diyArray);
        System.out.println("\n");
    }

    private static void printArray(DiyArray diyArray) {
        for (int i = 0; i < diyArray.size(); i++) {
            System.out.print(diyArray.get(i));
        }
    }
}
