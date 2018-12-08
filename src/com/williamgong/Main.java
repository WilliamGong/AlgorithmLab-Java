package com.williamgong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testSort(10, 100);
    }

    public static void testSort(int length, int range) {
        //init
        int testArray[] = new int[length];
        testAux.initRandomArray(testArray, range);
        sort current = new sort(length);

        System.out.println("Origin rank is:");
        for (int i = 0; i < length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.print("\n");
        System.out.println("insect sort");
        current.insect(testArray);

        System.out.println("result is:");
        for (int i = 0; i < length; i++) {
            System.out.print(testArray[i] + " ");
        }
    }

}
