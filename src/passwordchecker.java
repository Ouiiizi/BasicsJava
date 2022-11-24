
//WAP to create a password checker
import java.util.Scanner;

public class passwordchecker {
    public static void main(String[] args) {

        int password1;
        int password2;

        Scanner p1 = new Scanner(System.in);
        System.out.println("Enter your password(numeric)");

        Scanner p2 = new Scanner(System.in);
        System.out.println("Retype your password [numeric]");

    password1 = p1.nextInt();
    password2 = p2.nextInt();


    if (password1 == password2) {
        System.out.println("Both passwords are same you can log in.");

    } else {
        System.out.println("Password not same, retype your password again.");
    }


    }

}
