package net.projecteuler;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args){

        // Bilangan prima ke-n

        Scanner input = new Scanner(System.in);


        System.out.print("prima ke berapa? ");
        long n = input.nextLong();
        long faktor;
        long a = 1;
        long x = 1;
        long b;
        while (true){
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
                    break;
                }
            }
        }
    }
}
