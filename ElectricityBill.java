package Assignment;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int unit=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter units : ");
		int unit = sc.nextInt();
		
		
		if (unit>=0 && unit<100) {
			System.out.println("Electricity bill for " + unit+" units is " + unit*1.2); }
		
		else if (unit>=100 && unit<300) {
			System.out.println("Electricity bill for " + unit+" units is " + unit*2); }
		
		else  {
			System.out.println("Electricity bill for " + unit+" units is " + (100*1.2 + 200*2 + (unit-300)*3)); }
		
		sc.close();
		
	}

}
