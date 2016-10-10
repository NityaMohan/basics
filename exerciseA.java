package day1.exercise;

public class exerciseA {

	public static void main(String[] args) {
		double salary = 20000;
		double tax=0.0;
		if (salary<15000){
			System.out.println(tax= salary*.10);
		}
		else if (salary<= 40000){
			System.out.println(tax=salary*.20);
		}
		else {
			System.err.println(tax=salary*.30);
		}
	}

}
