import java.util.Scanner;
public class greatestofthemall {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner g = new Scanner(System.in);

        System.out.println("Enter first number");
        System.out.println("Enter Second Number");```````````````````````````````````


        num1 = g.nextInt();
        num2 = g.nextInt();


        if (num1 > num2){
            System.out.println("Number "+num1+" is greater");


        } else if (num2 > num1) {
            System.out.println("Number " +num2+ " is greater.");


        } else{
            System.out.println("Invalid Input");  //In case number given is equal
        }
    }
}
