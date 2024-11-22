package com.careerit.cj.day2;

public class DataTypesSize {

    public static void main(String[] args) {

        System.out.println("Byte size : " + Byte.BYTES + " bits : " + Byte.SIZE + " bytes : " + Byte.MIN_VALUE + " : " + Byte.MAX_VALUE);
        System.out.println("Short size : " + Short.BYTES + " bits : " + Short.SIZE + " bytes : " + Short.MIN_VALUE + " : " + Short.MAX_VALUE);
        System.out.println("Int size : " + Integer.BYTES + " bits : " + Integer.SIZE + " bytes : " + Integer.MIN_VALUE + " : " + Integer.MAX_VALUE);
        System.out.println("Long size : " + Long.BYTES + " bits : " + Long.SIZE + " bytes : " + Long.MIN_VALUE + " : " + Long.MAX_VALUE);

        System.out.println("Float size : " + Float.BYTES + " bits : " + Float.SIZE + " bytes : " + Float.MIN_VALUE + " : " + Float.MAX_VALUE);
        System.out.println("Double size : " + Double.BYTES + " bits : " + Double.SIZE + " bytes : " + Double.MIN_VALUE + " : " + Double.MAX_VALUE);

        System.out.println("Char size : " + Character.BYTES + " bits : " + Character.SIZE + " bytes : " + (int)Character.MIN_VALUE + " : " + (int)Character.MAX_VALUE);
        System.out.println("Boolean size : 1 bit : 1 byte : " + Boolean.FALSE + " : " + Boolean.TRUE);

    }
}
