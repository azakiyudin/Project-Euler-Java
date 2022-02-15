package net.projecteuler;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        // Bilangan prima ke-n

        Scanner input = new Scanner(System.in);

        long t = 1;
        for (long j=1; j<10;j++){
            t = t*j;
            System.out.print(j + " x ");
        }
        System.out.println("= " + t);
        long s = 2*t + 6*40320 + 6*5040 + 2*720 + 5*120 + 24 + 2*6 + 2*2;
        System.out.println(s);

        System.out.print("prima ke berapa? ");
        long n = input.nextLong();
        long faktor;
        long a = 1;
        long x = 1;
        long b;
        boolean kon = true;
        while (kon){
            a = a + 2;
            faktor = 0;
            for (b = 1; (b*b) <= a; b = (b+2)){
                if ((a%b)== 0){
                    faktor = faktor + 1;
                }
            }
            if (faktor == 1){
                x++;
                if (x == n) {
                    System.out.println("prima ke-" + x + " adalah " + a);
                    kon = false;
                }
            }
        }
    }
}
