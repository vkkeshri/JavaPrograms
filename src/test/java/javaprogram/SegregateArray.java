package javaprogram;

public class SegregateArray {

	static void segregate0and1(int arr[], int n){
		int count = 0;//count the number of zero in array
		for(int i=0; i<n; i++){
			if(arr[i]==0){
				count++;
			}
		}
		
		//loop fills the array with 0 untill count
		for(int i=0; i<count; i++){
			arr[i]=0;
		}
		//loop fills remaining arr space with 1
		for(int i=count; i<n; i++){
			arr[i]=1;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,0,0,1,1,0,0};
		int n = arr.length;
		segregate0and1(arr, n);
		for(int i=0; i<n; i++){
			System.out.println(arr[i]+" ");
		}
	}

}
