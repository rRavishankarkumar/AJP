package com.studyjava;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[8];
		Scanner r=new Scanner(System.in);
		System.out.print("Enter elements in array ");
		for(int i=0; i < a.length; i++) {
			a[i]= r.nextInt();
		}
		System.out.println("array elements ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("array reverse elements ");
		for(int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]+ " ");
		}

	}


}
