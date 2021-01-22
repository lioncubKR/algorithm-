package while•¶;

public class SelectSort {
	public static void main(String[] args) {
		int[] a = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
		int b;
		for(int i = 0 ; i <  a.length -1 ; i ++) {
			for(int j = i+1 ; j < a.length ; j ++) {
				if(a[i] > a[j]) {
					b = a[j];
					a[j] = a[i];
					a[i] = b;
				}
			}
		}
		for(int i = 0 ; i <  a.length ; i ++) {
			System.out.println(a[i]);
		}

	}
}