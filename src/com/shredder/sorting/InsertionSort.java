package com.shredder.sorting;

import java.util.Arrays;

// Algo explained at -> https://youtu.be/lCDZ0IprFw4
/*
    [40, 30, 20, 60, 10, 1100, 60]
    -----
    [30, 40, 20, 60, 10, 1100, 60]
    [30, 20, 40, 60, 10, 1100, 60]
    -----
    [20, 30, 40, 60, 10, 1100, 60]
    [20, 30, 40, 60, 10, 1100, 60]
    [20, 30, 40, 60, 10, 1100, 60]
    -----
    [20, 30, 40, 60, 10, 1100, 60]
    [20, 30, 40, 10, 60, 1100, 60]
    [20, 30, 10, 40, 60, 1100, 60]
    [20, 10, 30, 40, 60, 1100, 60]
    -----
    [10, 20, 30, 40, 60, 1100, 60]
    [10, 20, 30, 40, 60, 1100, 60]
    [10, 20, 30, 40, 60, 1100, 60]
    [10, 20, 30, 40, 60, 1100, 60]
    [10, 20, 30, 40, 60, 1100, 60]
    -----
    [10, 20, 30, 40, 60, 1100, 60]
    [10, 20, 30, 40, 60, 60, 1100]
    [10, 20, 30, 40, 60, 60, 1100]
    [10, 20, 30, 40, 60, 60, 1100]
    [10, 20, 30, 40, 60, 60, 1100]
    [10, 20, 30, 40, 60, 60, 1100]
    -----
*/
public class InsertionSort {
    public static void main(String[] args) {

        int[] arr1 = new int[]{40, 30, 20, 60, 10, 1100, 60};
        int[] arr2 = new int[]{40, 30, 20, 60, 10, 1100, 60};

        System.out.println(Arrays.toString(insertionSort(arr1)));
        System.out.println(Arrays.toString(insertionSort2(arr2)));
    }

    public static int[] insertionSort(int[] arr) {
        //The sort index must stop before the last element
        for (int sortEndIdx = 0; sortEndIdx < arr.length - 1; sortEndIdx++) {
            //Element outside Sorted Zone
            int elem = arr[sortEndIdx + 1];

            for (int i = sortEndIdx; i >= 0; i--) {
                // First element outsize the sorted zone is tested every time so that if its lesser then its swapped, so that sorted item is
                // pushed to the sorted zone, and when it comes to sorted zone, its rearranged again for best position
                if (elem < arr[i]) {
                    arr[i + 1] = arr[i];
                    arr[i] = elem;
                }
            }
        }

        return arr;
    }

    public static int[] insertionSort2(int[] arr) {

        for (int sortEndIdx = 0; sortEndIdx < arr.length - 1; sortEndIdx++) {
            //Element outside Sorted Zone
            int elem = arr[sortEndIdx + 1];
            int j = sortEndIdx;

            while (j >= 0 && arr[j] > elem) {
                arr[j + 1] = arr[j];
                arr[j] = elem;
                j--;
            }
        }
        return arr;
    }


}
