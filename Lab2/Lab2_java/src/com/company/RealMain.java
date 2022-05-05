package com.company;

import java.util.Random;

public class RealMain extends FindMain{
    public void RealMain() throws java.lang.Exception
    {
        int[] arr = new int[100000000];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt();
        }
        FindMain(arr, 1);
        FindMain(arr, 2);
        FindMain(arr, 3);
        FindMain(arr, 8);
        FindMain(arr, 9);
    }
}
