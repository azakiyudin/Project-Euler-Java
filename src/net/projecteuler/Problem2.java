package net.projecteuler;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

        // Jumlah deret fibonacci yang nilainya genap

        Scanner input = new Scanner(System.in);

        long batas, f1, f2, f3;
        System.out.print("nilai maksimum = ");
        batas = input.nextLong();
        f1 = 0; f2 = 1;
        long x = 0;
        long n = 0;
        while(f1 < batas){
            n++;
            f3 = f1 + f2;
            f2 = f1;
            f1 = f3;
            if (f3 % 2 == 0){
                System.out.println("fibonacci ke-" + n + " adalah " + f3);
                System.out.println(x + " + " + f3 + " = " + (x+f3));
                x = x + f3;
            }
        }
        System.out.println("jumlahnya adalah " + x);
    }
}
