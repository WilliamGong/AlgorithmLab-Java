package com.williamgong.sort;

public abstract class Sort {
    public abstract void sort(int[] current);
    protected void exchange(int[] current, int a, int b) {
        int temp = current[a];
        current[a] = current[b];
        current[b] = temp;
    }
}
