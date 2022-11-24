//2) WAP to simulate the following scenario :
//Input cost price of an item from user.
//Take percetage as input and add Marked Price in accordance
//Ask discount as input and calculate selling price
//Ask if vat is needed or not and calculate SP with Vat
//Calculate the amount of profit or loss received.
import java.util.Scanner;
public class billscenario {
    public static void main(String[] args) {
        double item;
        double CP;
        double MP;
        double D = 0.2;
        double SP1 = 600;
        double SP2 = 503;
        double VAT = 0.13;
        double profit;
        double loss;
        double itemA = 450;
        double itemB = 650;
        double prodsell;
        double itemsell;
// ---------------------------------------------------------------------------------------------------------------------------------------------
        Scanner simple = new Scanner(System.in);
        System.out.println("Pick Item => 1 or 2");
        System.out.println("If you want to sell the product type 1, if not type 2.");

        item = simple.nextInt();
        prodsell = simple.nextInt();
        if(item == 1) {

            System.out.println("Item A was bought for: " + itemA);
            System.out.println("Selling Price of the given item is: " + SP1);
            if(prodsell == 1){


               itemsell = SP1 - (SP1*D) + (SP1*VAT);
                System.out.println("Product Sold at: " +itemsell);


            } else if(prodsell == 2){

                System.out.println("Product Kept.");
            } else {
                System.out.println("Invalid input");
            }


        } else if(item == 2){


            System.out.println("Item B was bought for: " +itemB);
            System.out.println("Selling price of given item is: " + SP2);


            if(prodsell == 1){

               double itemsell2 = SP2 - (SP2*D) + (SP2*VAT);
                System.out.println("Product Sold at: " +itemsell2);


            } else if(prodsell == 2){

                System.out.println("Product Kept.");
            } else {
                System.out.println("Invalid input");
            }
        } else {

            System.out.println("Invalid Input");


        }




    }
}
