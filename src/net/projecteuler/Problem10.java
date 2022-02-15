package net.projecteuler;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args){

        // Jumlah bilangan prima kurang dari n

        Scanner input = new Scanner(System.in);

        System.out.print("nilai maksimum = ");
        long n = input.nextLong();
        long faktor;
        long a = 1;
        long c = 2;
        while ((a + 1) < n) {
            a = a + 2;
            faktor = 0;
            for (long b = 1; (b*b) <= a; b = (b+2)){
                if ((a%b) == 0){
                    faktor = faktor + 1;
                }
            }
            if (faktor == 1) {
                c = c + a;
            }
        }
        System.out.println("Jumlahnya adalah " + c);
    }
}
