package blz.com.programs;

import java.util.Scanner;

public class Fibonacci {
    static void fibonacci(){
         int first = 0, second = 1;
        System.out.println("enter the range to print series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(first + ", ");

            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
    }

    public static void main(String[] args) {
            fibonacci();
    }
}

