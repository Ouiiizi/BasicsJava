import java.util.Scanner;

public class usandpas {
    public static void main(String[] args) {
        Scanner usern = new Scanner(System.in);
        System.out.println("Enter Username");
        String user = usern.nextLine();


        System.out.println("Enter Password");
        String pass = usern.nextLine();


        System.out.println("Confirm Your password");
        String pass2 = usern.nextLine();


//        if (pass2.equals(pass){
//
//
//        } else {
//            System.out.println("Username is" +user);
//            System.out.println("Password Not Same. Not registered");
//
//        }

        if( pass2.equals(pass)) {

            System.out.println("Username is " +user);
            System.out.println("Password Same. Registered User");

        } else {

            System.out.println("Username is "+user);
            System.out.println("Password not Same. User Not registered");
        }

    }


    }

