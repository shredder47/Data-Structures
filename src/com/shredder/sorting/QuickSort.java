package com.shredder.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 7, 1, 3, 5, 8, 9, 6,43,456523,465,67,233,4,632,632,987,123,56,2,3,51,68,23,7,94542,3245,78,6598,23};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));


    }
    //In-place Sorting
    public static void quickSort(int[] arr, int start, int end) {

        if (start < end) {

            int pivot = pivot(arr, start, end);

            //Left Part of Pivot
            quickSort(arr, start, pivot - 1);

            //Right Part of Pivot
            quickSort(arr, pivot + 1, end);
        }

    }

    private static int pivot(int[] arr, int start, int end) {

        //Consider end as initial pivot val
        int pivotVal = arr[end];

        //The pointer that moves every time to compare current val against pivotVal
        int i = start;

        //The pointer that only moves if condition where ith val <= pivotVal is met
        int j = start - 1;

        while (i <= end) {

            int currentVal = arr[i];

            if (currentVal <= pivotVal) {

                //Move j pointer one step ahead
                j++;

                //nd get its value
                int jValue = arr[j];

                //Swap what jValue with currentValue
                arr[j] = currentVal;
                arr[i] = jValue;
            }
            //After any operation , move the i Pointer one step ahead and repeat
            i++;
        }

        return j;

    }
}
