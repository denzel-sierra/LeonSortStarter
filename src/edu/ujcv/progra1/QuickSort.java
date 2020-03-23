package edu.ujcv.progra1;

public class QuickSort implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.currentTimeMillis();
        quicksort1(array);

        long end = System.currentTimeMillis();

        return end - start;
    }

    public void quicksort1(int[] arr){
        quicksort2(arr, 0, arr.length - 1);
    }
    public void quicksort2(int[] arr, int izq, int der){
        if(izq>=der)
            return;
        int i=izq, d=der;
        int pivote = izq;
        int temp = 0;
        while(izq!=der){
            while(arr[der]>=arr[pivote] && izq<der)
                der--;
            while(arr[izq]<arr[pivote] && izq<der)
                izq++;
            if(der!=izq){
                temp = arr[der];
                arr[der]=arr[izq];
                arr[izq]=temp;
            }
        }
        quicksort2(arr,i,izq-1);
        quicksort2(arr,izq+1,d);
    }
}
