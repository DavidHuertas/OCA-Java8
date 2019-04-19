package com.dorchsoft.javaoca.chapter1.PrimitivesAndReferencesObjects;

public class PrimitivesAndLiterals {
	public static void main (String[] args) {
		int maxInteger = Integer.MAX_VALUE;
		int minInteger = Integer.MIN_VALUE;
		System.out.println("["+minInteger+", "+maxInteger+"]");
		
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		System.out.println("["+minLong+", "+maxLong+"]");
		
		long longNumber1 = (long) 123;
		long longNumber2 = 123L;
		long longNumber3 = 123;
		System.out.println(longNumber1+", "+longNumber2+", "+longNumber3);
		System.out.println("");
		System.out.println(017);
		System.out.println(0x1a);
		System.out.println(0b11);
		
		double horribleNumber = 1_0_00_00_0.0_0;
		System.out.println(horribleNumber);
		
	}
}
