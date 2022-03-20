package sorting;

public class BubbleStringSort {

	public static void main(String[] args) {
		String[] a = {"Deepak","Rahul","Amit","Vikas","Deepesh","Rohit"};
		String temp;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length-1; j++){
				if(a[j].compareTo(a[j+1])>0){//compareTo is used to compare two strings lexicographically(alphabetically order) each characters of both strings are converted into a unicode value. 
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
	}

}
