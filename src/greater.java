import java.util.Scanner;
public class greater {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;


        Scanner number = new Scanner(System.in);
        System.out.println("Enter your first number");
        System.out.println("Enter your second number");
        System.out.println("Enter your third number");


        num1 = number.nextInt();
        num2 = number.nextInt();
        num3 = number.nextInt();


        if (num1 > num2 && num1 > num3){ //
            System.out.println("The first number is greater");

        } else if (num2 > num3 && num2 > num1) {
            System.out.println("The second number is greater");
        } else if (num3 > num2 && num3 > num1){
            System.out.println("The third number is greater");
        } else {
            System.out.println("Invalid input");
        }

    }




}
