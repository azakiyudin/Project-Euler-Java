package net.projecteuler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Jumlah bilangan prima kurang dari sama dengan n


        Scanner input = new Scanner(System.in);
        double n;
        long p = 0;
        boolean gaksatu = true;
        System.out.print("nilai n = ");
        n = input.nextDouble();
        while (gaksatu) {
            p++;
            if (n == 1) {
                gaksatu = false;
                System.out.println(p + " iterasi");
            } else if ((n % 2) == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
    }
}