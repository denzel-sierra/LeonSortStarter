package edu.ujcv.progra1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] elementos = {29, 44, 30, 16, 1, 24,
                15, 20, 17, 36, 8};
        ShuffleSort shuffle_s = new ShuffleSort();
        BubleSort bubble_s = new BubleSort();
        MergeSort merge_s = new MergeSort();
        HeapSort heap_s = new HeapSort();
        QuickSort quicksort_s = new QuickSort();
        long bubble = bubble_s.sort(elementos);
        elementos = new  int[]{29, 44, 30, 16, 1, 24, 15, 20, 17, 36, 8};
        long merge = merge_s.sort(elementos);
        elementos = new  int[]{29, 44, 30, 16, 1, 24, 15, 20, 17, 36, 8};
        long heap = heap_s.sort(elementos);
        elementos = new  int[]{29, 44, 30, 16, 1, 24, 15, 20, 17, 36, 8};
        long quick = quicksort_s.sort(elementos);
        elementos = new  int[]{29, 44, 30, 16, 1, 24, 15, 20, 17, 36, 8};
        long shuffle = shuffle_s.sort(elementos);

        System.out.println(Arrays.toString(elementos));

        System.out.println("BubbleSort tarda "+ bubble + " nanosegundos");
        System.out.println("MergeSort tarda "+ merge + " nanosegundos");
        System.out.println("HeapSort tarda "+ heap+ " nanosegundos");
        System.out.println("Quicksort tarda "+ quick+ " nanosegundos");
        System.out.println("ShuffleSort tarda "+ shuffle+ " nanosegundos");

        long[] algoritmos = {bubble,merge,heap,quick,shuffle};
        Arrays.sort(algoritmos);

        if (algoritmos[0]==bubble){
            System.out.println("El algoritmo más rápido es BubbleSort");
        }
        if (algoritmos[0]==merge){
            System.out.println("El algoritmo más rápido es MergeSort");
        }
        if (algoritmos[0]==heap){
            System.out.println("El algoritmo más rápido es HeapSort");
        }
        if (algoritmos[0]==quick){
            System.out.println("El algoritmo más rápido es QuickSort");
        }
        if (algoritmos[0]==shuffle){
            System.out.println("El algoritmo más rápido es ShuffleSort?");
        }

    }

}
