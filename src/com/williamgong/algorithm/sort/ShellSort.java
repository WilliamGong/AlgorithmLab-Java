package com.williamgong.algorithm.sort;

public class ShellSort extends Sort{

    @Override
    public void sort(int[] current) {
        int length = current.length;
        int increment = 1;
        while (increment < length / 3) {
            increment = increment * 3 + 1;
        }
        while (increment >= 1) {
            for(int i = increment; i < length; i++) {
                for (int j = i; j >= increment; j -= increment) {
                    if(current[j] < current[j - increment]) {
                        exchange(current, j, j - increment);
                    }
                }
            }
            increment /= 3;
        }
    }
}
