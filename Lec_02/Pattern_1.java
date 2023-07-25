package Lec_02;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nst=n;//no of star in each row
		while(row<=n) {
			// star print
			int cst=1;//count of star
			while(cst<=nst) {
				System.out.print("*"+" ");
				cst=cst+1;
			}
			//next row prepration
			row=row+1;
			System.out.println();
		}

	}

}
