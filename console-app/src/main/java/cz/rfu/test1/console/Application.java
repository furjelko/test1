package cz.rfu.test1.console;


import java.util.InputMismatchException;
import java.util.Scanner;

class Application {
    public static void main(String[] args) {
        System.out.println("Apka zacina");
        Scanner myInput = new Scanner( System.in );

        try {
            System.out.print( "Enter first integer: " );
            int a = myInput.nextInt();

            System.out.print( "Enter second integer: " );
            int b = myInput.nextInt();

            System.out.println("A soucet je: " + (a + b));
        } catch (InputMismatchException e) {
            System.out.println("To si delas kozy");
        }
    }
}
