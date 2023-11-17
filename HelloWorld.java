package Com.Bridzelabz;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
			System.out.println("Hello World");
			Scanner sc=new Scanner(System.in);
			double a,b,c;
			System.out.println("Enter first Number");
			a=sc.nextDouble();
			System.out.println("enter Second Number");
			b=sc.nextDouble();
			
			System.out.println("Enter Choice \n 1.Addition \n 2.Subtraction \n 3.Multiplication ");
		int	choice =sc.nextInt();
	     
		if(choice==1)
		{
			c=a+b;
			System.out.println("Addition Of Your input"+c);
		}
		else if(choice==2)
		{
			c=a-b;
			System.out.println("Subtraction Of Your input is  "+c);
		}else if(choice==3)
		{
			c=a*b;
			System.out.println("Multiplication Of Your input is "+c);
		}
		
		}

	

}
