package Basics;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        //Write a Program to Add Two Integer Numbers Entered by User

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Variables
        int num1,num2,product;

        //Input
        System.out.print("Enter First Number : ");
        num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        num2 = sc.nextInt();

        product = num1 + num2;
        System.out.println("The Addition of Both number is :" + product);

    }
}
