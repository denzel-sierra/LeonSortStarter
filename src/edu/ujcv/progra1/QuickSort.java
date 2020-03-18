package edu.ujcv.progra1;

import java.util.ArrayList;

public class QuickSort implements SortTester{
    @Override
    public long sort(int[] array) {
        long start = System.nanoTime();
        quicksort(array);

        long end = System.nanoTime();

        return end - start;
    }

    int[] quicksort(int[] arr)
    {
        ArrayList<Integer> izquierda = new ArrayList<>();
        ArrayList<Integer> derecha = new ArrayList<>();
        int pivote = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<pivote){
                izquierda.add(arr[i]);
            }else{
                derecha.add(arr[i]);
            }
        }
        int[] ordenado = new int[izquierda.size()+derecha.size()+1];
        System.arraycopy(izquierda.toArray(), 0, ordenado, 0, izquierda.toArray().length-1);
        System.arraycopy(derecha.toArray(),0,ordenado,izquierda.toArray().length,ordenado.length-1);
        return ordenado;
    }
}
