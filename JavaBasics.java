package week1.day1;

public class JavaBasics {
	 
	
	public static void main(String[] args) {
		//Print Fibonacci series 0,1,1,2,3,5,8,13...
		int firstNo = 0;
		int secondNo = 1;
		int sum = firstNo + secondNo;
		
		System.out.print("Fibonacci series : ");	
		System.out.print(firstNo+ ",");
		System.out.print(secondNo+ ",");
		System.out.print(sum+ ",");
						
		for (int i=0; i<=4; i++) {
				    	firstNo = secondNo;
				        secondNo = sum;	
				        sum = firstNo+secondNo;
				        System.out.print(sum+ ",");
		 }
		System.out.println(); 
		System.out.println("*****************");
		
		//Print prime numbers 1,2,3,5,7,11...       
		 int num = 7;
		 for (int i = 2; i<num; i++) {
			if((num%i) == 0) {
				System.out.println(num + " is not a Prime number");
				break;
				}
			else if (i==(num-1)) {
				System.out.println(num + " is a Prime number");
			}
			
		 }
		
		System.out.println("******************************");
		// Print Factorial for a given no.
		int fact= 1;
		int no= 8; 
		for(int i=1; i<=no; i++)
			fact= fact*i;
		System.out.println("Factorial of " +no +": " +fact);
	}

}
