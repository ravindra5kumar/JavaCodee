package Lec_02;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			if(row==1 || row==n) {
				//star
				int i=1;
				while(i<=n) {
					System.out.print("*"+" ");
					i=i+1;
				}
			}
			else {
				System.out.print("*"+" ");
				//space
				int i=1;
				while(i<=n-2) {
					System.out.print("  ");
					i=i+1;
				}
				System.out.print("*"+" ");
				
			}
			//next preparation
			System.out.println();
			row=row+1;
			
		}
		

	}

}
