package com.company;

import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int storageSize = 3;
        int itemNumbers = 20;
        main.starter(storageSize, itemNumbers, 2, 5);
    }
    private void starter(int storageSize, int itemNumbers, int producers, int consumers) {
        Manager manager = new Manager(storageSize);

        for(int i = 0; i < producers; i++) {
            new Producer(i * itemNumbers / producers, (i + 1) * itemNumbers / producers, manager);
        }

        for(int i = 0; i < consumers; i++) {
            new Consumer((i + 1) * itemNumbers / consumers - i * itemNumbers / consumers, manager);
        }
    }
}


