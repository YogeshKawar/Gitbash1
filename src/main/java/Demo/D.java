package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class D {
public static void main(String[] args) {
		int arr[]=new int[] {4,5,6,7,8,9,1,3,5,4,5};
		System.out.println(Arrays.toString(arr));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value to check: ");
		int checkValue = sc.nextInt();

		check(arr, checkValue);
		sc.close();
	}
	private static void check(int arr[], int checkValue) {
		boolean test =false;

		for(int ele:arr) {
			if(ele==checkValue) {
				test= true;
				break;
			}
		}
		System.out.println(checkValue+" is in array: "+test);
}
}
