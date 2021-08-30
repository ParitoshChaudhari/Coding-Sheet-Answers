package Basics;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        //Write a Program to Print Integer Number Entered by User

        //Scanner object
        Scanner sc = new Scanner(System.in);

        int userNum;
        System.out.print("Enter the Number Which You Want to print : ");
        userNum = sc.nextInt();
        System.out.println("Your Number is : " + userNum);
    }
}
