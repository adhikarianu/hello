package javadays;

public class day4 {
	
	public static void main(String[]args) {
		//TODO Auto -generated method stub
		 
		//Revision
		//Arithmetic operation
		
		int a = 10;
		int b = 5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Arithmetic operation
		
		int s = 10;
		int t  = 5;
		
		System.out.println(s+t);
		System.out.println(s-t);
		System.out.println(s*t);
		System.out.println(s/t);
		System.out.println(s%t);
		
		
		
		//10 pair 50 lines of same code
		
		Calculator(12,3);
		Calculator(120,30);
		Calculator(1200,300);
		
		Addition();
	    Addition();
	    Addition();
	    Addition();
	    Addition();
	    
	    
	    AdditionA(1,2);
	    AdditionA(6,12);
	    AdditionA(100,2);
	    
	   int a1 = AdditionC(3,3);
	   System.out.println(a1);
	   System.out.println(a1+a1);
	   System.out.println(a1*0.10);
	   System.out.println(a1/10);
	   System.out.println(a1%0.20);
	   
	   
	   
	   //relational operator
	   
	   //< , > , <= , >= !=,==
	   //boolean value
	   
	   System.out.println(33 > 5);   //true
	   System.out.println(3 <= 5);   //true
	   System.out.println(330 != 5); //true
	   System.out.println(3 < 5 );   //true
	   System.out.println(33 >= 5 ); //true
	   System.out.println(33 == 33);  //true
	   
	   
	   
	   //Logical operators
	   
	   // And &&
	   
	    // true && true ==========> true
	    //true && false ==========> false
	    //false && true ==========> false
	    //false and false ========> false
	   
	  System.out.println(2 == 2 && 6 != 7); //true
	  System.out.println(2 != 2 && 6 != 7); //false
	  System.out.println(2 == 2 && 6 == 7); //false
	  System.out.println(2 != 2 && 6 == 7); //false
	   
	  
	  
	   // OR ||
	   
	    // true || true ==========> true
	    //true  || false ==========> true
	    //false || true ==========>  true
	    //false || false ========>   false
	   

	   
	  	  	   
	   // NOT !
	   
	   System.out.println(!(2==2)); 
	   System.out.println(!(2!=2)); 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    
	    
	    
		
	}
		static void Calculator(int x , int y) {
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x*y);
			System.out.println(x/y);
			System.out.println(x%y);
			
			
		}
			

		// function without parameter and without return type
		 
		static void Addition() {
			System.out.println(9+9);
		}
		
		
		
		//function with parameter and without return type
		
		static void AdditionA(int x,int y) {
		     System.out.println(x+y);	
		}
		
		
		
		//function with parameter and with return type
		
		static int AdditionC(int x,int y) {
			return x+y;
		}
	
	
	
	
	
	
}














