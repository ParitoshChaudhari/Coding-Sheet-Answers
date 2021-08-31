package If_Else;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        /*Write a Program to Check Whether a Character is
        Vowel or Consonant.*/

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Variable
        String userInput; //Taken string because we don't have any function for char input
        char userChar;

        //Input
        System.out.print("Enter your character : ");
        userInput = sc.next();
        userChar = userInput.charAt(0); //with the help of it we can extract char from a string

        //if-else
        if((userChar=='a') || (userChar=='e') || (userChar=='i') || (userChar=='o') || (userChar=='u')){
            System.out.println("You have enter Vowel");
        }else{
            System.out.println("You have enter Consonant");
        }
    }
}
