package net.projecteuler;

public class Problem28 {
    public static void main(String[] args){
        int sum=0;
        for(int i=1;i<=500;i++){
            for(int n=1;n<=4;n++){
                int x = (2*i-1)*(2*i-1)+2*(i)*n;
                System.out.println(x);
                sum+=x;
            }
        }
        System.out.println(sum);
    }
}
