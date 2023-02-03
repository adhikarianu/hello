package javadays;

public class day2 {
	
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		
		
		//Define a variable and assign a value
		
		int a = 10;
		System.out.println(a);
		
		//Arithmetic operation
		//Addition , Subtraction , Multiplication , Division , Modulus
		//    + ,         - ,             * ,          / ,        %
		
		int s = 10;
		int t = 5;
		
		
		
		int q=s+t;
		System.out.println(q);
		System.out.println(s+t);
		System.out.println(q+q);
		System.out.println(q-q);
		
		System.out.println(s+t);
		System.out.println(s-t);
		System.out.println(s*t);
		System.out.println(s/t);
		System.out.println(s%t);
		
		int r = 6;
		System.out.println(r);
		
		int u = q+r;
		System.out.println(u);
		
		//Arithmatic operation
		
		int q1 = 90;
		int q2 = 45;
		
		System.out.println(q1+q2);
		System.out.println(q1-q2);
		System.out.println(q1*q2);
		System.out.println(q1/q2);
		System.out.println(q1%q2);
		
		//Calling the function
		
		Calculator(12,13);
		Calculator(120,12);
		
		System.out.println(12+13);
		System.out.println(12-13);
		System.out.println(12*13);
		System.out.println(12/13);
		System.out.println(12%13);
		
		
		//Calling the second function-CalA
		
		CalA();
		CalA();
		CalA();
		CalA();
		CalA();
		
		//calling the third function-CalB
		
		CalB(120,60);
		CalB(12,6);
		CalB(10,5);
		
	
		
		int x2 = CalC(12,3);
		System.out.println(x2);
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
	}
	
	static void Calculator(int x,int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		
		
		
		
		
		
		
		
	}
	
	//function without parameter and without return
	
	static void CalA() {
		System.out.println(9+9);
	}
	 
	
	//function with parameter and without return type
	
	static void CalB(int x,int y) {
		
	
		System.out.println(x+y);
	}
	
		

		
	
	
	
	
	//function with parameter and with return type
	//difference -- > $100 Given & $100 Showing 
	 
	static int CalC(int x, int y) {
		
		return (x+y);
	}
	
	
	
	
	
	
	
	
}