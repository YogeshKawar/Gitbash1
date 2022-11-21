package Demo;

public class A {
public static void main(String[] args) {
<<<<<<< HEAD
	int n1 =0, n2=1, n3,i,count=10;
	System.out.print(n1+" "+n2);

	for(i=2;i<count;i++) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
=======
	int n1=0;
	int n2=1;
	int sum=0;
	System.out.print(n1+" "+n2+" ");
	for(int i=1;i<=10;i++) {
		sum=n1+n2;
		System.out.print(sum+" ");
		n1=n2;
		n2=sum;
>>>>>>> 594e307ea03b4f25c7ff79bcdac74e6f8d0caa2c
	}
}
}
