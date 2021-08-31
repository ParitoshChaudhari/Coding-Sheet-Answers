package If_Else;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        /*Write a Program to Check Whether Number is Even or
        Odd*/

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Variable
        int userNum;

        //input
        System.out.print("Enter your Number : ");
        userNum = sc.nextInt();

        //if-Else
        if((userNum%2)==0 ){
            System.out.println("Your Number is even number");
        }else{
            System.out.println("Your number is odd number");
        }
    }
}
