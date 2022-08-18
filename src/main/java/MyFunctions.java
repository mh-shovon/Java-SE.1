import java.util.Scanner;

public class MyFunctions {
    public static void main(String[] args) {
        sayHello();
        int sum = doSum(10, 5);
        System.out.println(sum);
        doMultiply(sum);
    }
    public static void sayHello(){
        System.out.println("Hello Java");
    }
    public static int doSum(int a, int b){
        return a+b;
    }
    public static void doMultiply(int a){
        System.out.println(a*2);
    }
}
