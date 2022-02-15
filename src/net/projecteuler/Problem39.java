package net.projecteuler;

public class Problem39 {
    public static void main(String[] args){

        // Keliling segitiga siku-siku
        int akhir = 0;
        int keliling = 0;
        for(int p=1;p<=1000;p++) {
            int jumlah =0;
            for (int c = 1; c < p; c++) {
                for (int b = 1; b < p-c; b++) {
                    int a = p-c-b;
                    if(a*a+b*b==c*c){
                        jumlah++;
                    }
                }
            }
            if(jumlah > akhir){
                akhir = jumlah;
                keliling = p;
            }
        }
        System.out.println(akhir);
        System.out.println(keliling);
    }
}
