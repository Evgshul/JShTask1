package com.company;


public class Main {


    public static void main(String[] args) {

        int[] mas = {1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5};
        int[] mas1 = new int[mas.length];

        int a = mas[0];// number
        int b = 1; //repeats
        int max_repeat = 1;

        for (int i = 1; i < mas.length-1; i++) {

            System.out.print(mas[i]);

            if (mas[i] == mas[i + 1]) {
                b++;
            } else {
                if (b > max_repeat) {
                    max_repeat = b;
                    a = mas[i];
                }
                b = 1;
            }
        }
        System.out.println();
        System.out.println("max repeat " + max_repeat);
        System.out.println("integer from the longest recurring sequence within that array "+ a);


        // a = 1;b = 1;
        // a= 5; b = 1;
        //a= 5; b = 2;
        //a = 5; b = 3;
        // a = 6; b =1;

    }
}
