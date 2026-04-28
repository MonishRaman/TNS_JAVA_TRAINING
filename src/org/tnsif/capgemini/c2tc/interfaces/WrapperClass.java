package org.tnsif.capgemini.c2tc.interfaces;

public class WrapperClass {

	public static void main(String[] args) {
        //Autoboxing: primitive to wrapper class
        byte primitiveByte = 1;
        Byte wrapperByte = primitiveByte; // Autoboxing
        System.out.println("Autoboxed Byte: " + wrapperByte);
        
        //Unboxing: wrapper class to primitive
        byte unboxedByte = wrapperByte; // Unboxing
        System.out.println("\nUnboxed byte: " + unboxedByte);

        short primitiveShort = 2;
        Short wrapperShort = primitiveShort; // Autoboxing
        System.out.println("\nAutoboxed Short: " + wrapperShort);
        

        short unboxedShort = wrapperShort; // Unboxing
        System.out.println("\nUnboxed short: " + unboxedShort);

        int primitiveInt = 3;
        Integer wrapperInt = primitiveInt; // Autoboxing
        System.out.println("\nAutoboxed Integer: " + wrapperInt);
        

        int unboxedInt = wrapperInt; // Unboxing
        System.out.println("\nUnboxed int: " + unboxedInt);

        long primitiveLong = 4L;
        Long wrapperLong = primitiveLong; // Autoboxing
        System.out.println("\nAutoboxed Long: " + wrapperLong);

        long unboxedLong = wrapperLong; // Unboxing
        System.out.println("\nUnboxed long: " + unboxedLong);

        float primitiveFloat = 5.5f;
        Float wrapperFloat = primitiveFloat; // Autoboxing
        System.out.println("\nAutoboxed Float: " + wrapperFloat);
        

        float unboxedFloat = wrapperFloat; // Unboxing
        System.out.println("\nUnboxed float: " + unboxedFloat);

        double primitiveDouble = 6.6;
        Double wrapperDouble = primitiveDouble; // Autoboxing
        System.out.println("\nAutoboxed Double: " + wrapperDouble);
        

        double unboxedDouble = wrapperDouble; // Unboxing
        System.out.println("\nUnboxed double: " + unboxedDouble);


        char primitiveChar = 'a';
        Character wrapperChar = primitiveChar; // Autoboxing
        System.out.println("\nAutoboxed Character: " + wrapperChar);
        
        char unboxedChar = wrapperChar; // Unboxing
        System.out.println("\nUnboxed char: " + unboxedChar);

        boolean primitiveBoolean = true;
        Boolean wrapperBoolean = primitiveBoolean; // Autoboxing
        System.out.println("\nAutoboxed Boolean: " + wrapperBoolean);

        boolean unboxedBoolean = wrapperBoolean; // Unboxing
        System.out.println("\nUnboxed boolean: " + unboxedBoolean);
	}
}
