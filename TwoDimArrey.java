package day1;

public class TwoDimArrey {

	public static void main(String[] args) {
		
		int [][] x= new int [2][3];
		int a=10;
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 3; j++) {
			
				x[i][j]= a;
				a+=10;
				
			}
		
		}					
		for (int i = 0; i <2; i++) {
			for (int j = 0; j < 3; j++){
				System.out.print(x[i][j]+ " ");
			}
    System.out.println();   
		}
		
		
}
	
}
