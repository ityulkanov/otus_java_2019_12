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

        Collections.addAll(diyArray, "sample", "andotherSempla", "see how ti works");
        Collections.copy(diyDestArray, diyArray);
        Collections.sort(diyArray, null);
    }
}
