package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {36, 19, 29, 12, 5};
		int len = a.length;
		int temp;
		for(int i=0; i<len; i++){
			for(int j=0; j<len-1-i; j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0; i<len; i++){
			System.out.print(a[i]+" ");
		}
	}

}
