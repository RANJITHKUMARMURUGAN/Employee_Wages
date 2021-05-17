class Emp_check{
	public static void main(String args[]){
		int isFull=1;
		double check=Math.floor(Math.random()*10)%2;
		int IntValue = (int) Math. round(check);
		switch(IntValue) {
			case 0:System.out.println("the employee is present");
			break;
			case 1:System.out.println("the employee is not present");
			break;
			default:System.out.println("none of the value");
			break;
		}
	}
}

