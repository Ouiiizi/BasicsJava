import java.util.Scanner;
public class sumofthree {
    public static void main(String[] args) {
        int numa;
        int numb;
        int numc;

        int sum;


        Scanner three = new Scanner(System.in);
        System.out.println("Enter First Number");
        System.out.println("Enter Second Number");
        System.out.println("Enter Third Number");


        numa = three.nextInt();
        numb = three.nextInt();
        numc = three.nextInt();


        sum = numa + numb + numc;

        System.out.println("Sum is: " +sum);`````````````````````

    }

}
