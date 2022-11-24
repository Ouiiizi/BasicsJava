
import java.util.Scanner;
public class bill {
    public static void main(String[] args) {
        int checkout;
        int VAT;
        int q1;
        int q2;
        int q3;

        int pr1;
        int pr2;
        int pr3;


        pr1 = 300;
        pr2 = 450;
        pr3 = 650;



        Scanner quantity1 = new Scanner(System.in);
        System.out.println("Product 1 Value = 300 => How much you need: ");
        Scanner quantity2 = new Scanner(System.in);
        System.out.println("Product 2 Value = 450 => How much you need: ");
        Scanner quantity3 = new Scanner(System.in);
        System.out.println("Product 3 Value = 650 => How much you need: ");


        q1 = quantity1.nextInt();
        q2 = quantity2.nextInt();
        q3 = quantity3.nextInt();

        int prod1 = q1 * pr1;
        int prod2 = q2 * pr2;
        int prod3 = q3 * pr3;

        System.out.println(prod1 + "<= Cost of First product");
        System.out.println(prod2 + "<= Cost of Second Product");
        System.out.println(prod3 + "<= Cost of Third Product");

        System.out.println("------------------------------------------------------------------------------------------------------");

        int total = prod1 + prod2 + prod3;
        if(total > 1000 && total < 4999){
         double discfirst = (total - (0.2 * total)) + (0.13*total);
            System.out.println("Your Total after 20% discount and 13% VAT is: " + discfirst);
        } else if( total > 5000 && total < 9999) {
            double discsecond = total - (0.35*total) + (0.13*total);
            System.out.println("Total value after 35% discount and 13% VAT is: " +discsecond);
        } else if (total > 1000) {
            double VATTO = total + (0.13*total);
            System.out.println("You shopped for less than 1000, so no discount was applied, your total value with 13% VAT is: " +VATTO);

        } else if (total > 10000){
            double disc10k = total - (0.5*total) + (0.13*total);
            System.out.println("Your total value after 50% discount and 13% VAT is: " +disc10k);
        }

        Scanner c = new Scanner(System.in);
        System.out.println("Want to checkout?[1 for Yes] [2 for No] ");
        checkout = c.nextInt();


        if ( checkout == 1) {
            System.out.println("Checked out");

        } else {
            System.out.println("Order Cancelled");
        }
        System.out.println("---------------------------------------------------------------------------------------------------");
    }



}
