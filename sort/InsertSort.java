package while•¶;

public class InsertSort {
	public static void main(String[] args) {
		int[] a = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
		int b,j;
		for(int i = 1 ; i < a.length ; i ++) {
			b = a[i];
			for(j = i-1 ; j >= 0 && a[j] > b; j --) {
				a[j+1] = a[j];
			}
			a[j+1] = b;
		}
		
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.println(a[i]);
		}
	}
}