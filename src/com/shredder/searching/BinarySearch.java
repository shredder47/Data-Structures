package com.shredder.searching;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {20, 25, 30,  30, 50, 70, 80, 100};
        System.out.printf("Index ,  %s ", search(arr, 100));
        System.out.printf("Index ,  %s ", searchRecursive(100, 0,arr.length-1,arr));
    }
    //{20, 25, 30,  30, 50, 70, 80, 100}
    //  0   1   2   3   4   5   6    7
    public static int search(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int index = -1;

        while (start <= end) {

            int midPoint = (start + end) / 2;
            if (arr[midPoint] == value) {
                return midPoint;
            } else {
                if (arr[midPoint] < value) {
                    start = midPoint + 1;
                } else {
                    end = end - 1;
                }
            }
        }
        return index;
    }

    public static int searchRecursive(int searchValue, int start, int end, int[] arr) {

        System.out.println("\n[ "+ start + "..." + end + " ]");

        if (start > end) return -1;

        int midPoint = (start + end) / 2;

        if (arr[midPoint] == searchValue) {
            return midPoint;
        } else if (arr[midPoint] < searchValue) {
            return searchRecursive(searchValue, midPoint + 1, end, arr);
        } else {
            return searchRecursive(searchValue, start, midPoint - 1, arr);
        }
    }
}
