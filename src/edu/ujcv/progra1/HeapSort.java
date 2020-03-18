package edu.ujcv.progra1;

public class HeapSort implements SortTester {
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        heapSort(array);

        long end = System.nanoTime();

        return end - start;
    }

    public static void heapSort(int[] array) {
        for (int i = array.length/2 - 1; i >= 0; i--)
            hacerHeap(array, array.length, i);
        for (int i=array.length-1; i>=0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            hacerHeap(array, i, 0);
        }
    }

    private static void hacerHeap(int[] array, int n, int i) {
        int mayor = i;
        int izquierda = 2*i + 1;
        int derecha = 2*i + 2;
        if (izquierda < n && array[izquierda] > array[mayor])
            mayor = izquierda;
        if (derecha < n && array[derecha] > array[mayor])
            mayor = derecha;
        if (mayor != i)
        {
            int swap = array[i];
            array[i] = array[mayor];
            array[mayor] = swap;
            hacerHeap(array, n, mayor);
        }
    }

}
