package javadays;

public class day6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Tickets
		
		//Truth Table 
		//&& operator  
		//true    true =======> true
		//false   true =======> false
		//true    false ======> false
		//false   false ======> false
		
		
		int numT = 12;
		
		if(numT > 0 && numT < 5) {
			System.out.println("10 percent");
		}
		
		if(numT > 5 && numT <= 10) {
			System.out.println("20 percent");
		}
		
		if (numT > 10) {
			System.out.println("30 percent");
		}
		
		if(numT > 0 && numT < 5) {
			System.out.println("10 percent");
		}
		
		else if(numT > 5 && numT <= 10) {
			System.out.println("20 percent");
		}
		
		else if (numT > 10) {
			System.out.println("30 percent");
		}
		
		int marks = 92;
		
		if (marks > 90) {
			System.out.println("Grade A");
		}
		
		if (marks > 89) {
			System.out.println("Grade B");
		}
		
		if (marks > 87) {
			System.out.println("Grade C");
			
		}
				
		
		
		if (marks > 90) {
			System.out.println("Grade A");
		}
		
		else if (marks > 89) {
			System.out.println("Grade B");
		}
		
		else if (marks > 87) {
			System.out.println("Grade C");
			
		}
		
		else  {
			System.out.println("Fail");
		}
		
		
		
	    int a = 100;
	    int b = 200;
	    
		if(a > b) {
			System.out.println("A is greater");
		}
		
		else {
			System.out.println("B is greater");
		}
		
		
		
		int x = 10000;
		int y = 1500;
		int z = 200;
		
		//largest of 3 numbers
		
		if(x > y && x > z) {
			System.out.println("X is greater");
		}
		
		else if(y > x && y > z) {
			System.out.println("Y is greater");
		}
		
		else {
			System.out.println("Z is greater");
		}
		
	}
}























