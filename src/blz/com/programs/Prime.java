package blz.com.programs;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    prime();
    }

    static void prime() {
        int i = 2;
        boolean flag = false;
        System.out.println("Enter a number to check Prime or not a Prime");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (i <= num / 2) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

}



