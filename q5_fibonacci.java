package PW.Loops_Assignment;
import java.util.Scanner;
public class q5_fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int n= sc.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1+", "+n2);
        for(int i = 3; i<=n;i++){
            n3= n1+n2;
            System.out.print(", "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
