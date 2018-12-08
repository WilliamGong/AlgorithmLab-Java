package com.williamgong;

public class testAux {
    public static void  initRandomArray(int[] current, int range) {
        for(int i = 0; i < current.length; i++) {
            current[i] = (int) (Math.random() * range);
        }
    }
}
