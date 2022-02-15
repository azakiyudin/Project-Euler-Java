package net.projecteuler;

public class Problem206 {
    public static void main(String[] args){

        // Bilangan kuadrat unik 1_2_3_4_5_6_7_8_9_0

        long a;
        long amb0,cek1,amb3,cek2,amb5,amb7,cek3,amb9,cek4,amb11,cek5,amb13,cek6,amb15,cek7,amb17,cek8;
        for (a=1000000000;a<1500000000;a++){
            long d = a*a;
            long f = 10000000;
            amb0 = d % 10;      //ambil digit terakhir
            amb3 = d % 1000;     //ambil 3 digit terakhir
            cek1 = amb3 / 100;     //ambil digit pertama dari amb3
            amb5 = d % 100000;      //ambil 5 digit terakhir
            cek2 = amb5 / 10000;    //ambil digit pertama dari amb5
            amb7 = d % 10000000;    //ambil 7 digit terakhir
            cek3 = amb7 / (f/10);   //ambil digit pertama dari amb7
            amb9 = d % (f*100);     //ambil 9 digit terakhir
            cek4 = amb9 / (f*10);   //ambil digit pertama dari amb9
            amb11 = d % (f*10000);  //ambil 11 digit terakhir
            cek5 = amb11 / (f*1000);    //ambil digit pertama dari amb11
            amb13 = d % (f*f/10);       //ambil 13 digit terakhir
            cek6 = amb13 / (f*f/100);   //ambil digit pertama dari amb13
            amb15 = d % (f*f*10);       //ambil 15 digit terakhir
            cek7 = amb15 / (f*f);       //ambil digit pertama dari amb15
            amb17 = d % (f*f*1000);     //ambil 17 digit terakhir
            cek8 = amb17 / (f*f*100);   //ambil digit pertama dari amb17
            if (amb0 == 0) {
                if (cek1 == 9) {
                    if (cek2 == 8) {
                        if (cek3 == 7) {
                            if (cek4 == 6) {
                                if (cek5 == 5) {
                                    if (cek6 == 4) {
                                        if (cek7 == 3) {
                                            if (cek8 == 2) {
                                                System.out.printf("1_%d_%d_%d_%d_%d_%d_%d_%d_%d\n",cek8,cek7,cek6,cek5,cek4,cek3,cek2,cek1,amb0);
                                                System.out.println(d + " adalah kuadrat dari " + a);
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
