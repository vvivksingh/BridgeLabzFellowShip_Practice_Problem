public class EmpWageCalculatorUC1{
	public static void main(String[] args){
		int isPresent = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == isPresent){
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}
}
