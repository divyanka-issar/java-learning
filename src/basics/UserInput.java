package basics;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = input.nextLine();

        System.out.println("Enter your age : ");
        int age = input.nextInt();

        System.out.println("Enter your CGPA : ");
        double CGPA = input.nextDouble();

        System.out.println("\nName : " + name);
        System.out.println("Age : " + age);
        System.out.println("CGPAD : " + CGPA);

        input.close();
    }
}
