package com.mimi;

import java.util.Random;

public class BubbleSort {

    public static void main(String[] args) {
        Random r = new Random();
        int size = 20;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.println(arr[i]);
        }

        System.out.println("=============");
        bubbleSort(1, arr, 0, 10);
        bubbleSort(0, arr, 10, size);
    }

    private static void bubbleSort(int ascending, int[] arr, int i, int length) {
        for (int j = i; j < length - 2; j++) {
            for (int k = length-1; k > j; k--) {
                if (ascending == 1) {
                    if (arr[k]<arr[k-1])
                        swap(arr, k);
                } else {
                    if (arr[k]>arr[k-1])
                        swap(arr, k);
                }
            }
        }
        for (int j = i; j < length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("=============");
    }

    private static void swap(int[] arr, int k) {
        int t = arr[k];
        arr[k] = arr[k -1];
        arr[k -1] = t;
    }

}

/*
59
71
87
69
91
54
63
12
93
74
*/