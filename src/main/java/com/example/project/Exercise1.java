package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}
	
	
	public String convertirBaseGabriel(int a) {
		int sig = 0;
		String fig = Integer.toString(a);
		double result=0;
		double aux;

		for (int i = 0; i < fig.length(); i++) {
		    aux = fig.length()-i;

		    if((sig>0 && num(fig,i) > 0) || num(fig,i)>2)
			return "El numero proporcionado no esta en base Gabriel.";
		    if(num(fig, i) == 2)
			sig++;

		    result = (num(fig, i)*((Math.pow(2, aux))-1))+result;
		}

		return Integer.toString((int)result);
	    }
	
	public static int num(String fig,int i) {
		return Integer.parseInt(fig.substring(i,i+1));
	}
}
