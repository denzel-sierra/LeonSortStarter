package edu.ujcv.progra1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*        int[] elementos = {27972797, 9712797, 34362797, 62502797, 2212797,
                68932797, 33732797, 73432797, 2052797, 29862797, 91222797,
                85942797, 4692797, 87532797, 33872797, 84462797, 20272797,
                45812797, 62352797, 71862797, 51242797, 70522797, 33182797,
                32902797, 69752797, 9352797, 89262797, 10272797, 13422797,
                9012797, 892797, 48292797, 50732797, 23802797, 92592797,
                34412797, 46072797, 18152797, 84282797, 26502797, 18552797,
                78262797, 1542797, 61252797, 99632797, 73082797, 75312797,
                93072797, 812797, 69192797};*/
        int[] elementos = {2,5,8,3};
        ShuffleSort shuffle_s = new ShuffleSort();
        BubleSort bubble_s = new BubleSort();
        MergeSort merge_s = new MergeSort();
        HeapSort heap_s = new HeapSort();
        QuickSort quicksort_s = new QuickSort();

        System.out.println(Arrays.toString(elementos));

        System.out.println("ShuffleSort tarda "+ shuffle_s.sort(elementos)+ " milisegundos");
/*        System.out.println("BubbleSort tarda "+ bubble_s.sort(elementos)+ " milisegundos");
        System.out.println("MergeSort tarda "+ merge_s.sort(elementos)+ " milisegundos");
        System.out.println("HeapSort tarda "+ heap_s.sort(elementos)+ " milisegundos");
        System.out.println("Quicksort tarda "+ quicksort_s.sort(elementos)+ " milisegundos");*/
    }
}
