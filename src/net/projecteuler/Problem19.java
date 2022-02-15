package net.projecteuler;

public class Problem19 {
    public static void main(String[] args) {

        // Counting Sundays
        // Menghitung banyaknya bulan yang hari pertamanya adalah minggu

        int sum = 1;
        int tes = 0; // hari pertama bukan hari minggu
        for (int k = 1901; k <= 2000; k++) {
            if (k%4==0) { //tahun kabisat
                for (int i = 1; i <= 7; i++) {
                    if (i == 2) {
                        sum += 29;
                    } else if (i % 2 == 1) {
                        sum += 31;
                    } else {
                        sum += 30;
                    }
                    if (sum % 7 == 5 ) { //sisa 5 karena isinya
                        tes++;
                    }
                }
                for (int i = 8; i <= 12; i++) {
                    if (i % 2 == 0) {
                        sum += 31;
                    } else {
                        sum += 30;
                    }
                    if (sum % 7 == 5) {
                        tes++;
                    }
                }
            }
            else{
                for (int i = 1; i <= 7; i++) {
                    if (i == 2) {
                        sum += 28;
                    } else if (i % 2 == 1) {
                        sum += 31;
                    } else {
                        sum += 30;
                    }
                    if (sum % 7 == 5) {
                        tes++;
                    }
                }
                for (int i = 8; i <= 12; i++) {
                    if (i % 2 == 0) {
                        sum += 31;
                    } else {
                        sum += 30;
                    }
                    if (sum % 7 == 5) {
                        tes++;
                    }
                }
            }
        }
        System.out.println(tes);
    }
}
