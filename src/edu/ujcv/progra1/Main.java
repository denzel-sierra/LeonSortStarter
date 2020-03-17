package edu.ujcv.progra1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] elementos = {2797, 971, 3436, 6250, 221, 6893, 3373, 7343, 205, 2986, 9122, 8594, 469, 8753, 3387, 8446, 2027, 4581, 6235, 7186, 5124, 7052, 3318, 3290, 6975, 935, 8926, 1027, 1342, 901, 89, 4829, 5073, 2380, 9259, 3441, 4607, 1815, 8428, 2650, 1855, 7826, 154, 6125, 9963, 7308, 7531, 9307, 81, 6919};
        ShuffleSort shuffle_s = new ShuffleSort();
        BubleSort bubble_s = new BubleSort();
        MergeSort merge_s = new MergeSort();
        HeapSort heap_s = new HeapSort();
        QuickSort quicksort_s = new QuickSort();

        System.out.println(Arrays.toString(elementos));

        System.out.println("ShuffleSort tarda "+ shuffle_s.sort(elementos)+ " milisegundos");
        System.out.println("BubbleSort tarda "+ bubble_s.sort(elementos)+ " milisegundos");
        System.out.println("MergeSort tarda "+ merge_s.sort(elementos)+ " milisegundos");
        System.out.println("HeapSort tarda "+ heap_s.sort(elementos)+ " milisegundos");
        System.out.println("Quicksort tarda "+ quicksort_s.sort(elementos)+ " milisegundos");
    }
}
