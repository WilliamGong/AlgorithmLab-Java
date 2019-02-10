package com.williamgong;

import com.williamgong.test_case.SortTestCase;

public class Main {

    public static void main(String[] args) {
        SortTestCase testInsert = new SortTestCase(20, 100, "insert");
        SortTestCase testShell = new SortTestCase(20, 100, "shell");
        SortTestCase testMergeUp = new SortTestCase(20, 100, "mergeUp");

        //insert sort
        System.out.println("Insert sort:");
        testInsert.arrayInfo();
        testInsert.process();
        testInsert.arrayInfo();

        //shell sort
        System.out.println("Shell sort");
        testShell.arrayInfo();
        testShell.process();
        testShell.arrayInfo();

        //Merge sort(up to down)
        System.out.println("Merge sort (up to down)");
        testMergeUp.arrayInfo();
        testMergeUp.process();
        testMergeUp.arrayInfo();

    }
}
