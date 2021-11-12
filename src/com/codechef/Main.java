package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*  An integer t, 1<=t<=100, denoting the number of testcases,
        followed by t lines, each containing a single integer n, 1<=n<=100.
        Output
        For each integer n given at input, display a line with the value of n!

        Example
        Sample input:
        4
        1
        2
        5
        3
        Sample output:

        1
        2
        120
        6
                */

        Scanner sc = new Scanner(System.in);
        int t, number, fact = 1;
        t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(factorial(n));
        }
    }
    static int  factorial(int n){
        int fact = 1;
        for(int i=0;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
}
