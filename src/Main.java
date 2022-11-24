

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //WAP to find the greatest number between two numbers|
        int numa;
        int numb;
        Scanner firstnum = new Scanner(System.in);
        System.out.println("Enter the first number");
        Scanner secondnum = new Scanner(System.in);
        System.out.println("Enter the Second number");
        numa = firstnum.nextInt();
        numb = secondnum.nextInt();

        if(numb < numa) {

            System.out.println("The second number is greater than the first one");

        } else {
            System.out.println("The first number is greater than the second one");
        }
    }
}