package com.dunky.exceptionshandling;

/*
Type of Exceptions in Java
***************************
 a) Checked exceptions and unchecked exceptions. Checked exceptions are those that the compiler
 forces you to handle, while unchecked exceptions are those that you are not required to handle.

1. Compile Time Exceptions: Are checked exceptions, if we don't follow Syntax of a particular language,
then compiler will complain.
 Eg: Cannot find symbol, Incompatible types, Invalid method declaration,
     (this) cannot be used inside a static context, IOException, FileNotFoundException, SQLException, etc.

2. Logical Errors (Runtime Exceptions): Is unchecked exceptions due to mistake made by us programmers such
as trying to divide by zero,
NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, IllegalArgumentException.
By handling unchecked exceptions, you can prevent your program from terminating abnormally.

3. Errors: such as OutOfMemoryError, NoClassDefinitionFound, NoSuchMethodError, etc.

NB: Exceptions classes in Java inherit from a parent class called [Throwable] which has two child classes:
    [Error] and [Exception]
    The Throwable class belongs to java.lang package.

    HANDLING EXCEPTIONS: Try-Catch, Throw, Finally, Throws
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExErrorTypes {

    private static double divide() {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter first integer: ");
            int b = sc.nextInt();
            result = a / b;
        } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by zero");
        }
        return result;

    }

    // Illegal Argument Exceptions
    private static int sum (int a, int b) {
        int sum = 0;
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("a and b cannot be zero");
        }
        sum = a + b;
        return sum;
    }

    // Checked Exception
    private static void readFile() throws FileNotFoundException {
        // Allows it to go to JVM Default Exception handler for handling.
       FileInputStream fs = new FileInputStream("D:/myfiles/file.txt");
    }

    public static void main(String[] args) {
        System.out.println("Result of division: " + divide());

        int[] arr = {10, 20, 30, 40};
        try {
            for (int i = 0; i <= arr.length; i++) {

                System.out.println("Array: " + arr[i]);

            }
            System.out.println("Reading file: ");
            readFile();
            // Multi catch statements
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds");
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } finally {
            System.out.println("Finally executed");
        }

        // Handling IllegalArgumentExceptions
        System.out.println("Sum of a and b is: " + sum(5, 0));

    }

}
