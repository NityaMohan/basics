package day2.ClassAobject;

public class TestEmployee {

	public static void main(String[] args) {
		Employee Nitya = new Employee();
		Employee Kulu = new Employee();
		
		
		Nitya.salary = 10;
		Kulu.salary=20;
		Nitya.bonus= 10;
		Kulu.bonus=10;
		Nitya.calculateTotalPay();
		Kulu.calculateTotalPay();
		
		
		
		
	}

}
