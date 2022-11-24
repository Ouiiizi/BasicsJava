
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double num1;
                double num2;
                int or;
                Scanner number1 = new Scanner(System.in);
        System.out.println("Enter the first number");
        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter the second number");
        Scanner operator = new Scanner(System.in);
        System.out.println("What operator to be performed? [1 for addition] [2 for subtraction] [3 for multiplication] [4 for Division]");

        num1 = number1.nextInt();
        num2 = number2.nextInt();
        or = operator.nextInt();

        if ( or == 1){
            double sum = num1 + num2;
            System.out.println(sum + " is the number after addition");

        } else if(or == 2) {
            double diff = num1 - num2;
            System.out.println(diff + " is the number after subtraction");
        } else if(or == 3){

            double mul = num1 * num2;
            System.out.println(mul +" is the number after multiplication");
        } else if(or == 4 ){
            double div = num1 / num2;
            System.out.println(div + "is the number after division");
        } else {
            System.out.println("Invalid number");
        }


    }
}
