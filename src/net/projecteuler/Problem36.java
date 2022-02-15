package net.projecteuler;

public class Problem36 {
    public static void main(String[] args) {

        //Palindrom di base 10 dan base 2

        int sum=0;
        for(int i=1;i<=1000000;i++){
            String des = Integer.toString(i);
            String bin = Integer.toBinaryString(i);
            if (palindrom(des)){
                if (palindrom(bin)){
                    sum +=i;
                }
            }
        }
        System.out.println(sum);

    }
    public static boolean palindrom(String tes){
        int i=0;
        int j=tes.length()-1;
        while(i<j){
            if(tes.charAt(i) != tes.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
