package javadays;

public class day1String {
public static void main (String[] args) {
	
	
	// creating a String
	//Program1
	
	String subject  = "I am learning selenium";
	String subject1 = "I am learning python";
	String subject2 = "I am learning java";
	System.out.println(subject);
	System.out.println(subject1);
	System.out.println(subject2);
	
	
	//String + Integer >>>>> String
    //Integer+ Integer >>>>> Integer
	//Integer+ String  >>>>> String
	//String + String  >>>>> String
	
	//Program2
	System.out.println("2"+2);   //22
	System.out.println(3+2);     //5
	System.out.println(3+"3");   //33
	System.out.println("3"+"3"); //33
	
	//Program 3
	//Length()of string
	
	String greet = "I am learning java";
	int a1 = greet.length();
	System.out.println(a1);
	System.out.println(greet.length());
	
	int x1 = 90;
	System.out.println(x1); //90
	System.out.println("x1"); // x1
	
	//Program 4
	String first = "Python";
	String second = "Learning";
	System.out.println(first+second); //PythonLearning
	
	//Program 5
	String three = "I am learning";
	String four ="java";
	String five ="three.concat(four)";
	System.out.println(five); 
	
	//Program 6
	String city = new String("pune");
	System.out.println("city");
	
	//Program 7
	//From-->>>>>>> Mumbai MumBai MUMBAI mumbai
	
	
	String city1 = "Nagpur";
	String cityU = city1.toUpperCase();
	System.out.println(cityU);
	
	String city2 = "Mumbai";
	String cityL = city2.toLowerCase();
	System.out.println(cityL);
	
	String city3 = "Kathmandu";
	String cityM = city3.toUpperCase();
	System.out.println(cityM);
	
	String city4 = "goa";
	System.out.println(city4.length());
	
	String country = "NEPAL";
	System.out.println(country.length());
	
	String country1 = "DUBAI";
	String countryQ = country1.toLowerCase();
	System.out.println(countryQ);
	
	
	String country2 = "France";
    int k2 =
	country.toUpperCase().toLowerCase().length();
	System.out.println(k2);
	
	
	
	
	
}
}
	
	
		
	

