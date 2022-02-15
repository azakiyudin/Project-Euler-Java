package net.projecteuler;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){

        // Selisih jumlah kuadrat

        int x = 5;
        double y = 3;
        double z = x/y;
        System.out.println(z);

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
        }
        long d = (c*c) - b;
        System.out.println(d);
    }
}
