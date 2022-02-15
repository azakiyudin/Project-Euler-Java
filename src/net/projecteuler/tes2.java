package net.projecteuler;

public class tes2 {
    public static void main(String[] args){

        for(int n=1;n<20;n++){
            for(int r=1;r<n;r++){
                System.out.println(n + " " + r);
                System.out.println(kombin(n,r));

            }
            System.out.println();
        }
    }
    public static int fakt(int n){
        if(n==1)
            return 1;
        else
           return n * fakt(n-1);
    }
    public static int kombin(int n, int r){
        int sum = fakt(n)/(fakt(n-r)*fakt(r));
        return sum;
    }
}
