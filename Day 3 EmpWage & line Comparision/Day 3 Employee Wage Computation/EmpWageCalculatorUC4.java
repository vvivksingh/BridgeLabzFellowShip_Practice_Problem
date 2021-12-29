class EmpWageCalculatorUC4 {
	public static final int IsFullTime = 1;
	public static final int IsPartTime = 2;
	public static final int EmployeRatePerHour = 20;
	public static void main(String[] Args) {
	int EmployeWages = 0;
	int EmployeHour = 0;
	int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
	switch (EmployeCheck) {
		case IsFullTime:
		EmployeHour = 8;
		System.out.println("Employee is working full time" );
		break;
		case IsPartTime:
		EmployeHour = 4;
		System.out.println("Employee is working part time" );
		break;
		default:
		System.out.println("Employee is absent" );
		EmployeHour = 0;
	}
    EmployeWages = EmployeHour * EmployeRatePerHour;
	System.out.println("Employewage: " + EmployeWages );
	}
}
