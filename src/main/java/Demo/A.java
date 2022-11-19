package Demo;

public class A {
public static void main(String[] args) {
	int sumOfCube= 0;
	int a,temp;
	int number = 153;
	temp=number;
	
	while(number>0) 
	{
		a=number%10;//Getting last digit
		number=number/10;//removing last digit from number
		sumOfCube = sumOfCube+(a*a*a);//Calculating sum of digits
	}
	if (temp==sumOfCube) 
	{
		System.out.println(temp+" Is armstrong number");
	}
	else
	{
		System.out.println(temp+" Is not armstrong number");
	}
}
}
