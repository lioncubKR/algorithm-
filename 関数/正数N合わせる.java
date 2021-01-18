package ŠÖ”;

public class ³”N‡‚í‚¹‚é {
	static long sum = 0;
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		long sum2 = sum(n);
		
		System.out.println(sum2);
	}
	public static long sum(int[] a) {
		for(long obj : a) {
			sum += obj;
		}
		return sum;
	}
}
