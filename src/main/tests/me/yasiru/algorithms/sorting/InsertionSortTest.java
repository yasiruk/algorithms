package me.yasiru.algorithms.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wik2kassa on 1/20/2016.
 */
public class InsertionSortTest {
    @Test
    public void ascendingSortTest() {
        Integer arr[] = new Integer[4];
        arr[0] = 45;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 6;
        InsertionSort<Integer> insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            assert arr[i-1] <= arr[i];
        }
    }
    @Test
    public void decendingSortTest() {
        Integer arr[] = new Integer[4];
        arr[0] = 45;
        arr[1] = 5;
        arr[2] = 5;
        arr[3] = 6;
        InsertionSort<Integer> insertionSort = new InsertionSort();
        insertionSort.sort(arr,false);
        for (int i = 1; i < arr.length; i++) {
            assert arr[i-1] >= arr[i];
        }
    }
}