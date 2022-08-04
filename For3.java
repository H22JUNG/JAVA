package com.goodee.basic1;

public class For3 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("--------------------1번--------------------");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------2번--------------------");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------3번--------------------");
		for(int i=n; i>=1; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------------------4번--------------------");
		for(int i=n; i>=1; i--) {
			for(int j=0; j<i-1; j++)
				System.out.print(" ");
			for(int k=i; k<=n; k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("--------------------5번--------------------");
		for(int i=n; i>0; i--) {
			for(int j=0; j<n-i; j++) 
				System.out.print(" ");
			for(int k=0; k<i; k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("--------------------6번--------------------");
		for(int i =0; i<n; i++) {
			for(int j=0; j<4-i; j++) 
				System.out.print(" ");
			for(int k=0; k<2*i+1; k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("--------------------7번--------------------");
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=n; i>=1; i--) {
			for(int j=0; j<i-1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		System.out.println("--------------------8번--------------------");
		for(int i=n; i>=1; i--) {
			for(int j=0; j<i-1; j++)
				System.out.print(" ");
			for(int k=i; k<=n; k++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n-1; i>0; i--) {
			for(int j=0; j<n-i; j++) 
				System.out.print(" ");
			for(int k=0; k<i; k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println("--------------------9번--------------------");
		int space = n - 1;
		for(int j=0; j<n; j++) {
			for(int i=0; i<4-j; i++) 
				System.out.print(" ");
			space--;
			for(int i=0; i<2*j+1; i++)
				System.out.print("*");
			System.out.println("");
		}
		space = 1;
		for(int j=1; j <= n - 1; j++) {
			for(int i = 1; i <= space; i++)
				System.out.print(" ");
			space++;
			for(int i = 1; i <= 2 * ( n - j ) - 1; i++)
				System.out.print("*");
			System.out.println("");
		}
	}

}
