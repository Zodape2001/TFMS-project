package com.revature.utility;

import java.util.Scanner;

public class UsdToInrAndInrToUsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Click 1 ---> USD to INR \nClick 2 ---> INR to USD");
		double click = sc.nextDouble();
		if(click==1) {
			System.out.print("Enter ammount: ");
			double usd = sc.nextDouble();
			double inr = 82.521*usd;
			System.out.print(""+usd+" USD in INR is equal to Rs "+inr);
		}
		else if(click==2) {
			System.out.print("Enter ammount: ");
			double inr = sc.nextDouble();
			int usd = (int) (0.01212*inr);
			System.out.print(""+inr+" INR in USD is equal to USD "+usd);
		}
		else {
			System.out.println("Unfortunatly you clicked wrong key!\nPlease click valid key !");
		}

		sc.close();
	}

}
