package java_core.com;

public class MyMath {
    public final static int number = 30;
    public final static int number1 = 55;
    public final static int number2 = 100;


    public static int plus(int a, int b ){
        int sum = a + b;
        System.out.println("сумма числа а і b = " + sum);
        return sum;
    }

    public static int minus(int a, int b){
        int diff = a - b;
                System.out.println("різниця числа а і b = " + diff);
        return diff;
    }

    public static int root(int a, int b ){
        int rt = (a + b)*2;
        System.out.println("корінь числа а і b = "+rt);
        return rt;
    }

    public static int result (){
        int num1 = number;
        int num2 = number1;
        int num3 = number2;
        int res = num1+num2+num3;
        System.out.println("сумма констант number, number1, number2 = "+ res);
        return res;
    }

    public static void main(String [] args){
        plus(4, 78);
        minus(56, 8);
        root(54, 7);
        result();
    }
}

