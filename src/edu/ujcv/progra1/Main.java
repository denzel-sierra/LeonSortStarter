package edu.ujcv.progra1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] elementos = {29, 44, 30, 16, 1, 24,
                15, 20, 17, 36, 8};
        System.out.println("Arreglo a ordenar: " + Arrays.toString(elementos));

        BubleSort bubble_s = new BubleSort();
        long bubble = bubble_s.sort(elementos);
        System.out.println("BubbleSort tarda "+ bubble + " nanosegundos");
        elementos = new  int[]{29, 44, 30, 16, 1, 24, 15, 20, 17, 36, 8};

        MergeSort merge_s = new MergeSort();
        long merge = merge_s.sort(elementos);
        System.out.println("MergeSort tarda "+ merge + " nanosegundos");
        elementos = new  int[]{29, 44, 30, 16, 1, 24, 15, 20, 17, 36, 8};

        HeapSort heap_s = new HeapSort();
        long heap = heap_s.sort(elementos);
        System.out.println("HeapSort tarda "+ heap+ " nanosegundos");
        elementos = new  int[]{29, 44, 30, 16, 1, 24, 15, 20, 17, 36, 8};

        QuickSort quicksort_s = new QuickSort();
        long quick = quicksort_s.sort(elementos);
        System.out.println("Quicksort tarda "+ quick+ " nanosegundos");
        elementos = new  int[]{29, 44, 30, 16, 1, 24, 15, 20, 17, 36, 8};

/*        ShuffleSort shuffle_s = new ShuffleSort();
        long shuffle = shuffle_s.sort(elementos);
        System.out.println("ShuffleSort tarda "+ shuffle+ " nanosegundos");*/

        long[] algoritmos = {bubble,merge,heap,quick};
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
/*        if (algoritmos[0]==shuffle){
            System.out.println("El algoritmo más rápido es ShuffleSort?");
        }*/


    }

}
