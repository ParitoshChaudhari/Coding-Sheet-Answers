package If_Else;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        /*Write a Program to Check whether a year entered by
        user is Leap Year or not*/

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //variable
        int year;

        //input
        System.out.print("Enter year : ");
        year = sc.nextInt();

        //if-else
        if((year%4==0)||(year%100==0)||(year%400==0)){
            System.out.println("Year " + year +" is a leap year");
        }else{
            System.out.println("Year " + year +" is a not a leap year");
        }
    }
}
