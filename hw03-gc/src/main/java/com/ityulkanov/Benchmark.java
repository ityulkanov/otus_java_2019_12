package com.ityulkanov;

import java.util.ArrayList;
import java.util.List;

public class Benchmark implements BenchmarkMBean {

    private final int loopCounter;
    private volatile int size = 0;


    public Benchmark(int loopCounter) {
        this.loopCounter = loopCounter;
    }

    void run() throws InterruptedException {
        for (int idx = 0; idx < loopCounter; idx++) {
            int local = size;
            for (int i = 0; i < local-1; i++) {
                int[] array = new int[size];
                size = size + 10000;
            }
            Thread.sleep(100);
            if(loopCounter % 100 == 0) {
                System.out.println("Available memory (in bytes): " + Runtime.getRuntime().freeMemory());
            }

        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        System.out.println("new size " + size);
        this.size = size;
    }
}
