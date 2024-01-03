package PW.Loops_Assignment;

import java.util.Scanner;

public class q1_sumofNatural {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the the end : ");
        int n = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n ; i++) {
           sum += i;
        }
        System.out.println(sum);
    }
}
