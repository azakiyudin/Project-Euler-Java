package net.projecteuler;

import java.util.Scanner;
public class tes {
    public static void main(String[] args) {


        /*Scanner input = new Scanner(System.in);
        System.out.print("Masukkan N = ");
        int n = input.nextInt();
        double a = Math.sqrt(n);
        double b = Math.floor(a);
        if ((b*b) == n){
            System.out.println("lampu menyala");
        } else {
            System.out.println("lampu mati");
        }*/


        // Jadi di sini kita akan menghitung banyaknya faktor dari N
        // Jika faktornya ganjil, lampunya akan menyala
        // Jika faktornya genap, lampunya akan mati
        // Faktor dari suatu bilangan tersebut dicek
        Scanner input = new Scanner(System.in);
        /*System.out.print("Masukkan N = ");
        int n = input.nextInt();
        int pencet = 0;
        int cek;
        for (int a = 1; (a*a) <= n; a++) {
            cek = (n % a);
            if (cek == 0) {
                if ((a*a) != n){
                    pencet += 2;
                } else {
                    pencet += 1;
                }
            }
        }
        if ((pencet%2) == 0){
            System.out.println("lampu mati");
        } else {
            System.out.println("lampu nyala");
        }*/
        int n=10;
    }
}


/*Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N = ");
        int n = input.nextInt();

        boolean mati = true;
        int pencet = 0;
        for (int i=1; i<=n; i++){
            int cek = n % i;
            if (cek == 0){
                pencet++;
            }
        }
        if ((pencet%2) == 0){
            System.out.println("lampu mati");
        } else {
            System.out.println("lampu nyala");
        }*/