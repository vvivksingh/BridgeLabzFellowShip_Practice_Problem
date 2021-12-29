import java.util.Random;

public class EmployeeWageUsingFunctions{
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








 	public static void main(String[] args){
                EmployeeWageUsingFunctions emp = new EmployeeWageUsingFunctions();
                emp.welcomeMessage();
	}
}
