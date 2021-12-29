class EmpWageCalculatorUC3 {
public static void main(String[] Args) {
	int IsFullTime = 1;
	int IsPartTime = 2;
	int EmployeRatePerHour = 20;
	int EmployeWages = 0;
	int EmployeHour = 0;
	double EmpCheck = Math.floor(Math.random() * 10) % 3;
	if (EmpCheck == IsFullTime){
	   EmployeHour = 8;
	   System.out.println("Employee is working full time" );
	}
	else if (EmpCheck == IsPartTime){
	   EmployeHour = 4;
	   System.out.println("Employee is working part time" );
	}
	else{
		EmployeHour = 0;
		System.out.println("Employee is absent" );
	}
EmployeWages = EmployeHour * EmployeRatePerHour;
	System.out.println("Employewage: " + EmployeWages );
	}
}
