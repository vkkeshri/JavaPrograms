package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] ={38, 52, 9, 18, 6, 62, 13};
		int len = a.length, temp=0, min;
		for(int i=0; i<len; i++){
			min=i;
			for(int j=i+1; j<len; j++){
				if(a[j]<a[min]){
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for(int i=0; i<len; i++){
			System.out.print(a[i]+" ");
		}
	}

}
