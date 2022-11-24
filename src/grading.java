
import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
            double english;
            double nepali;
            double maths;
            double computer;
            double physics;
            double chemsitry;
            int total = 600;
            double gpa;
            double percentage;

            Scanner eng = new Scanner(System.in);
            System.out.println("Enter marks of english");
            Scanner nep = new Scanner(System.in);
            System.out.println("Enter marks of Nepali");
            Scanner mafs = new Scanner(System.in);
            System.out.println("Enter Marks of maths");
            Scanner comp = new Scanner(System.in);
            System.out.println("Enter marks of Computer");
            Scanner phys = new Scanner(System.in);
            System.out.println("Enter marks in physics");
            Scanner chem = new Scanner(System.in);
            System.out.println("Enter marks in Chemistry");
``````````````````````````````````

            english = eng.nextInt();
            nepali = nep.nextInt();
            maths = mafs.nextInt();
            computer = comp.nextInt();
            physics = phys.nextInt();
            chemsitry = chem.nextInt();
``````
            double scored = english + nepali + maths + computer + physics + chemsitry;


            percentage = (scored / total) * 100;
            gpa = (percentage / 100) * 4;
            if (percentage > 90){
                    System.out.println("Scored A+");
            } else if (89 > percentage && percentage > 80) {
                    System.out.println("Scored A");
            } else if (79 > percentage && percentage > 70) {
                    System.out.println("Scored B+");
            } else if(69 > percentage && percentage > 60) {
                    System.out.println("Scored B");
            } else if(59>percentage && percentage > 50){
                    System.out.println("Scored C+");
            } else if( percentage < 50){
                    System.out.println("failed.");
            } else {
                    System.out.println("Invalid marks.");
            }
            System.out.println("---------------------------------------------------------------");
            System.out.println("GPA is => " +gpa);
            System.out.println("Percentage is =>" +percentage);
            System.out.println("---------------------------------------------------------------");
    }

}
``````