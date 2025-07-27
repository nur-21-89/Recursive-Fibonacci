package IkinciHafta;
import java.util.Scanner;

public class Fibonacci {
    static int fib(int n){

        if ( n ==1 || n==2){
                return 1;
        }
        return fib(n-1)+fib(n-2);
    }
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Fibonacci Serisi Eleman Sayısı:");
    int num = input.nextInt();
    System.out.print(fib(num));

    }
}
