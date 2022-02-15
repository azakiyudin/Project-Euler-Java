package net.projecteuler;

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {

        // Not Solved
        // Barisan Collatz terpanjang


        /*for (int n=2;n<=10;n++){
            //int n=13;
            int sum=1;
            while(n!=1){
                if (n%2==0){
                    System.out.print(n + " -> ");
                    n=n/2;
                } else {
                    System.out.print(n+ " -> ");
                    n=3*n+1;
                }
                sum++;
            }
            System.out.println();
            System.out.println(sum);
        }*/
        int tes = 0;
        int cek = 0;
        for(int n=700;n<=80000;n++){
            tes = collatz(n);
            if (tes>cek){
                cek = tes;
            }
        }
        System.out.println(cek);
    }
    public static int collatz(int n){
        int sum=1;
        while(n!=1){
            if (n%2==0){
                n=n/2;
            } else {
                n=3*n+1;
            }
            sum++;
        }
        return sum;
    }
}
