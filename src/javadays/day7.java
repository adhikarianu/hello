package javadays;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch with break
		
		int day = 3;
		
		switch(day) {
		case 1:
			System.out.println("Sunday");
			
		case 2:
			System.out.println("Monday");
		
		case 3:
			System.out.println("Tuesday");
			
		case 4:
			System.out.println("Wednesday");
			
		case 5:
			System.out.println("Thursday");
		
		case 6:
			System.out.println("Friday");
		
		case 7:
			System.out.println("Saturday");
		
	    default:
	    	System.out.println("Please input correct day");
			
		}
		
		 // with break statement
		
		switch (day) {
		case 1 :
			System.out.println("Sunday");
			break;
			
		case 2 :
			System.out.println("Monday");
			break;
			
		case 3 :
			System.out.println("Tuesday");
			break;
			
		case 4 :
			System.out.println("Wednesday"); 
			break;
			
		case 5:
			System.out.println("Thursday");
		    break;
		    
		case 6:
			System.out.println("Friday");
		    break;
		    
		case 7:
			System.out.println("Saturday");
		    break;
		    
	    default:
	    	System.out.println("Please input correct day");
			
			
		}	
			
		int days = 1;
		
		 if (days == 1) {
			 System.out.println("Sunday");
		 }
		 
		 else if (days == 2) {
			 System.out.println("Monday");
		 }
		
		 else {
			 System.out.println("please input correct days");
		 }
			
			
			
			
	}
}		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


