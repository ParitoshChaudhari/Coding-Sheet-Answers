package Basics;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        /* Write a Program to Multiply two decimal Numbers
        entered by User*/

        //Scanner object
        Scanner sc = new Scanner(System.in);

        float numberFirst,numberSecond,answer;

        //Input
        System.out.print("Enter First number : ");
        numberFirst = sc.nextFloat();

        System.out.print("Enter Second Number : ");
        numberSecond = sc.nextFloat();

        //output
        answer = numberFirst * numberSecond;
        System.out.println("Answer is : " + answer);

    }
}
