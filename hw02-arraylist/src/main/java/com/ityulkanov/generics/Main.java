package com.ityulkanov.generics;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DIYArrayList diyArrayList = new DIYArrayList();
        for (int i = 0; i < 50; i++) {
            diyArrayList.add(new Date());

        }
        diyArrayList.remove(34);
        System.out.println(diyArrayList.get(0));
        System.out.println(diyArrayList.get(1));

        System.out.println("Testing what's up ");
    }
}
