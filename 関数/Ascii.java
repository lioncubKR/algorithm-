package ä÷êî;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		int num = 0;
		String sum = "";
		while(true) {
			String a = scn.next();
			num += name.indexOf(a);
			System.out.print(" ");
			sum += num;
			if(a.equals("aa")) {
				break;
			}
		}
		System.out.println(sum);
	}
	
}