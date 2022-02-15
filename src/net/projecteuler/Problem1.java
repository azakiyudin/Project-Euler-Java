package net.projecteuler;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        // Jumlah kelipatan 3 atau 5 kurang dari n

        Scanner input = new Scanner(System.in);
        long a = 0;
        long b = 0;
        long c = 0;
        long d = 0;
        long e = 0;
        long f = 0;
        long x = 0;
        long y = 0;
        long z = 0;
        System.out.print("angka maksimum = ");
        long batas = input.nextLong();
        while (a < batas) {
            System.out.println("kelipatan 3 ke-" + x + " adalah " + a);
            System.out.println(b + " + " + a + " = " + (b + a));
            b = b + a;
            a += 3;
            x++;
            if (a >= batas) {
                while (c < batas) {
                    System.out.println("\nkelipatan 5 ke-" + y + " adalah " + c);
                    System.out.println(d + " + " + c + " = " + (d + c));
                    d = d + c;
                    c += 5;
                    y++;
                    if (c >= batas) {
                        while (e < batas) {
                            System.out.println("\nkelipatan 15 ke-" + z + " adalah " + e);
                            System.out.println(e);
                            System.out.println(f + " + " + e + " = " + (f + e));
                            f = f + e;
                            e += 15;
                            z++;
                            if (e >= batas) {
                                long g = b + d - f;
                                System.out.println("jumlahnya adalah " + b + " + " + d + " - " + f + " = " + g);
                            }
                        }
                    }
                }
            }
        }
    }
}
