package javaprogram;

public class BubbleShort {

	public static void main(String[] args) {
		// Write a program to sort(Bubble) an array.
		int arr[] = {23,1,12,4,5,61,18,7};
		int temp;
		for(int i=0; i<=arr.length; i++){
			for(int j=0; j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		String flag = "";
		for(int k=0; k<arr.length; k++){
			flag = flag+arr[k]+",";
		}
		System.out.println(flag);
	}

}
