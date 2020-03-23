package edu.ujcv.progra1;
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
        long min = arr[0];
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        if (min == arr[0]){
            System.out.println("El algoritmo más rápido es BubbleSort");
        }
        if (min == arr[1]){
            System.out.println("El algoritmo más rápido es MergeSort");
        }
        if (min == arr[2]){
            System.out.println("El algoritmo más rápido es HeapSort");
        }
        if (min == arr[3]){
            System.out.println("El algoritmo más rápido es QuickSort");
        }
    }

    public static long[] promediar() {
        BubleSort bubble_s = new BubleSort();
        MergeSort merge_s = new MergeSort();
        HeapSort heap_s = new HeapSort();
        QuickSort quicksort_s = new QuickSort();
        Random random = new Random();

        int tamaño = 10000;
        int rango = 1000;

        int[] arreglo1 = new int[random.nextInt(tamaño)];
        int[] arreglo2 = new int[random.nextInt(tamaño)];
        int[] arrelgo3 = new int[random.nextInt(tamaño)];
        int[] arreglo4 = new int[random.nextInt(tamaño)];
        int[] arreglo5 = new int[random.nextInt(tamaño)];
        int[] arreglo6 = new int[random.nextInt(tamaño)];
        int[] arreglo7 = new int[random.nextInt(tamaño)];
        int[] arreglo8 = new int[random.nextInt(tamaño)];
        int[] arreglo9 = new int[random.nextInt(tamaño)];
        int[] arreglo10 = new int[random.nextInt(tamaño)];

        for (int i = 0; i < 10; i++) {
            arreglo1[i] = random.nextInt(rango);
            arreglo2[i] = random.nextInt(rango);
            arrelgo3[i] = random.nextInt(rango);
            arreglo4[i] = random.nextInt(rango);
            arreglo5[i] = random.nextInt(rango);
            arreglo6[i] = random.nextInt(rango);
            arreglo7[i] = random.nextInt(rango);
            arreglo8[i] = random.nextInt(rango);
            arreglo9[i] = random.nextInt(rango);
            arreglo10[i] = random.nextInt(rango);
            ;
        }

        long[] tiempo = new long[10];

        tiempo[0] = bubble_s.sort(arreglo1);
        tiempo[1] = bubble_s.sort(arreglo2);
        tiempo[2] = bubble_s.sort(arrelgo3);
        tiempo[3] = bubble_s.sort(arreglo4);
        tiempo[4] = bubble_s.sort(arreglo5);
        tiempo[5] = bubble_s.sort(arreglo6);
        tiempo[6] = bubble_s.sort(arreglo7);
        tiempo[7] = bubble_s.sort(arreglo8);
        tiempo[8] = bubble_s.sort(arreglo9);
        tiempo[9] = bubble_s.sort(arreglo10);

        long suma = 0;
        long promBubble = 0;

        for (int i = 0; i < 10; i++){
            suma += tiempo[i];
        }

        promBubble = suma/10;

        tiempo[0] = merge_s.sort(arreglo1);
        tiempo[1] = merge_s.sort(arreglo2);
        tiempo[2] = merge_s.sort(arrelgo3);
        tiempo[3] = merge_s.sort(arreglo4);
        tiempo[4] = merge_s.sort(arreglo5);
        tiempo[5] = merge_s.sort(arreglo6);
        tiempo[6] = merge_s.sort(arreglo7);
        tiempo[7] = merge_s.sort(arreglo8);
        tiempo[8] = merge_s.sort(arreglo9);
        tiempo[9] = merge_s.sort(arreglo10);

        suma = 0;
        long promMerge = 0;

        for (int i = 0; i < 10; i++){
            suma += tiempo[i];
        }

        promMerge = suma/10;

        tiempo[0] = heap_s.sort(arreglo1);
        tiempo[1] = heap_s.sort(arreglo2);
        tiempo[2] = heap_s.sort(arrelgo3);
        tiempo[3] = heap_s.sort(arreglo4);
        tiempo[4] = heap_s.sort(arreglo5);
        tiempo[5] = heap_s.sort(arreglo6);
        tiempo[6] = heap_s.sort(arreglo7);
        tiempo[7] = heap_s.sort(arreglo8);
        tiempo[8] = heap_s.sort(arreglo9);
        tiempo[9] = heap_s.sort(arreglo10);

        suma = 0;
        long promHeap = 0;

        for (int i = 0; i < 10; i++){
            suma += tiempo[i];
        }

        tiempo[0] = quicksort_s.sort(arreglo1);
        tiempo[1] = quicksort_s.sort(arreglo2);
        tiempo[2] = quicksort_s.sort(arrelgo3);
        tiempo[3] = quicksort_s.sort(arreglo4);
        tiempo[4] = quicksort_s.sort(arreglo5);
        tiempo[5] = quicksort_s.sort(arreglo6);
        tiempo[6] = quicksort_s.sort(arreglo7);
        tiempo[7] = quicksort_s.sort(arreglo8);
        tiempo[8] = quicksort_s.sort(arreglo9);
        tiempo[9] = quicksort_s.sort(arreglo10);

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
