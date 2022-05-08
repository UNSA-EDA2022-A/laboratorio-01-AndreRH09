package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}
	public Integer getMenorNumeroSaltos(int a []) {
		int aux = 0;
		int saltos = 0;
		int i;

		for (i = (a.length - 1); i >= 0 ; i--) {

		    if(a[i] > a[i-1]+50)
			return -1;


		    if(aux + 50  >= a[a.length - 1])
			return ++saltos;

		    if(aux + 50 >= a[i]){
			saltos++;
			aux= a[i];
			i = a.length ;
		    }
		}
		return -1;
	    }
}
