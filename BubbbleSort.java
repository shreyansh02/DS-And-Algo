import java.util.Scanner;

public class BubbbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of array:");
		int n= sc.nextInt();
		int[] a  = new int[n];
		
		System.out.println("enter the element of the array:");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++) { //loop for outer iteration 
			
//			for(int j=0; j<n-1; j++) //loop for inner iteration
			boolean stored = true;
			for(int j=0; j<n-1-i; j++) { //more optimise way
				if(a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
					stored = false;
				}
			}
			if(stored)
				break; 
		}
		
		System.out.println("Sorted Array:");
		for(int item: a) { //for each loop
			System.out.print(item+" ");
		}
		sc.close();
	}

}
