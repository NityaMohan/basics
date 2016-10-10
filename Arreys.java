package day1;

public class Arreys {

	public static void main(String[] args) {
		
		 int a = 1; int b = 2; int c ,d,e;
		 
		int[]x = { 1,2,3,4,5,6 };
		System.out.println(x[2] + " nitya " + x[4]);
		// System.out.println(a[2]+ a[4]+ a[0]);

		for (int i = 0; i < x[3]; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("---------------end--------------");
		int[] y= new int [5];
		 y[2]=2;
		 y[3]=3;
		for (int i : x) {
		System.out.println(i);	
		}
	}
		
		
		
}
	