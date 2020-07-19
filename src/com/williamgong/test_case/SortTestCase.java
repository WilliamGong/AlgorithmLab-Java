package com.williamgong.test_case;

import com.williamgong.algorithm.sort.InsertSort;
import com.williamgong.algorithm.sort.MergeUp;
import com.williamgong.algorithm.sort.ShellSort;

public class SortTestCase {
    private int[] testArray;
    private String mode;

    public SortTestCase(int length, int range, String mode) {
        this.mode = mode;
        testArray = new int[length];
        for(int i = 0; i < length; i++) {
            testArray[i] = (int)(Math.random() * range);
        }
    }

    public void arrayInfo() {
        System.out.println("the member in array are");
        for (int i = 0; i < this.testArray.length; i++) {
            System.out.print(this.testArray[i] + " ");
        }
        System.out.print("\n");
    }

    public void process() {
       if (this.mode.equals("insert")) {
           InsertSort test = new InsertSort();
           test.sort(testArray);
       }else if (this.mode.equals("shell")) {
           ShellSort test = new ShellSort();
           test.sort(testArray);
       }else if (this.mode.equals("mergeUp")) {
           MergeUp test = new MergeUp();
           test.sort(this.testArray);
       } else {
           System.out.println("No such mode");
       }
    }
}
