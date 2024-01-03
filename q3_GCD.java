package PW.Loops_Assignment;

import java.util.Scanner;

public class q3_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        int gdc= 0;
        if(num2>=num1)
        {
        for(int i = 1 ; i<= num2/2; i++){
            if(num1%i==0 && num2%i==0){
                System.out.println(i);
                if(i>gdc){
                    gdc = i;
                }
            }
        }
            System.out.println("Common Greatest Divisor : "+gdc);
        }
        else{
        for(int i = 1 ; i<= num1/2; i++){
            if(num1%i==0 && num2%i==0){
                System.out.println(i);
                if(i>gdc){
                    gdc = i;
                }
            }
        }
            System.out.println("Common Greatest Divisor : "+gdc);
        }
    }
}
