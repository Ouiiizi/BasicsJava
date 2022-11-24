





        import java.util.Scanner;
public class homeowr {

    public static void main(String[] args) {
        // WAP to find sum of two numbers
        int numa;
        int numb;
        Scanner wow = new Scanner(System.in);
        System.out.println("Wow enter value pls[1]");
        Scanner wowa = new Scanner(System.in);
        System.out.println("Wow enter value pls[2]");
        numa = wow.nextInt();
        numb = wowa.nextInt();
        int sum = numa + numb;
        System.out.println("sum is " + sum);

        //WAP to find the area of a triangle
        int base;
        int perpendicular;
        Scanner bas3 = new Scanner(System.in);
        System.out.println("Enter value of length o````````````````f` `ba`se"`);``
        Scanner perpendicul4r = new Scanner(System.in);```````````````````````````````````````````````````````````````````````````````````````````````````
        System.out.println("Enter value of length of perpendicular");

        base = bas3.nextInt();
        perpendicular = perpendicul4r.nextInt();
        double area = 0.5 * base * perpendicular;
        System.out.println("Area of Triangle = " + area);


        //WAP to find area of a circle
        int radius;
        Scanner rad = new Scanner(System.in);
        System.out.println("Enter value of radius");
        radius = rad.nextInt();
        double areaofcircle = 3.14 * radius * radius;
        System.out.println("Area of circle is: " + areaofcircle);

        //WAP to find area of a square
        int length;
        Scanner len = new Scanner(System.in);
        System.out.println("Enter length of square");
        length = len.nextInt();
        double areaofsquare = length * length;
        System.out.println("Area of Square is:" + areaofsquare);


        //WAP to find perimeter of square
        int lenofsquare;
        Scanner l3n = new Scanner(System.in);
        System.out.println("Enter length of Square");
        lenofsquare = l3n.nextInt();
        double perimeterofsquare = lenofsquare * 4;
        System.out.println("Perimeter of Square is: " + perimeterofsquare);


        //WAP to find perimeter of a rectangle
        int lenofrectangle;
        int breadthofrectangle;
        Scanner reclen = new Scanner(System.in);
        System.out.println("Enter length of rectangle");

        Scanner recbre = new Scanner(System.in);
        System.out.println("Enter breadth of rectangle");

        lenofrectangle = reclen.nextInt();
        breadthofrectangle = recbre.nextInt();


        int perimeterofrectangle = 2 * (lenofrectangle + breadthofrectangle);
        System.out.println("Perimeter of rectangle is: " + perimeterofrectangle);


        //WAP to find Simple Interest
        int principle;
        int time;
        double rate;
        Scanner P = new Scanner(System.in);
        System.out.println("Enter Principle");
        Scanner T = new Scanner(System.in);
        System.out.println("Enter Time");
        Scanner R = new Scanner(System.in);
        System.out.println("Enter Rate");

        principle = P.nextInt();
        time = T.nextInt();
        rate = R.nextInt();
        double SI = (principle * time * rate) / 100;
        System.out.println("The Simple Interest is: " + SI);


        //WAP to find gravity of earth    F = G * (m1 * m2) / d^2
        double Force;
        double Gravitation;
        int mass1;

        int distance;

        Scanner m1 = new Scanner(System.in);
        System.out.println("Enter mass of smaller body");


        Scanner d = new Scanner(System.in);
        System.out.println("Enter the distance between them");

        Gravitation = 6.674e-11;

        mass1 = m1.nextInt();
        distance = d.nextInt();


        Force = Gravitation * (mass1 / (distance ^ 2));
        System.out.println("The Gravity of Earth is" + Force);


        //WAP to find speed of vehicle when distance and time is given
        double s;
        double tim3;

        Scanner distanceofvehicle = new Scanner(System.in);
        System.out.println("Enter the distance covered by the vehicle");
        Scanner timeofvehicle = new Scanner(System.in);
        System.out.println("Enter the time taken by the vehicle to cover the given distance");
        s = distanceofvehicle.nextInt();
        tim3 = timeofvehicle.nextInt();

        double speed = s / tim3;
        System.out.println("Speed of vehicle is " + speed);


        //WAP to convert Faranhiet to Celsius
        double Faranhiet;
        double Celsius;
        Scanner F = new Scanner(System.in);
        System.out.println("Enter Temperature in Faranhiet");
        Faranhiet = F.nextInt();
        Celsius = (Faranhiet - 32) * 5 / 9;
        System.out.println("Value of temperature in Celsius is" + Celsius);


        //WAP to convert m into KM
        double m;
        double km;
        Scanner metre = new Scanner(System.in);
        System.out.println("Enter length(in metre)");
        m = metre.nextInt();

        km = m * 1000;
        System.out.println("Converted Value: " + km);

        //WAP to convert KM to m
        double mtr;
        double kmtr;
        Scanner kmt = new Scanner(System.in);
        System.out.println("Enter length in kilometer");
        kmtr = kmt.nextInt();
        mtr = kmtr/1000;
        System.out.println("Converted value: " +mtr);




    }

}