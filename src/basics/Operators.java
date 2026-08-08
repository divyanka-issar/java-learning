package basics;

// Topic: Operators
// Description: Understanding different types of operators in Java.

public class Operators {
    public static void main(String[] args){

        // Arithmetic Operators
        int num1 = 20;
        int num2 = 6;

        System.out.println("Arithmetic Operators");
        System.out.println("Addition:" + (num1 + num2));
        System.out.println("Subtraction:" + (num1 - num2));
        System.out.println("Multiplication:" + (num1 * num2));
        System.out.println("Division:" + (num1 / num2));
        System.out.println("Modulus:" + (num1 % num2));
        System.out.println();

        // Assignment Operator
        int num = 16;

        System.out.println("Assignment operators");
        num +=5;
        System.out.println("After +=5:" + num);
        num -=2;
        System.out.println("After -=2:" + num);
        num *=3;
        System.out.println("After *=3:" + num);
        num /=4;
        System.out.println("After /=4:" + num);
        num %=7;
        System.out.println("After %=7:" + num);
        System.out.println();

        // Relational Operators
        int a = 16;
        int b = 38;

        System.out.println("Relational Operators");
        System.out.println("a > b:" + (a>b));
        System.out.println("a < b:" + (a<b));
        System.out.println("a >= b:" + (a>=b));
        System.out.println("a >= b:" + (a>=b));
        System.out.println("a == b:" + (a==b));
        System.out.println("a != b:" + (a!=b));
        System.out.println();

        // Logical Operators
        boolean java = false;
        boolean dsa = true;

        System.out.println("Logical Operators");
        System.out.println("Java:" + java);
        System.out.println("Dsa:" + dsa);
        System.out.println("Java && Dsa :" + (java && dsa));
        System.out.println("Java || Dsa :" + (java || dsa));
        System.out.println("!Java :" + (!java));
        System.out.println("!Dsa :" + (!dsa));
        System.out.println();

        // Ternary Operators
        int number = 10;
        String result = (number % 2 == 0)? "even" : "odd";

        System.out.println("Ternary Operator");
        System.out.println("Number: " + number);
        System.out.println("Result: " + result);
        System.out.println();

        // Unary Operators
        int marks = 15;

        System.out.println("Unary Operators");
        System.out.println("Initial value : " + marks);
        System.out.println("Post Increment : " + marks++);
        System.out.println("After increment : " + marks);
        System.out.println("Pre Increment : " + ++marks);
        System.out.println("Post Decrement : " + marks--);
        System.out.println("After Decrement : " + marks);
        System.out.println("Pre Decrement : " + --marks);
        System.out.println();

    }
}
