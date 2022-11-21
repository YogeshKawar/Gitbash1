package Demo;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Prime no");
		}
		else {
			System.out.println("Not prime");
		}
		sc.close();
		System.out.println("Changes done by Deepak");
	}
	
}
