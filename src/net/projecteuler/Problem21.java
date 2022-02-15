package net.projecteuler;

public class Problem21 {
    public static void main(String[] args){
        // Amicable numbers
        // d(a) jumlah faktor positif dari a selain a
        // d(a)=b dan d(b)=a, a!=b

        int jumlah =0;
        for(int i=1;i<=10000;i++){
            int cek = jumlahDigit(i);
            if(jumlahDigit(cek) == i){
                if(i!=cek) {
                    jumlah += i;
                }
            }
        }
        System.out.println(jumlah);
    }
    public static int jumlahDigit(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
