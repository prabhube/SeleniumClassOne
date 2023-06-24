package org.one;

public class ConstructorOne {

	public ConstructorOne() {
		this("ram");
		System.out.println("raja");
	
	}
	public ConstructorOne(String value) {
		this("praba",32);
		System.out.println("prem");
	}
	public ConstructorOne(String name,int a) {
		System.out.println("prabhu");
	}
	public static void main(String[] args) {
		ConstructorOne c= new ConstructorOne();
		
	}
}
