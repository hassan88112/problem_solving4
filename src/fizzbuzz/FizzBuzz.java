package fizzbuzz;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your number");
        int num = input.nextInt();
        
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("fizz");
        } else if (num % 5 == 0 ) {
            System.out.println("buzz");
        }else {
            System.out.println("enter valid number");
        }
    }

}