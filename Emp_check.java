class Emp_check{
	public static void main(String args[]){
		//random calculation//
		int isFull=1;
		double check=Math.floor(Math.random()*10)%2;
		int per_hour=20;
		int part_time=8;
		if(isFull==check){
		System.out.println("the employee is present"+" "+check);
		int result=per_hour*part_time;
		System.out.println("the employee hours is "+" "+result);
		}
		else{
		System.out.println("the employee not present"+" "+check);
		}
	}
}
