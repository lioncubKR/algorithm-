package while•¶;
import java.util.Scanner;

public class ABPlus {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
			int A=scn.nextInt();
			int B=scn.nextInt();
		if (A==0&&B==0) {
			break;
			}
			System.out.println(A+B);
		}
	}
}