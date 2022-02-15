package net.projecteuler;

import java.util.*;
public class Main {
    public static void main(String[] args){

        // Selisih jumlah kuadrat

        Scanner input = new Scanner(System.in);

        long a = 0;
        long b = 0;
        long c = 0;
        System.out.print("Masukkan batas = ");
        long batas = input.nextLong();
        while (a <= batas){
            b = b + (a*a);
            c = c + a;
            a++;
            if (a > batas){
                long d = (c*c) - b;
                System.out.println(d);
            }
        }
    }
}
