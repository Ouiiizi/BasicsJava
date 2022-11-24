public class streeng {
    public static void main(String[] args) {
        String z = "Ram";
        String x = "Ram";

        String y = new String("Ram");
        System.out.println(x);
        System.out.println(y);


        boolean res, res2, res3, res4;

        res = (x==y);
        System.out.println(res);

        res2 = (x==z);
        System.out.println(res2);


        res3 =(x.equals(y));
        res4 = (x.equals(z));


        System.out.println(res3);
        System.out.println(res4);


    }
}
```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````