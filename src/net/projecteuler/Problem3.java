package net.projecteuler;

import java.util.*;
public class Problem3 {
    public static void main(String[] args){

        // Faktor prima terbesar
        // Program ini hanya menampilkan faktor prima
        // dari suatu bilangan bukan mencari faktor prima terbesar

        Scanner input = new Scanner(System.in);
        System.out.print("bilangan = ");
        long n = input.nextLong();
        long a = 2;
        long cek;
        while (a <= n) {
            cek = (n % a);
            if (cek == 0) {
                long faktor = 0;
                long b = n/a;
                for (long x = 1; (x*x) <= a; x++){  // a prima atau bukan
                    if ((a%x) == 0){
                        faktor = faktor + 1;
                    }
                }
                if (faktor == 1) {
                    System.out.println(a + " x " + b);
                }
            }
            a++;
        }
    }
}
