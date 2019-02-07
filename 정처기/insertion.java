package sort;

public class insertion {

	public static void main(String[] args) {

		// ------ 방법1. -------------------
		int arr[] = {3,2,1,5,4};
		
		for ( int i = 1; i < arr.length; i++) {
			
			int x = arr[i];		// 현재 배열 값
			int j = i-1;
			
			while( j >=0 && x < arr[j]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
				j--;
			}
			for( int k = 0; k < arr.length; k++) {
				System.out.print(arr[k]);
			} System.out.println();
		}
				
		
		// ------ 방법 2. -------------------
		int list[] = {3,2,1,5,4};
		int n = list.length;
		
		int i,j,x;
		for(i = 1; i < n; i++) {
			x = list[i];
			for(j = i -1; j>=0 && x < list[j]; j--) {
				list[j+1] = list[j];
				list[j+1] = x;
			}
		}
		
	}

}
