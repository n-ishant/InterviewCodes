package BasicInterviewCodes;

public class EvenOddJava {
	
	static void arrangeEvenOdd(int arr[], int n) {
		
		int j=-1, temp;
		
		//Quick Sort method
		for(int i=0; i<n; i++) {
			//If array of element is odd then swap
			if (arr[i]%2==0) {
				j++;
				
				//swap the element
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 }; 
        int n = arr.length; 
      
        arrangeEvenOdd(arr, n); 
      
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " ");

	}

}
