package BasicInterviewCodes;

import java.util.Scanner;

public class roughWork {
	
	static int i,n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            //sum = sum + a[i];
        }
		
        for (int i = 0; i < n; i++) 
            System.out.print(a[i] + " ");
    }

}
