package day1.exercise;

public class ExcersiceB {

	public static void main(String[] args) {
		String [] num = {"10" , "20" , "30" , "40" };
		int total= 0;
		
		for (String a : num) {
			total= total+ Integer.parseInt(a);	
			
		}
		System.out.println("total = " + total);
	}

}
