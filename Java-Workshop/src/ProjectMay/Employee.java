package ProjectMay;
public class Employee {
	int year;
	String name;
	String address;
	public Employee(String n, int y, String add) {
		name=n;
		year=y;
		address= add;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;	
	}
	public String getAddress() {
		return address;
	}
	public static void main(String[] args) {
		Employee e1= new Employee("Robert", 1994,"64C- WallsSreet");
		Employee e2= new Employee("Sam", 2000,"68D- WallsSreet");
		Employee e3= new Employee("John", 1999,"26B- WallsSreet");
		System.out.println("Name\t Year of joining\t Address");
		System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t"+e1.getAddress());
		System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t"+e2.getAddress());
		System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t\t"+e3.getAddress());
	}
}


