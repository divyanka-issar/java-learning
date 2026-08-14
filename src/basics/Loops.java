package basics;

// Topic : Loops in java
// Description : Understanding different types of loops in java.

public class Loops {
    public static void main(String[] args){

        // for Loop
        System.out.println("For loop:");
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }

        // while loop
        System.out.println("While loop:");
        int j=2;
        while(j<=6){
            System.out.println(j);
            j++;
        }

        // do-while loop
        System.out.println("Do-while loop:");
        int k=3;
        do{
            System.out.println(k);
            k++;
        }while(k<=9);

        // nested loop
        System.out.println("Nested loop:");
        for(int i=3;i<=7;i++){
            for(int a=0;a<=5;a++){
                System.out.println(i +" "+a);
            }
        }

        // break
        System.out.println("Break:");
        for(int i=4;i<=8;i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }

        // continue
        System.out.println("Continue:");
        for(int i=4;i<=8;i++){
            if(i==6){
                continue;
            }
            System.out.println(i);
        }
    }
}
