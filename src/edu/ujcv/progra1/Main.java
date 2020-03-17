package edu.ujcv.progra1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] elementos = {2797, 971, 3436, 6250, 221, 6893, 3373, 7343, 205, 2986, 9122, 8594, 469, 8753, 3387, 8446, 2027, 4581, 6235, 7186, 5124, 7052, 3318, 3290, 6975, 935, 8926, 1027, 1342, 901, 89, 4829, 5073, 2380, 9259, 3441, 4607, 1815, 8428, 2650, 1855, 7826, 154, 6125, 9963, 7308, 7531, 9307, 81, 6919};
        ShuffleSort s = new ShuffleSort();
        elementos = s.shuffleSort(elementos);

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }

        elementos = new int[]{3,2,4,5,6,7,9,9,10,3,5};
        System.out.println("\n\ntarda "+ s.sort(elementos)+ " milisegundos");
    }
}
