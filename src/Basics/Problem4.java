package Basics;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        /*Write a program where the user is asked to enter two
        integers (divisor and dividend) and the quotient and the
        remainder of their division is computed.(Both divisor and
        dividend should be integers.)*/

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //variables
        int divisor,dividend,quotient,remainder;

        //input form the user
        System.out.print("Enter the value of divisor : ");
        divisor = sc.nextInt();

        System.out.print("Enter the value of dividend : ");
        dividend = sc.nextInt();

        //output
        quotient = dividend / divisor;
        System.out.println("Quotient is : " + quotient);

        remainder = dividend % divisor;
        System.out.println("Remainder is : " + remainder);

    }
}
