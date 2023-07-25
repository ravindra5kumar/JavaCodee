package Lec_02;

import java.util.Scanner;

public class Pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//5
		int row=1;
		int space=n-1;
		int star=1;
		while(row<=n) {
			//space
			int i=1;
			while(i<=space) {
				System.out.print("  ");// yaha 2 sapce hoga 
				i=i+1;
			}
			//star
			int j=1;
			while(j<=star) {
				System.out.print("*"+" ");// yaha ek kamm sapce kamm hoga
				j=j+1;
				
			}
			// next row ready
			space=space-1;
			star=star+1;
			row=row+1;
			System.out.println();
		}

	}

}
