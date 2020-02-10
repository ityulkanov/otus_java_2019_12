package com.ityulkanov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DIYArray diyArray = new DIYArray<>();
        DIYArray diyDestArray = new DIYArray<>();
        List list = new ArrayList();
        list.listIterator();
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
