package net.projecteuler;

import java.util.Scanner;
public class Problem9 {
    public static void main(String[] args){

        // Hasil kali tripel pythagoras yang jumlahnya n

        Scanner input = new Scanner(System.in);
        System.out.print("jumlah a + b + c = ");
        long n = input.nextLong();
        int tot = 0;
        for (long c=2; c<n; c++){
            for (long b=2; b<c; b++){
                for (long a=2; a<b; a++){
                    if ((a+b+c) == n){
                        long x = a*a + b*b;
                        if ((c*c) == x){
                            long hasil = a*b*c;
                            System.out.printf("(a,b,c) = (%d,%d,%d) \n",a,b,c );
                            System.out.printf("a x b x c = %d x %d x %d = %d",a,b,c,hasil);
                            System.out.println();
                            tot++;
                        }
                    }
                }
            }
        }
        if (tot == 0){
            System.out.println("tidak ada tripel a,b,c bulat yang memenuhi");
        }
    }
}
