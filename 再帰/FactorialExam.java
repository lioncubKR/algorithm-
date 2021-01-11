package çƒãA;
import java.util.Scanner;

public class FactorialExam {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		long num = scn.nextLong();
		if(num == 0) {
			System.out.println(1);
		}else {
			long sum = factorial(num);
			System.out.println(sum);
		}
	}
	
	static long factorial(long num){
		if (num == 1){
			return 1;
		}else {
			return num * factorial(num-1);
		}
	}
}