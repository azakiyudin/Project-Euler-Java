package net.projecteuler;

public class Problem4 {
    public static void main(String[] args){

        // Bilangan palindrom terbesar yang merupakan hasil kali dua bilangan 3 digit

        int enam,amb2,lima,cekPal,amb3,empat;
        for(int a= 900; a<1000;a++){
            for (int b = 900; b<1000;b++) {
                int c = a * b;
                enam = c % 10;      //ambil digit keenam
                amb2 = c % 100;     //ambil 2 digit terakhir
                lima = amb2 / 10;   //ambil digit kelima
                amb3 = c % 1000;    //ambil 3 digit terakhir
                empat = amb3 / 100; //ambil digit keempat
                cekPal = 100001 * enam + 10010 * lima + 1100 * empat;
                if (enam != 0) {
                    if (c == cekPal) {
                        System.out.println(cekPal);
                        System.out.printf("%d x %d = %d\n", a, b, c);
                    }
                }
            }
        }
    }
}
