package Lec_02;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=0;
		int star=n ;
		int row=1;
		while(row<=n) {
			//space
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j=j+1;
			}
			//star
			int i=1;
			while(i<=star) {
				System.out.print("*"+" ");
				i=i+1;
			}
			
			//next row tayari
			row=row+1;
			star=star-1;
			space=space+2;
			System.out.println();
		}
		
		

	}

}
