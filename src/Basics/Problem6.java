package Basics;

public class Problem6 {
    public static void main(String[] args) {
        //Write a Program to Swap Two Numbers

        //Variables
        int firstNumber,secondNumber,temp;

        firstNumber = 85;
        secondNumber = 96;
        System.out.println("First number Before Swap is : " + firstNumber);
        System.out.println("Second number Before Swap is : " + secondNumber);

        //Swap logic
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("First number After Swap is : " + firstNumber);
        System.out.println("Second number After Swap is : " + secondNumber);


    }
}
