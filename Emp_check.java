import java.util.*;
class Emp_check{
	public static void main(String args[]){
		int isFull=1;
		int working_day=20;
		double check=Math.floor(Math.random()*10)%2;
		int IntValue = (int) Math. round(check);
		Scanner scan = new Scanner(System.in);
		switch(IntValue) {
			case 0:System.out.println("the employee is not present");
			break;
			case 1:System.out.println("the employee is present");
			System.out.println("Enter the a month");
			int month=scan.nextInt();
			int temp=month*working_day;
			System.out.println("the working day"+" "+temp);
			break;
			default:System.out.println("none of the value");
			break;
		}
	}
}

