package net.projecteuler;

import java.util.Scanner;
public class Problem12 {
    public static void main(String[] args){

        // Bilangan segitiga dengan faktor lebih dari n

        Scanner input = new Scanner(System.in);
        System.out.print("nilai p maksimal = ");
        long pmax = input.nextLong();
        System.out.print("jumlah faktor minimal = ");
        long facmin = input.nextLong();
        long p,faktor;
        for(long n=1; (n*(n+1)/2)<pmax; n++){
            p = n*(n+1)/2;
            faktor = 0;
            for (long i=1; (i*i)<=p;i++){
                if ((p%i) == 0) {
                    if ((i * i) == p) {
                        faktor = faktor + 1;
                    } else {
                        faktor = faktor + 2;
                    }
                }
            }
            if (faktor > facmin){
                System.out.println(n + " " + p + " " + faktor);
            }
        }
    }
}
