package sort;

import java.util.Arrays;

public class RadixSort {
	static void countSort(int[] arr,int n,int exp) {
		int buffer[]=new int[n];
		int counting[]=new int[10];
		
		//exp의 자릿수에 해당하는 count를 증가시킨다.
		for(int i=0;i<n;i++) {
			counting[(arr[i]/exp)%10]++;
		}
		
		//누적합을 이용하여, 원소가 들어갈 위치를 미리 계산합니다.
		for(int i=1;i<=9;i++) counting[i]+=counting[i-1];
		
		//위와 같은 방식으로 하면, 임의의 순서대로 들어오는 값도
		//의도한 자리에 위치하도록 할 수 있습니다.
		
		for(int i=n-1;i>=0;i--) {
			//현재 원소의 해당 자리수의 값을 확인한다.
			int res=arr[i]/exp;
			//10으로 나눈 나머지를 가져오는 이유는 만약 232라는 숫자에서
			//10의 자리수는 3이므로, 나눈 뒤 가장 마지막의 숫자만을 가져오기 위함입니다.
			res%=10;
			//이 값이 들어갈 마지막 위치를 가져옵니다.
			int idx=counting[res];
			//인덱스는 0부터 시작하므로, -1을 해주었습니다.
			buffer[idx-1]=arr[i];
			//하나를 배치하였으므로, 개수를 하나 빼줍니다.
			counting[res]--;
		}
		
		for(int i=0;i<n;i++) {
			arr[i]=buffer[i];
		}
	}
	
	static void RadixSort(int[] arr,int n) {
		//최댓값 자리만큼 돌기
		int max=0;
		for(int i=0;i<n;i++) max=Math.max(max,arr[i]);
		
		//최댓값을 나눴을 때, 0이 나오면 모든 숫자가 i 아래
		for(int i=1; max/i>0;i*=10) {
			System.out.println(i+"의 자리에 대해 정렬합니다.");
			countSort(arr,n,i);
			System.out.println("정렬 결과");
			System.out.println(Arrays.toString(arr));
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {222,96,123,1,23, 5, 2, 17, 28};
		RadixSort(arr,arr.length);
		System.out.println("최종 정렬 결과");
		System.out.println(Arrays.toString(arr));
	}
}