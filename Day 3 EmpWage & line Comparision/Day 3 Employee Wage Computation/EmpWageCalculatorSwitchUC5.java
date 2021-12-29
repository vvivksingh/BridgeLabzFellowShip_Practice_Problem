class EmpWageCalculatorSwitchUC5 {
	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int EmpRatePerHour = 20;
	public static final int TotalWorkingDays = 20;
	public static void main(String[] Args) {
	int EmpWages = 0;
	int EmpHour = 0;
	int TotalEmpWage = 0;
	for ( int day = 0; day < TotalWorkingDays ; day++) {
	int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;
	switch (EmpCheck) {
		case isFullTime:
		EmpHour = 8;
		System.out.println("Employee is working full time" );
		break;
		case isPartTime:
		EmpHour = 4;
		System.out.println("Employee is working part time" );
		break;
		default:
		EmpHour = 0;
		System.out.println("Employee is absent" );
	}
    EmpWages = EmpHour * EmpRatePerHour;
	TotalEmpWage += EmpWages;
	System.out.println("Employee wage: " + EmpWages );
	}
	System.out.println("Total Employee wage: " + TotalEmpWage );
  }
 }
