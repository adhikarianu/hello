package javadays;

public class day3 {
	
	public static void main(String[]args) {
		
		//TODO Auto-generated method stub
		
		System.out.println("Helloworld");
		
		
		
		
		addition();
		addition();
		addition();
		addition();
		addition();
		
		
		subtraction(100,50);
		subtraction(900,450);
		subtraction(60,80);
		
		
		int q1 = multiplication(12,12);
		
		System.out.println(q1);
		System.out.println(q1*0.1);
		System.out.println(q1+10);
		
		
		
		
		int q2 = multiplication2(q1,15);
		
		
		
		
		
		
		
	}
	
	//function without parameter and without return
	
	static void addition() {
		System.out.println(9+9);
		
		
	}
	
	
	
	//function with parameter and without return type
	
	static void subtraction(int x, int y) {
	      System.out.println(x-y);
	  
	
	
	
	}
	
	//function with parameter and with return type
	
	static int multiplication(int x,int y) {
		  System.out.println(x*y);
		  return(x*y);
		  
	}

	static int multiplication2(int x,int y) {
		     System.out.println(x*y);
		     return (x*y);
	}
	
	
}



















