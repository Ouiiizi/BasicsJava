import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {

        double num1;
        double num2;

        Scanner div = new Scanner(System.in);
        System.out.println("Enter the First Number");
        System.out.println("Enter the second Number");
        num1 = div.nextInt();
        num2 = div.nextInt();


        double division = num2 / num1;

        System.out.println("The divided value is " +division);
    }



}
