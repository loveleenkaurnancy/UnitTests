package kitkatstudio.com.unittests;

public class MyCalculator {

    public static int add(int a, int b)
    {
        return a+b;
    }

    public static int subtract(int a, int b)
    {
        return a-b;
    }

    public static int multiply(int a, int b)
    {
        return a*b;
    }

    public static String divide(int a, int b)
    {
        if(a==0 && b==0){
            return "NOT DEFINED";
        }
        else if(b==0){
            return "INFINITY";
        }
        else {
            return String.valueOf(a/b);
        }
    }
}
