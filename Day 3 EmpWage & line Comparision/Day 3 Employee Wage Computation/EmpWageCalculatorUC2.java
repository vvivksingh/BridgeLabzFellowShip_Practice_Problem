public class EmpWageCalculatorUC2 {
	public static void main (String [] args){
	 int isFullTme = 1;
	 int empRatePerHour = 20;
	 
	 int empHours = 0;
	 int empWage = 0;
	 
	 double empCheck = Math.floor(Math.random() * 10) % 2;
	 if (empCheck == isFullTme){
		empHours = 8;
		empWage = empRatePerHour * empHours;
		
			System.out.println("Wage is : " + empWage);
		}
	else {
			System.out.println("Wage is : " + empWage);
		}
	}
}
