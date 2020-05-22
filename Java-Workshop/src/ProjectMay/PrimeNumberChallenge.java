package ProjectMay;

import java.util.Scanner;

public class PrimeNumberChallenge 
{
	public static void main(String[] args) 
	{
		boolean prime=true;
		System.out.println("Enter any number:");
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0) 
			{
				prime=false;
			}
		}
		if (prime==true) 
		{
			System.out.println(num+" is Prime Number");
		}
		else 
		{
			System.out.println(num+" is Not Prime Number");
		}
	}

}
