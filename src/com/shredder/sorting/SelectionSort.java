package com.shredder.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 5, 2, 7, 9, 4, 0, 100};
        int[] arrSorted = selectionSort(arr);

        Arrays.stream(arrSorted).forEach(System.out::println);

    }

    public static int[] selectionSort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {

            int minIdx = i;

            //Get min value's indexPosition
            // Therefore, start check all elements after the i pointer and get the min index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Get current Value from i and swap it with the min IDX value.
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }
}
