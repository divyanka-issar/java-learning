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

        // else-if ladder statement
        System.out.println("Enter marks :");
        int marks = input.nextInt();
        if(marks >=90){
            System.out.println("Grade A");
        }
        else if(marks >=75){
            System.out.println("Grade B");
        }
        else if(marks >=50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }

        // nested-if statement
        System.out.println("Enter your standard :");
        int standard = input.nextInt();
        if(standard>=9){
            if(standard>=11){
                System.out.println("Senior high school");
            }
            else{
                System.out.println("Junior high school");
            }
        }
        else{
            System.out.println("You are a junior");
        }

        // switch statement
        System.out.println("Enter a number (1-3) :");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("You selected Java");
                break;
            case 2:
                System.out.println("You selected C++");
                break;
            case 3:
                System.out.println("You selected Python");
                break;
            default:
                System.out.println("Invalid choice");
        }
        input.close();
    }
}
