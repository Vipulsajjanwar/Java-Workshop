package ProjectMay;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int choose;
		System.out.println("Pick no.: 1. Hi \t 2. Hey \t 3. Hello");
		Scanner sc = new Scanner(System.in);	
		choose= sc.nextInt();
		switch(choose)
		{
		case 1 : System.out.println("You say Hi!");
				break;
		case 2 : System.out.println("You say Hey!");
				break;
		case 3 : System.out.println("You say Hello!");
				break;
				default: System.out.println("Invalid Entry");
				break;
		}
	}

}
