package basics;

// Topic : Conditional Statements
// Description : Understanding conditional statements including if, if-else, else-if, nested-if and switch.

import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // If statement
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("You are eligible to vote");
        }

        // If-else statement
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
        input.close();
    }
}
