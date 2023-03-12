package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int i=5;
        // Step 2: Convert primitive variables to wrapper objects
        Integer j=new Integer(i);
        // Step 3: Print the values of the wrapper objects
        System.out.println("wrapped integer = " + j);
        // Step 4: Convert wrapper objects back to primitive variables
        i=j;
        // Step 5: Print the values of the primitive variables
        System.out.println("primitive i = " + i);

    }
}
