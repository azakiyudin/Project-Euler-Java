package net.projecteuler;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        // Hasil kali terbesar dari bilangan
        // yang berdekatan pada 1000 digit bilangan

        // Not Solved
        // Bilangan
        //        62491922511967442657474235534919493496983520
        //        186947885184385861560
        //        6987471585238630
        //        4355766896648950
        //        644448664523874930
        //        7242712188399879790
        //        93776657273330
        //        5947522435258490
        //        862569321 978468622482839 722413756570
        //        79729686524140
        //        227588666881479924442928230
        //        2456652947654568284890
        //        962455444362981
        //        98787992724428490
        //        5593572972570
        // Dengan bruteforce aka coba-cobe, diperoleh:
        // bilangan berdekatan adalah 5576689664895
        // hasil kalinya 23514624000

        Scanner input = new Scanner(System.in);
        System.out.print("berapa? ");
        long d = input.nextLong();
        long d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13;
        long amb2,amb3,amb4,amb5,amb6,amb7,amb8,amb9,amb10,amb11,amb12;
        long f = 1000;
        if (d < (f*f*f*f)){
            System.out.println("kurang banyak kak");
        } else if (d>(f*f*f*f*10)) {
            d = d % (f*f*f*f*10);
            System.out.println(d);
            d13 = d % 10;      //digit ke-13
            amb2 = d % (f / 10);      //ambil 2 digit terakhir
            amb3 = d % f;           //ambil 3 digit terakhir
            amb4 = d % (f * 10);      //ambil 4 digit terakhir
            amb5 = d % (f * 100);     //ambil 5 digit terakhir
            amb6 = d % (f * f);       //ambil 6 digit terakhir
            amb7 = d % (f * f * 10);    //ambil 7 digit terakhir
            amb8 = d % (f * f * 100);   //ambil 8 digit terakhir
            amb9 = d % (f * f * f);     //ambil 9 digit terakhir
            amb10 = d % (f * f * f * 10); //ambil 10 digit terakhir
            amb11 = d % (f * f * f * 100);    //ambil 11 digit terakhir
            amb12 = d % (f * f * f * f);      //ambil 12 digit terakhir
            d12 = amb2 / 10;   //digit ke-12
            d11 = amb3 / 100;     //digit ke-11
            d10 = amb4 / f;      //digit ke-10
            d9 = amb5 / (f * 10);    //digit ke-9
            d8 = amb6 / (f * 100);    //digit ke-8
            d7 = amb7 / (f * f);   //digit ke-7
            d6 = amb8 / (f * f * 10);   //digit ke-6
            d5 = amb9 / (f * f * 100);  //digit ke-5
            d4 = amb10 / (f * f * f);   //digit ke-4
            d3 = amb11 / (f * f * f * 10);    //digit ke-3
            d2 = amb12 / (f * f * f * 100);   //digit ke-2
            d1 = d / (f * f * f * f);         //digit pertama
            long cek = d1 * d2 * d3 * d4 * d5 * d6 * d7 * d8 * d9 * d10 * d11 * d12 * d13;
            System.out.println(cek);
        } else {
            System.out.println(d);
            d13 = d % 10;      //digit ke-13
            amb2 = d % (f / 10);      //ambil 2 digit terakhir
            amb3 = d % f;           //ambil 3 digit terakhir
            amb4 = d % (f * 10);      //ambil 4 digit terakhir
            amb5 = d % (f * 100);     //ambil 5 digit terakhir
            amb6 = d % (f * f);       //ambil 6 digit terakhir
            amb7 = d % (f * f * 10);    //ambil 7 digit terakhir
            amb8 = d % (f * f * 100);   //ambil 8 digit terakhir
            amb9 = d % (f * f * f);     //ambil 9 digit terakhir
            amb10 = d % (f * f * f * 10); //ambil 10 digit terakhir
            amb11 = d % (f * f * f * 100);    //ambil 11 digit terakhir
            amb12 = d % (f * f * f * f);      //ambil 12 digit terakhir
            d12 = amb2 / 10;   //digit ke-12
            d11 = amb3 / 100;     //digit ke-11
            d10 = amb4 / f;      //digit ke-10
            d9 = amb5 / (f * 10);    //digit ke-9
            d8 = amb6 / (f * 100);    //digit ke-8
            d7 = amb7 / (f * f);   //digit ke-7
            d6 = amb8 / (f * f * 10);   //digit ke-6
            d5 = amb9 / (f * f * 100);  //digit ke-5
            d4 = amb10 / (f * f * f);   //digit ke-4
            d3 = amb11 / (f * f * f * 10);    //digit ke-3
            d2 = amb12 / (f * f * f * 100);   //digit ke-2
            d1 = d / (f * f * f * f);         //digit pertama
            long cek = d1 * d2 * d3 * d4 * d5 * d6 * d7 * d8 * d9 * d10 * d11 * d12 * d13;
            System.out.println(cek);
        }
    }
}