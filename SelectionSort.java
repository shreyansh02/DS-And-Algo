import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("Enter the limit of array:");
		int n= sc.nextInt();
		int[] a  = new int[n];
		
		System.out.println("enter the element of the array:");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			
			int minInd = i;
			
			for(int j=i; j<n; j++) {
				
				if(a[j] < a[minInd]) {
					minInd = j;
				}
			}
			int temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;
		}
		for(int e: a) {
			System.out.print(e+" ");
		}
	}
	}

}
