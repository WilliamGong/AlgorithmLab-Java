package com.williamgong.algorithm.sort;

public class InsertSort extends Sort{
    public void sort(int[] current) {
        int length = current.length;
        for(int i = 0; i < length; i++) {
            for(int j = i; j > 0; j--) {
                if(current[j] < current[j - 1]) {
                    exchange(current, j, j - 1);
                }
            }
        }
    }
}
