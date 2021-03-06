import java.util.Random;

public class EmpWageUsingOOPs{
        public static final int EmployeRatePerHour = 20;
        public static final int NoWorkingDays = 20;
        public static final int HourInMonth = 100;
        public static final int IsFullTime = 1;
        public static final int IsPartTime = 2;

        public static void welcomeMessage(){
                System.out.println("***** Welcome to employee wage Computation programme*****");
        }
        public static void employeeCheck(){
                System.out.println("***********************************************************************");
                System.out.println("Use Case 1");
                Random random = new Random();
                int empCheck = random.nextInt(2);

                int Is_Present = 1;
                int Is_Absent = 0;
                if (empCheck == Is_Present){
                        System.out.println("Employee is present");
                }
                else{
                        System.out.println("Employee is absent");
                }
        }


	 public static void dailyWage(){
                 System.out.println("***********************************************************************");
                 System.out.println("Use Case 2");


                int EmployeWages = 0;
                int EmployeHour = 0;
                double EmpCheck = Math.floor(Math.random() * 10) % 2;
                if (EmpCheck == IsFullTime)
                {
                    EmployeHour = 8;
                }
                else
                {
                    EmployeHour = 0;
                }
                EmployeWages = EmployeHour * EmployeRatePerHour;
                System.out.println("Employewage: " + EmployeWages );
	 }


	 public static void partTimeEmployee() {
                 System.out.println("***********************************************************************");
                 System.out.println("Use Case 3");

                int EmployeWages = 0;
                int EmployeHour = 0;
                double EmpCheck = Math.floor(Math.random() * 10) % 3;
                if (EmpCheck == IsFullTime)
                {
                    System.out.println("Employee is Fulltime working");
                    EmployeHour = 8;
                }
                else if (EmpCheck == IsPartTime)
                {
                    System.out.println("Employee is part time working");
                    EmployeHour = 4;
                }
                else
                {
                    EmployeHour = 0;
                }
                EmployeWages = EmployeHour * EmployeRatePerHour;
                System.out.println("Employewage: " + EmployeWages );
        }

	 public void switchUCaseUses() {
                System.out.println("***********************************************************************");
                System.out.println("Use Case 4");

                int EmployeWages = 0;
                int EmployeHour = 0;
                int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (EmployeCheck) {
                    case IsFullTime:
                        EmployeHour = 8;
                        break;
                    case IsPartTime:
                        EmployeHour = 4;
                        break;
                    default:
                        EmployeHour = 0;
                }
                 EmployeWages = EmployeHour * EmployeRatePerHour;
                 System.out.println("Employewage: " + EmployeWages );
        }

	public void empWageForMonth() {
                System.out.println("***********************************************************************");
                System.out.println("Use Case 5");


                int EmployeWages = 0;
                int EmployeHour = 0;
                int TotalEmployeWage = 0;
                for ( int day = 0; day < NoWorkingDays ; day++) {
                    int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
                    switch (EmployeCheck) {
                        case IsFullTime:
                            EmployeHour = 8;
                            break;
                        case IsPartTime:
                            EmployeHour = 4;
                            break;
                        default:
                            EmployeHour = 0;
                }
                EmployeWages = EmployeHour * EmployeRatePerHour;
                TotalEmployeWage += EmployeWages;
                System.out.println("Employewage: " + EmployeWages );
                }
                System.out.println("TotalEmployewage: " + TotalEmployeWage );
        }

	public void totalWorkingHourCondition() {
                System.out.println("***********************************************************************");
                System.out.println("Use Case 6");
                int EmployeWages = 0;
                int TotalEmployeHour = 0;
                int TotalEmployeWage = 0;
                int TotalWorkingDays = 0;
                while (TotalWorkingDays < NoWorkingDays && TotalEmployeHour <= HourInMonth) {
                    int EmployeHour = 0;
                    TotalWorkingDays++;
                    int EmployeCheck = (int) Math.floor(Math.random() * 10) % 3;
                    switch (EmployeCheck) {
                        case IsFullTime:
                            EmployeHour = 8;
                            break;
                        case IsPartTime:
                            EmployeHour = 4;
                            break;
                        default:
                            EmployeHour = 0;
                    }
                    TotalEmployeHour += EmployeHour;
                    EmployeWages = EmployeHour * EmployeRatePerHour;
                    TotalEmployeWage += EmployeWages;
                    System.out.println("Employewage: " + EmployeWages );
                }
                System.out.println("TotalEmployewage: " + TotalEmployeWage );
        }


 	public static void main(String[] args){
                EmpWageUsingOOPs emp = new EmpWageUsingOOPs();
                emp.welcomeMessage();
		emp.employeeCheck();
                emp.dailyWage();
                emp.partTimeEmployee();
		emp.switchUCaseUses();
		emp.empWageForMonth();
		emp.totalWorkingHourCondition();
	}
}
