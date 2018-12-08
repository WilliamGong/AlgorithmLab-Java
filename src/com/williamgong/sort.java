package com.williamgong;

public class sort {
    private int aux[];

    public sort(int length) {
        aux = new int[length];
    }

    public void insect(int[] current) {
        int length = current.length;
        for(int i = 0;i < length; i++) {
            for(int j = i; j > 0 && current[j] < current[j - 1]; j--) {
                exchange(current, j, j - 1);
            }
        }
    }


    private void exchange(int[] current, int a, int b) {
        int temp = current[a];
        current[a] = current[b];
        current[b] = temp;
    }

}
