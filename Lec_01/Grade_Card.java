package Lec_01;

public class Grade_Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=78;
		if(marks>=80) {
			System.out.println("Grade A");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("Grade B");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("Grade C");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
