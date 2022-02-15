package net.projecteuler;

public class Problem35 {
    public static void main(String[] args){

        // Circular Prime
        long faktor;
        long a = 99;
        long b;
        long cirprime = 0;
        long a1,a2,a3,a5,a6,a4,abar,abaru,faktor2,faktor3,faktor4,aba,a7,a8,abaruu,faktor5,a9,a10,abau,faktor6;
        while (a<1000){
            a = a + 2;
            faktor = 0;
            for (b = 1; (b*b) <= a; b = (b+2)){
                if ((a%b)== 0){
                    faktor = faktor + 1;
                }
            }
            if (faktor == 1){
                a1 = a % 10;        //ambil digit terakhir
                a2 = a / 10;        //ambil 2 digit pertama
                a3 = a2 % 10;       //ambil digit kedua
                a4 = a / 100;       //ambil digit pertama
                if ((a3%2) != 0){
                    if ((a4%2) != 0){
                        abar = 100*a3 + 10*a1 + a4;
                        faktor2 = 0;
                        for (b = 1; (b*b) <= abar; b = (b+2)){
                            if ((abar%b)== 0){
                                faktor2 = faktor2 + 1;
                            }
                        }
                        if (faktor2 == 1){
                            abaru = 100*a1 + 10*a4 + a3;
                            faktor3 = 0;
                            for (b = 1; (b*b) <= abaru; b = (b+2)){
                                if ((abaru%b)== 0){
                                    faktor3 = faktor3 + 1;
                                }
                            }
                            if (faktor3 == 1){
                                System.out.println(a + " circular prime");
                                cirprime = cirprime + 1;
                            }
                        }
                    }
                }
            }
        }
        while (a<10000){
            a = a + 2;
            faktor = 0;
            for (b = 1; (b*b) <= a; b = (b+2)){
                if ((a%b)== 0){
                    faktor = faktor + 1;
                }
            }
            if (faktor == 1) {
                a1 = a % 10;        //ambil digit keempat
                a2 = a / 10;        //ambil 3 digit pertama
                a3 = a2 % 10;       //ambil digit ketiga
                a4 = a / 100;       //ambil 2 digit pertama
                a5 = a4 % 10;       //ambil digit kedua
                a6 = a / 1000;      //ambil digit pertama
                if ((a6 % 2) != 0) {
                    if ((a3 % 2) != 0) {
                        if ((a5 % 2) != 0) {
                            aba = 1000*a5 + 100*a3 + 10*a1 + a6;
                            faktor2 = 0;
                            for (b = 1; (b * b) <= aba; b = (b + 2)) {
                                if ((aba % b) == 0) {
                                    faktor2 = faktor2 + 1;
                                }
                            }
                            if (faktor2 == 1) {
                                abar = 1000*a3 + 100*a1 + 10*a6 + a5;
                                faktor3 = 0;
                                for (b = 1; (b * b) <= abar; b = (b + 2)) {
                                    if ((abar % b) == 0) {
                                        faktor3 = faktor3 + 1;
                                    }
                                }
                                if (faktor3 == 1) {
                                    abaru = 1000 * a1 + 100 * a6 + 10 * a5 + a3;
                                    faktor4 = 0;
                                    for (b = 1; (b * b) <= abaru; b = (b + 2)) {
                                        if ((abaru % b) == 0) {
                                            faktor4 = faktor4 + 1;
                                        }
                                    }
                                    if (faktor4 == 1) {
                                        System.out.println(a + " circular prime");
                                        cirprime = cirprime + 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        while (a<100000){
            a = a + 2;
            faktor = 0;
            for (b = 1; (b*b) <= a; b = (b+2)){
                if ((a%b)== 0){
                    faktor = faktor + 1;
                }
            }
            if (faktor == 1) {
                a1 = a % 10;        //ambil digit kelima
                a2 = a / 10;        //ambil 4 digit pertama
                a3 = a2 % 10;       //ambil digit keempat
                a4 = a / 100;       //ambil 3 digit pertama
                a5 = a4 % 10;       //ambil digit ketiga
                a6 = a / 1000;      //ambil 2 digit pertama
                a7 = a6 % 10;       //ambil digit kedua
                a8 = a / 10000;     //ambil digit pertama
                if ((a8%2) != 0) {
                    if ((a7 % 2) != 0) {
                        if ((a5 % 2) != 0) {
                            if ((a3 % 2) != 0) {
                                aba = 10000*a7 + 1000*a5 + 100 * a3 + 10 * a1 + a8;
                                faktor2 = 0;
                                for (b = 1; (b * b) <= aba; b = (b + 2)) {
                                    if ((aba % b) == 0) {
                                        faktor2 = faktor2 + 1;
                                    }
                                }
                                if (faktor2 == 1) {
                                    abar = 10000*a5 + 1000*a3 + 100*a1 + 10*a8 + a7;
                                    faktor3 = 0;
                                    for (b = 1; (b * b) <= abar; b = (b + 2)) {
                                        if ((abar % b) == 0) {
                                            faktor3 = faktor3 + 1;
                                        }
                                    }
                                    if (faktor3 == 1) {
                                        abaru = 10000*a3 + 1000*a1 + 100*a8 + 10*a7 + a5;
                                        faktor4 = 0;
                                        for (b = 1; (b * b) <= abaru; b = (b + 2)) {
                                            if ((abaru % b) == 0) {
                                                faktor4 = faktor4 + 1;
                                            }
                                        }
                                        if (faktor4 == 1) {
                                            abaruu = 10000 * a1 + 1000 * a8 + 100 * a7 + 10 * a5 + a3;
                                            faktor5 = 0;
                                            for (b = 1; (b * b) <= abaruu; b = (b + 2)) {
                                                if ((abaruu % b) == 0) {
                                                    faktor5 = faktor5 + 1;
                                                }
                                            }
                                            if (faktor5 == 1) {
                                                System.out.println(a + " circular prime");
                                                cirprime = cirprime + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        while (a<1000000){
            a = a + 2;
            faktor = 0;
            for (b = 1; (b*b) <= a; b = (b+2)){
                if ((a%b)== 0){
                    faktor = faktor + 1;
                }
            }
            if (faktor == 1) {
                a1 = a % 10;        //ambil digit keenam
                a2 = a / 10;        //ambil 5 digit pertama
                a3 = a2 % 10;       //ambil digit kelima
                a4 = a / 100;       //ambil 4 digit pertama
                a5 = a4 % 10;       //ambil digit keempat
                a6 = a / 1000;      //ambil 3 digit pertama
                a7 = a6 % 10;       //ambil digit ketiga
                a8 = a / 10000;     //ambil 2 digit pertama
                a9 = a8 % 10;       //ambil digit kedua
                a10 = a / 100000;   //ambil digit pertama
                if ((a10 % 2) != 0) {
                    if ((a9 % 2) != 0) {
                        if ((a7 % 2) != 0) {
                            if ((a5 % 2) != 0) {
                                if ((a3 % 2) != 0) {
                                    aba = 100000*a9 + 10000 * a7 + 1000 * a5 + 100 * a3 + 10 * a1 + a10;
                                    faktor2 = 0;
                                    for (b = 1; (b * b) <= aba; b = (b + 2)) {
                                        if ((aba % b) == 0) {
                                            faktor2 = faktor2 + 1;
                                        }
                                    }
                                    if (faktor2 == 1) {
                                        abar = 100000*a7 + 10000 * a5 + 1000 * a3 + 100 * a1 + 10 * a10 + a9;
                                        faktor3 = 0;
                                        for (b = 1; (b * b) <= abar; b = (b + 2)) {
                                            if ((abar % b) == 0) {
                                                faktor3 = faktor3 + 1;
                                            }
                                        }
                                        if (faktor3 == 1) {
                                            abaru = 100000*a5 + 10000 * a3 + 1000 * a1 + 100 * a10 + 10 * a9 + a7;
                                            faktor4 = 0;
                                            for (b = 1; (b * b) <= abaru; b = (b + 2)) {
                                                if ((abaru % b) == 0) {
                                                    faktor4 = faktor4 + 1;
                                                }
                                            }
                                            if (faktor4 == 1) {
                                                abaruu = 100000*a3 + 10000 * a1 + 1000 * a10 + 100 * a9 + 10 * a7 + a5;
                                                faktor5 = 0;
                                                for (b = 1; (b * b) <= abaruu; b = (b + 2)) {
                                                    if ((abaruu % b) == 0) {
                                                        faktor5 = faktor5 + 1;
                                                    }
                                                }
                                                if (faktor5 == 1) {
                                                    abau = 100000 * a1 + 10000 * a10 + 1000 * a9 + 100 * a7 + 10 * a5 + a3;
                                                    faktor6 = 0;
                                                    for (b = 1; (b * b) <= abau; b = (b + 2)) {
                                                        if ((abau % b) == 0) {
                                                            faktor6 = faktor6 + 1;
                                                        }
                                                    }
                                                    if (faktor6 == 1) {
                                                        System.out.println(a + " circular prime");
                                                        cirprime = cirprime + 1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("banyaknya " + cirprime);
    }
}