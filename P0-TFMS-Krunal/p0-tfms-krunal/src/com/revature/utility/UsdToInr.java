package com.revature.utility;

import java.util.Scanner;

public class UsdToInr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Click 1 ---> USD to INR \nClick 2 ---> INR to USD");
		int click = sc.nextInt();
		if(click==1) {
			System.out.print("Enter ammount: ");
			double usd = sc.nextInt();
			double inr = 82.521*usd;
			System.out.print(""+usd+" USD in INR is equal to Rs "+inr);
		}
		else if(click==2) {
			System.out.print("Enter ammount: ");
			double inr = sc.nextInt();
			double usd = 0.012*inr;
			System.out.print(""+inr+" INR in USD is equal to USD "+usd);
		}
		else {
			System.out.println("Unfortunatly you clicked wrong key!\nPlease click valid key !");
		}

		sc.close();
	}

}
