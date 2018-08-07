package com.company;


public class Main {


    public static void main(String[] args) {

        int[] mas = {1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};


        int a = mas[0];// number
        int b = 1; //repeats
        int max_repeat = 1;

        for (int i = 1; i < mas.length - 1; i++) {

            System.out.print(mas[i]);

            if (mas[i] == mas[i + 1]) {
                b++;
            } else {
                if (b > max_repeat) {
                    max_repeat = b;
                    a = mas[i - 1];
                }
                b = 1;
            }
            if (b > max_repeat) {
                max_repeat = b;
                a = mas[mas.length - 1];
            }
        }
        System.out.println();
        System.out.println("max repeat " + max_repeat);
        System.out.println("integer from the longest recurring sequence within that array " + a);
    }

    
}
