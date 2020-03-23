package com.syntax.class07;

import java.util.Scanner;

public class ScannerLottery {

	public static void main(String[] args) {
		// lottery luckynumber 5 ask to user guess 1 to 20

		Scanner scan = new Scanner(System.in);
		int num;
		int lnum=17;
		do {
		System.out.println("Please enter a number from 1 to 20");
		num=scan.nextInt();
	
		}while (num!=lnum);
		System.out.println("Congratulations ! ");
		
		}

	}


