package edu.ujcv.progra1;

public class QuickSort implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        quicksort(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public void quicksort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        quicksort(arr, 0, arr.length - 1);
    }

    public void quicksort(int[] arr, int izquierda, int derecha) {
        int pivote = arr[izquierda + (derecha - izquierda) / 2];
        int izq = izquierda;
        int der = derecha;
        while (izq <= der) {
            while (arr[izq] < pivote) {
                izq++;
            }
            while (arr[der] > pivote) {
                der--;
            }
            if (izq <= der) {
                int temp=arr[izq];
                arr[izq]=arr[der];
                arr[der]=temp;;
                izq++;
                der--;
            }
        }

        if(izquierda < der)
            quicksort(arr,izquierda,der);
        if(izq < derecha)
            quicksort(arr,izq,derecha);
    }
}
