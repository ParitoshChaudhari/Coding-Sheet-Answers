package If_Else;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        /*Write a Program which accepts coefficients of a
        quadratic equation from the user and displays the roots
        (both real and complex roots depending upon the
        discriminant).*/

        //Scanner Object
        Scanner sc = new Scanner(System.in);

        //Variables
        float a , b , c ,x1 , x2, discriminant , realPart , imaginaryPart;

        //Input
        System.out.print("Enter value of a :");
        a = sc.nextFloat();
        System.out.print("Enter value of b :");
        b = sc.nextFloat();
        System.out.print("Enter value of c :");
        c = sc.nextFloat();


        discriminant = b*b -4*a*c;

        //if-else
        if(discriminant>0){
            x1 = (float) ((-b + Math.sqrt(discriminant))/(2*a));
            x2 = (float) ((-b - Math.sqrt(discriminant))/(2*a));
            System.out.println("Roots are real and different ");
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);
        }
        else if(discriminant==0){
            x1 = (-b)/2*a;
            System.out.println("Roots are real and different");
            System.out.println("x1 = x2: " + x1);
        }
        else{
            realPart = -b/(2*a);
            imaginaryPart =(float) Math.sqrt(-discriminant)/(2*a);
            System.out.println("Roots are complex and different.");
            System.out.println("x1 " + realPart + "+" + "Imaginary part " + imaginaryPart + "i");
            System.out.println("x2 " + realPart + "-" + "Imaginary part " + imaginaryPart + "i");
        }
    }
}
