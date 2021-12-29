class EmpWageCalculatorSwitchUC6{
	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int EmpRatePerHour = 20;
	public static final int NoOfWorkingDays = 20;
	public static final int maxWorkingHourInMonth = 100;
	public static void main(String[] Args) {
	int EmpWages = 0;
	int TotalEmpHour = 0;
	int TotalEmpWage = 0;
	int TotalWorkingDays = 0;
	while (TotalWorkingDays < NoOfWorkingDays && TotalEmpHour <= maxWorkingHourInMonth) {
	int EmpHour = 0;
	TotalWorkingDays++;
	int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
	switch (EmployeCheck) {
		case isFullTime:
		EmpHour = 8;
		break;
		case isPartTime:
		EmpHour = 4;
		break;
		default:
		EmpHour = 0;
	}
	TotalEmpHour += EmpHour;
    EmpWages = EmpHour * EmpRatePerHour;
	TotalEmpWage += EmpWages;
	System.out.println("Employe wage: " + EmpWages );
	}
	System.out.println("Total Employe wage: " + TotalEmpWage );
  }
 }
