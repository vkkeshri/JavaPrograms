package sorting;

public class LinearSearchString {

	public static void main(String[] args) {
		String[] arr = {"Deepak","Rahul","Amit","Vikas","Deepesh","Rohit"};
		String item = "Amit";
		int temp = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]==item){
				System.out.println("Item is present at "+i+" index position");
				temp=temp+1;
			}
		}
		if(temp==0){
			System.out.println("Item not found in the list.");
		}
	}

}
