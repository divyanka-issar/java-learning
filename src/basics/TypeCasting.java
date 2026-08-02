package basics;

// Topic: Type Casting
// Description: Understanding type casting, type promotion, data conversions and overflow.

public class TypeCasting {
    public static void main(String[] args){

        // Implicit type casting
        int num = 100;
        double number = num;
        System.out.println("Implicit Type Casting");
        System.out.println("Integer value:" + num);
        System.out.println("Double value:" + number);
        System.out.println();

        // Explicit type casting
        double price = 99.99;
        int amount =(int) price;
        System.out.println("Explicit Type Casting");
        System.out.println("Double value:" + price);
        System.out.println("Integer value:" + amount);
        System.out.println();

        // Character to Integer
        char c ='D';
        int letter = c;
        System.out.println("Character to Integer");
        System.out.println("Character value:" + c);
        System.out.println("Integer value:" + letter);
        System.out.println();

        // Integer to Character
        int code = 66;
        char character = (char) code;
        System.out.println("Integer to Character");
        System.out.println("Integer value:" + code);
        System.out.println("Character value:" + character);
        System.out.println();

        // Type Promotion
        byte a = 40;
        byte b = 60;
        int sum = a + b;
        System.out.println("Type promotion");
        System.out.println("Sum:" + sum);
        System.out.println();

        // Integer divison VS Floating point division
        int x = 6;
        int y = 4;
        System.out.println("Division");
        System.out.println("Integer divison:" + (x/y));
        System.out.println("Floating divison:" + ((double) x/y));
        System.out.println();

        // Average Calculation
        int marks1 = 85;
        int marks2 = 24;
        int marks3 = 69;
        double average = ( marks1 + marks2 + marks3 )/3.0;
        int avgInt = (int) average;
        System.out.println("Average of Numbers");
        System.out.println("Average (double):" + average);
        System.out.println("Average (int):" + avgInt);
        System.out.println();

        // Overflow
        byte max = 127;
        max++;
        System.out.println("Overflow Example");
        System.out.println("Value after increment:" + max);
    }
}



