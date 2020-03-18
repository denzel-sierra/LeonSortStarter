package edu.ujcv.progra1;

import java.util.ArrayList;

public class QuickSort implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        quicksort1(array);

        long end = System.nanoTime();

        return end - start;
    }

    public int[] quicksort1(int[] arr){
        return quicksort2(arr,0,arr.length-1);
    }
    public int[] quicksort2(int[] arr, int izq, int der){
        if(izq>=der)
            return arr;
        int i=izq, d=der;
        if(izq!=der){
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
            if(izq==der){
                quicksort2(arr,i,izq-1);
                quicksort2(arr,izq+1,d);
            }
        }
        else
            return arr;
        return arr;
    }
}
