package edu.ujcv.progra1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] elementos = {3,2,4,5,6,7,9,9,10,3,5};
        ShuffleSort s = new ShuffleSort();
        elementos = s.shuffleSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        System.out.println(s.sort(elementos));
    }
}
