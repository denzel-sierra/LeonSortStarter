package edu.ujcv.progra1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        long[] promedios = promediar();
        System.out.println("Promedio de BubbleSort: " + promedios[0]);
        System.out.println("Promedio de MergeSort: " + promedios[1]);
        System.out.println("Promedio de HeapSort: " + promedios[2]);
        System.out.println("Promedio de QuickSort: " + promedios[3]);
        System.out.println("");
        masRapido(promedios);

    }

    private static void masRapido(long[] arr) {
        long[] temp = arr;
        Arrays.sort(arr);
        if (arr[0]==temp[0]){
            System.out.println("El algoritmo más rápido es BubbleSort");
        }
        if (arr[0]==temp[1]){
            System.out.println("El algoritmo más rápido es MergeSort");
        }
        if (arr[0]==temp[2]){
            System.out.println("El algoritmo más rápido es HeapSort");
        }
        if (arr[0]==temp[3]){
            System.out.println("El algoritmo más rápido es QuickSort");
        }
    }

    public static long[] promediar() {
        BubleSort bubble_s = new BubleSort();
        MergeSort merge_s = new MergeSort();
        HeapSort heap_s = new HeapSort();
        QuickSort quicksort_s = new QuickSort();
        Random random = new Random();

        int[] arr1 = new int[random.nextInt(10000)];
        int[] arr2 = new int[random.nextInt(10000)];
        int[] arr3 = new int[random.nextInt(10000)];
        int[] arr4 = new int[random.nextInt(10000)];
        int[] arr5 = new int[random.nextInt(10000)];
        int[] arr6 = new int[random.nextInt(10000)];
        int[] arr7 = new int[random.nextInt(10000)];
        int[] arr8 = new int[random.nextInt(10000)];
        int[] arr9 = new int[random.nextInt(10000)];
        int[] arr10 = new int[random.nextInt(10000)];

        for (int i = 0; i < 10; i++) {
            arr1[i] = random.nextInt(1000);
            arr2[i] = random.nextInt(1000);
            arr3[i] = random.nextInt(1000);
            arr4[i] = random.nextInt(1000);
            arr5[i] = random.nextInt(1000);
            arr6[i] = random.nextInt(1000);
            arr7[i] = random.nextInt(1000);
            arr8[i] = random.nextInt(1000);
            arr9[i] = random.nextInt(1000);
            arr10[i] = random.nextInt(1000);
            ;
        }

        long[] tiempo = new long[10];

        tiempo[0] = bubble_s.sort(arr1);
        tiempo[1] = bubble_s.sort(arr2);
        tiempo[2] = bubble_s.sort(arr3);
        tiempo[3] = bubble_s.sort(arr4);
        tiempo[4] = bubble_s.sort(arr5);
        tiempo[5] = bubble_s.sort(arr6);
        tiempo[6] = bubble_s.sort(arr7);
        tiempo[7] = bubble_s.sort(arr8);
        tiempo[8] = bubble_s.sort(arr9);
        tiempo[9] = bubble_s.sort(arr10);

        long suma = 0;
        long promBubble = 0;

        for (int i = 0; i < 10; i++){
            suma += tiempo[i];
        }

        promBubble = suma/10;

        tiempo[0] = merge_s.sort(arr1);
        tiempo[1] = merge_s.sort(arr2);
        tiempo[2] = merge_s.sort(arr3);
        tiempo[3] = merge_s.sort(arr4);
        tiempo[4] = merge_s.sort(arr5);
        tiempo[5] = merge_s.sort(arr6);
        tiempo[6] = merge_s.sort(arr7);
        tiempo[7] = merge_s.sort(arr8);
        tiempo[8] = merge_s.sort(arr9);
        tiempo[9] = merge_s.sort(arr10);

        suma = 0;
        long promMerge = 0;

        for (int i = 0; i < 10; i++){
            suma += tiempo[i];
        }

        promMerge = suma/10;

        tiempo[0] = heap_s.sort(arr1);
        tiempo[1] = heap_s.sort(arr2);
        tiempo[2] = heap_s.sort(arr3);
        tiempo[3] = heap_s.sort(arr4);
        tiempo[4] = heap_s.sort(arr5);
        tiempo[5] = heap_s.sort(arr6);
        tiempo[6] = heap_s.sort(arr7);
        tiempo[7] = heap_s.sort(arr8);
        tiempo[8] = heap_s.sort(arr9);
        tiempo[9] = heap_s.sort(arr10);

        suma = 0;
        long promHeap = 0;

        for (int i = 0; i < 10; i++){
            suma += tiempo[i];
        }

        tiempo[0] = quicksort_s.sort(arr1);
        tiempo[1] = quicksort_s.sort(arr2);
        tiempo[2] = quicksort_s.sort(arr3);
        tiempo[3] = quicksort_s.sort(arr4);
        tiempo[4] = quicksort_s.sort(arr5);
        tiempo[5] = quicksort_s.sort(arr6);
        tiempo[6] = quicksort_s.sort(arr7);
        tiempo[7] = quicksort_s.sort(arr8);
        tiempo[8] = quicksort_s.sort(arr9);
        tiempo[9] = quicksort_s.sort(arr10);

        suma = 0;
        long promQuick = 0;

        for (int i = 0; i < 10; i++){
            suma += tiempo[i];
        }

        promQuick = suma/10;

        long[] algoritmos = {promBubble, promMerge, promHeap, promQuick};
        return algoritmos;
    }


}
