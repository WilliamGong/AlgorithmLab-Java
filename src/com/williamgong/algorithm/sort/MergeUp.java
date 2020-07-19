package com.williamgong.algorithm.sort;

public class MergeUp extends Sort{
    @Override
    public void sort(int[] current) {
        int length = current.length;
        aux = new int[length];

        int start = 0, end = length - 1;
        mergeUp(current, start, end);
    }

    private void mergeUp(int[] current, int start, int end) {
        int mid = (start + end) / 2;

        if (start >= end)
            return;
        mergeUp(current, start, mid);
        mergeUp(current, mid + 1, end);
        merge(current, aux, start, mid, end);
    }
}
