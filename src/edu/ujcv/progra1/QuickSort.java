package edu.ujcv.progra1;

public class QuickSort implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        quicksort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    private void quicksort(int[] array) {
    }
}
