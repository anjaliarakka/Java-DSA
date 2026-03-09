package com.anjali.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void examples() {

// Using a FileReader without a try-with-resources statement risks resource leaks because the close() method is not guaranteed to be called, potentially causing performance issues or preventing file access. The try-with-resources statement, introduced in Java 7, ensures that resources are automatically closed when the try block terminates, even if an exception occurs.

// The Recommended Solution: try-with-resources
//The try-with-resources statement is the standard and safest way to manage resources in modern Java. Any class that implements the AutoCloseable interface (which FileReader does) can be used within this statement.

        try {
            FileReader file = new FileReader("file.txt"); // FileNotFoundException
            file.read(); //IOException
        }
//        catch (FileNotFoundException | IOException ex) {
//            ex.getStackTrace();
//        }

        catch (IOException ex) {
            //Types in multi-catch must be disjoint: 'java. io. FileNotFoundException' is a subclass of 'java. io. IOException'
            ex.getStackTrace();
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("finally block will be executed no matter what");
        }

// try-with-resources statement

        try(FileReader file = new FileReader("test.txt")) {
            // Resources declared within the parentheses are automatically closed

        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



    }
}
