package ’å—ó;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	static Scanner scn = new Scanner(System.in);
	static int sum = 0;
	static int sum2 = 0;
	public static void main(String[] args) {
		int cnt = scn.nextInt();
		scn.nextLine();
		
		String[] num = scn.nextLine().split(" ");
		int[] num2 = new int[num.length];		
		
		for(int i=0; i<num.length; i++) {
			num2[i] = Integer.parseInt(num[i]);
		}
		Arrays.sort(num2);
		
		for(int i=0; i<num2.length; i++) {
			sum += sum2 + num2[i];
			sum2 += num2[i];
		}
		System.out.println(sum);
	}
}
