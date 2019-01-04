package main;

import fraction.FractionDefinition;

public class Main {
	
	public static void main(String[] args) {
		FractionDefinition a = new FractionDefinition(2,1);
		System.out.println(a);
		int b = a.Divide();
		System.out.println(b);
	}
	
	
}
