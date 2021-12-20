package com.greatlearning.dsa;

import java.util.Scanner;

public class Transaction {
	
	public static void main(String[] args ) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int size = scan1.nextInt();
		int[] transactions = new int[size];
		System.out.println("Enter the values of transaction");
		/*
		 * transactions[0]..transactions[1]..transactions[2]..transactions[3]..transactions[size]
		 */
		for(int i=0;i<size;i++) {
		transactions[i] =  scan1.nextInt();
	
		}
		
	System.out.println("Enter the total number of targets that is to be achieved");	
	int targetNo = scan1.nextInt();
	while(targetNo > 0) {
		int flag = 0;
		int target;
		System.out.println("Enter the value of target");
		target = scan1.nextInt();
		long sumOfTransactions = 0;
		for(int i=0;i<size;i++) {
		sumOfTransactions = sumOfTransactions + transactions[i];
		if(sumOfTransactions >= target ) {
			System.out.println("Targets achieved after" +(i+1) + "transaction");
			flag = 1;
			break;
			}	
		
		}
		
		if(flag==0) {
			System.out.println("target is not achieved");
			
		}
		
		targetNo--;
		
	}
		
	System.out.println("you have finished your target");
	}

}
