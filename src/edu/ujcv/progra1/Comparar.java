package edu.ujcv.progra1;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Comparar {

    public static void masRapido(long[] arr) {
        long min = arr[0];
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        if (min == arr[0]){
            System.out.println("El algoritmo más rápido fue BubbleSort");
        }
        if (min == arr[1]){
            System.out.println("El algoritmo más rápido fue MergeSort");
        }
        if (min == arr[2]){
            System.out.println("El algoritmo más rápido fue HeapSort");
        }
        if (min == arr[3]){
            System.out.println("El algoritmo más rápido fue QuickSort");
        }
    }

    public static long[] compararArreglos() {
        BubleSort bubble_s = new BubleSort();
        MergeSort merge_s = new MergeSort();
        HeapSort heap_s = new HeapSort();
        QuickSort quicksort_s = new QuickSort();

        int[] arreglo1 = generarArreglo();
        int[] arreglo2 = generarArreglo();
        int[] arrelgo3 = generarArreglo();
        int[] arreglo4 = generarArreglo();
        int[] arreglo5 = generarArreglo();
        int[] arreglo6 = generarArreglo();
        int[] arreglo7 = generarArreglo();
        int[] arreglo8 = generarArreglo();
        int[] arreglo9 = generarArreglo();
        int[] arreglo10 = generarArreglo();

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
        long promBubble;

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
        long promMerge;

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
        long promHeap;

        for (int i = 0; i < 10; i++){
            suma += tiempo[i];
        }

        promHeap = suma/10;

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
        long promQuick;

        for (int i = 0; i < 10; i++){
            suma += tiempo[i];
        }

        promQuick = suma/10;

        return new long[]{promBubble, promMerge, promHeap, promQuick};
    }

    private static int[] generarArreglo() {
        int tamaño = 50000;
        int rango = 1000;
        Random random = new Random();
        int[] arreglo = new int[ThreadLocalRandom.current().nextInt(5, tamaño)];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(rango);
        }
        return arreglo;
    }


}