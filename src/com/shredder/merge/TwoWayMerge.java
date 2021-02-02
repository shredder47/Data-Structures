package com.shredder.merge;

import java.util.Arrays;

public class TwoWayMerge {

    // 1 3 5 7 9 | 2 4 6 8 10

    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 3, 5, 7, 9};
        int[] arr2 = new int[]{2, 4, 6, 8, 10};

        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int arr1Size = arr1.length;
        int arr2Size = arr2.length;

        int[] sortedArr = new int[arr1Size + arr2Size];

        int arr1Pointer = 0;
        int arr2Pointer = 0;
        int sortedArrPointer = 0;


        while ((arr1Pointer < arr1Size) && (arr2Pointer < arr2Size)) {
            //
            if (arr1[arr1Pointer] < arr2[arr2Pointer]) {
                sortedArr[sortedArrPointer++] = arr1[arr1Pointer++];
            } else {
                sortedArr[sortedArrPointer++] = arr2[arr2Pointer++];
            }
        }

        for(;arr1Pointer<arr1Size;arr1Pointer++){
            sortedArr[sortedArrPointer++] = arr1[arr1Pointer];
        }

        for(;arr2Pointer<arr2Size;arr2Pointer++){
            sortedArr[sortedArrPointer++] = arr2[arr2Pointer];
        }

        return sortedArr;
    }

    public static int[] merge2(int[] arr1, int[] arr2) {

        int arr1Size = arr1.length;
        int arr2Size = arr2.length;

        int[] sortedArr = new int[arr1Size + arr2Size];

        int arr1Pointer = 0;
        int arr2Pointer = 0;
        int sortedArrPointer = 0;


        while ((arr1Pointer < arr1Size) && (arr2Pointer < arr2Size)) {
            //
            if (arr1[arr1Pointer] < arr2[arr2Pointer]) {
                sortedArr[sortedArrPointer++] = arr1[arr1Pointer++];
            } else {
                sortedArr[sortedArrPointer++] = arr2[arr2Pointer++];
            }
        }

        for(;arr1Pointer<arr1Size;arr1Pointer++){
            sortedArr[sortedArrPointer++] = arr1[arr1Pointer];
        }

        for(;arr2Pointer<arr2Size;arr2Pointer++){
            sortedArr[sortedArrPointer++] = arr2[arr2Pointer];
        }

        return sortedArr;
    }




}
