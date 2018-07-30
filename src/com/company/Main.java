package com.company;


public class Main {


    public static void main(String[] args) {

        int[] mas = {1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 7};
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

        for (int i : mas1) if (mas1[0] < mas1[i]) c = mas1[i];

        int max = mas[0];
        int k = mas[0];
        for (int i : mas) {
            if (c == mas1[i] && max < mas[i]) max = mas[i];
            if (c == mas1[i]) {k = Math.max(k, mas[i]);}
        }
        System.out.println("integer from the longest recurring sequence within that array " + max);
        System.out.println("longest recurring sequence " + c);
        System.out.println("another metods to find longest recurring sequence " + k);


        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == max) {
                System.out.printf("%d", i);

            }
        }
    }
}




