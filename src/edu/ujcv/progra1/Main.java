package edu.ujcv.progra1;
public class Main {
    public static void main(String[] args) {
        long[] promedios = Comparar.promediar();
        System.out.println("Promedio de BubbleSort: " + promedios[0]);
        System.out.println("Promedio de MergeSort: " + promedios[1]);
        System.out.println("Promedio de HeapSort: " + promedios[2]);
        System.out.println("Promedio de QuickSort: " + promedios[3]);
        System.out.println();
        Comparar.masRapido(promedios);
    }
}