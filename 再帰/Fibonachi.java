package Ä‹A;

import java.util.Scanner;

public class Fibonachi {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int num = scn.nextInt();
		int sum = 0;
		int num2[] = {0,1};
		if(num==1) {
			sum=1;
		}else {
			for(int i=0; i<num-1; i++) {
				sum = num2[0]+num2[1];
				num2[0] = num2[1];
				num2[1] = sum;
			}			
		}
		System.out.println(sum);
	}
}
