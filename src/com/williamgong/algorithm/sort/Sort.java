package com.williamgong.algorithm.sort;

public abstract class Sort {
    protected int[] aux;

    public abstract void sort(int[] current);
    protected void exchange(int[] current, int a, int b) {
        int temp = current[a];
        current[a] = current[b];
        current[b] = temp;
    }

    protected void merge(int[] current, int[] aux, int start, int mid, int end) {
        int i = start, j = mid + 1, k = start;  //i used to left, j used  to right, k used to aux
        while (i <= mid && j <= end) {
            if (current[i] < current[j]) {
                aux[k] = current[i];
                k++;
                i++;
            }else {
                aux[k] = current[j];
                k++;
                j++;
            }
        }

        while (i <= mid) {
            aux[k++] = current[i++];
        }
        while (j <= end) {
            aux[k++] = current[j++];
        }

        //put aux[] in the current range of current[]
        if (end + 1 - start >= 0) System.arraycopy(aux, start, current, start, end + 1 - start);
    }
}
