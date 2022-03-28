package blz.com.programs;

import java.util.Scanner;

public class Perfect {

    public static void main(String[] args) {
        perfect();
    }

    static void perfect() {
        int sum = 0;
        int i;
        System.out.println("Enter a number to check Perfect or Not");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        for ( i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
                System.out.println("Divisors of "+num+ " are " +i);
            }

        }
        if (sum == num) {
            System.out.println("number is perfect");
        } else {
            System.out.println("number is not perfect");
        }
    }
}
