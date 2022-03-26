package blz.com.programs;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Prefect();

    }
        static void Prefect(){
            int sum = 0;
            System.out.println("Enter a number to check Perfect or Not");
            Scanner a =new Scanner(System.in);
            int num = a.nextInt();
            for (int i=1; i<=num/2;i++ ) {
                if (num % i == 0) {
                    sum = sum + i;

                }
            }
                if(sum==num){
                    System.out.println("number is perfect");
                }
                else{
                    System.out.println("number is not perfect");
                }


        }

}
