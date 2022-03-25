package blz.com.programs;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
    prime();
    }

    static void prime() {

        System.out.println("Enter a no to check prime or not");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        for (int i = 2; i < no; i++) {
            if (no % i == 0) {
                System.out.println("Number is not a prime");

            }

            else{
            System.out.println("Number is prime");
        }
     }

    }
}


