package ProjectMay;

import java.util.*;

public class Convert_Min_into_Years {
	public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	double a= 60*24*365;
	System.out.println("Enter input the number of minutes:");
	double min = Sc.nextDouble();
	long years = (long)(min/a);
	int days = (int)(min/60/24)%365;
	System.out.println(min + " minutes is approximately "+ years+ " years "+ days+" days");
}
}
