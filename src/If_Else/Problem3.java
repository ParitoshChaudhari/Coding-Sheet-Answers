package If_Else;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        /*Write a Program to Find The Largest Number Among Three
        Numbers entered by users*/

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Variable
        int num1,num2,num3;

        //input
        System.out.print("Enter First Number : ");
        num1 = sc.nextInt();

        System.out.print("Enter Second Number : ");
        num2 = sc.nextInt();

        System.out.print("Enter Third Number : ");
        num3 = sc.nextInt();

        //if-else
        if((num1>=num2)&&(num1>=num3)){
            System.out.println("Greater Number is : " + num1);
        }
        else if((num2>=num1)&&(num2>=num3)){
            System.out.println("Greater Number is : " + num2);
        }
        else{
            System.out.println("Greater Number is : " + num3);
        }

    }
}
