package org.one;

import java.io.DataInputStream;
import java.io.IOException;

public class ProgramOe {
	public static int sum(int n) {
		if(n==0)
			return(0);
		else
			return(n+sum(n-1));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter the no: ");
		n=Integer.parseInt(d.readLine());
		ProgramOe r1= new ProgramOe();
		System.out.println("sum of series" +(r1.sum(n+1)));
	}
}
