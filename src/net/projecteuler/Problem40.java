package net.projecteuler;

public class Problem40 {
    public static void main(String[] args){

        String s = "";
        int a = 1;
        while(s.length()<1000000){
            s = s.concat(Integer.toString(a));
            a++;
        }
        System.out.println(s.charAt(9));
        System.out.println(s.charAt(99));
        System.out.println(s.charAt(999));
        System.out.println(s.charAt(9999));
        System.out.println(s.charAt(99999));
    }
}
