package com.enumswrapper.records;

public class SelectionSort {
    public static void selectionSort(int[] numbersList) {
        int n = numbersList.length;
        for (int i = 0; i < n - 1; i++) {
            int mixIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (numbersList[j] < numbersList[mixIndex]) {
                    mixIndex = j;
                }
            }
            int temp = numbersList[mixIndex];
            numbersList[mixIndex] = numbersList[i];
            numbersList[i] = temp;
        }
    }

}
