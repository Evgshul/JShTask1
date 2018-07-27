package com.company;


public class Main {


    public static void main(String[] args) {

        int[] mas = {1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5};
        int[] mas1 = new int[mas.length];

        int b = 0;// quantity of repeats
        int c = 0; //max repeat

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {

                if (mas[i] == mas[j]) {
                    b++;
                }
            }
            mas1[i] = b;
            b = 0;
        }
        System.out.println();
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[0] < mas1[i]) {
                c = mas1[i];
            }
        }

        int max = mas[4];
        for (int i = 0; i < mas1.length; i++) {
            if (c == mas1[i]) {
                if (max < mas[i]) {
                    max = mas[i];
                }
            }
        }
        System.out.println("integer from the longest recurring sequence within that array " + max);
        System.out.println("longest recurring sequence " + c);
    }
}



