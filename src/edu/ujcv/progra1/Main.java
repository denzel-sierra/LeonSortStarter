package edu.ujcv.progra1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] elementos = {29, 44, 30, 16, 1, 24,
                4, 18, 5, 3, 40, 11, 37, 34, 32,
                15, 20, 17, 36, 8};
        ShuffleSort shuffle_s = new ShuffleSort();
        BubleSort bubble_s = new BubleSort();
        MergeSort merge_s = new MergeSort();
        HeapSort heap_s = new HeapSort();
        QuickSort quicksort_s = new QuickSort();

        System.out.println(Arrays.toString(elementos));

        System.out.println("BubbleSort tarda "+ bubble_s.sort(elementos) + " nanosegundos");
        System.out.println("MergeSort tarda "+ merge_s.sort(elementos)+ " nanosegundos");
        System.out.println("HeapSort tarda "+ heap_s.sort(elementos)+ " nanosegundos");
        System.out.println("Quicksort tarda "+ quicksort_s.sort(elementos)+ " nanosegundos");
        System.out.println("ShuffleSort tarda "+ shuffle_s.sort(elementos)+ " nanosegundos");
        System.out.println("El algoritmo más rápido es " + compararAlgoritmos(elementos));
    }

    private static String compararAlgoritmos(int[] arr) {
        ShuffleSort shuffle_s = new ShuffleSort();
        BubleSort bubble_s = new BubleSort();
        MergeSort merge_s = new MergeSort();
        HeapSort heap_s = new HeapSort();
        QuickSort quicksort_s = new QuickSort();
        long[] algoritmos = {bubble_s.sort(arr), merge_s.sort(arr), heap_s.sort(arr), quicksort_s.sort(arr)};
        Arrays.sort(algoritmos);
        if (algoritmos[0]==bubble_s.sort(arr)){
            return "BubbleSort";
        }
        if (algoritmos[0]==merge_s.sort(arr)){
            return "MergeSort";
        }
        if (algoritmos[0]==heap_s.sort(arr)){
            return "HeapSort";
        }
        if (algoritmos[0]==quicksort_s.sort(arr)){
            return "QuickSort";
        }
        if (algoritmos[0]==shuffle_s.sort(arr)){
            return "ShuffleSort";
        }
        return "";
    }
}
