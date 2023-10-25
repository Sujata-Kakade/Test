import java.util.Scanner;


public class SecondProgram {

	public static void main(String[] args) {
	
		//String b ;
		//Scanner s1 = new Scanner(System.in);
		/*System.out.println("Please Enter a name :\n");
		 b=s1.nextLine();*/
		//System.out.println("Hello " +b);
		
		int a ;
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter a number : ");
		a=s.nextInt();
		/*System.out.println("Entered Number is : " +a);*/
//		if(a%2==0){
//			System.out.println("Given no is Even");
//		}
//		else{
//			System.out.println("Given no is Odd");
//		}	
			
//		if(a>=18){
//			System.out.println("User Is Applicable for Vot");
//		}
//		else{
//			System.out.println("User Is Not Applicable for Vot");
//		}
		
		if(a>=1 && a<=10){
			System.out.println("Given no is in between 1 to 10");
			return;
		}
		else if(a>=11 && a<=20){
			System.out.println("Given no is in between 11 to 20");
			return;
		}
		else if(a>=21 && a<=30){
			System.out.println("Given no is in between 21 to 30");
			return;
		}
		else if(a>=31 && a<=40){
			System.out.println("Given no is in between 31 to 40");
			return;
		}
		else if(a>=41 && a<=50){
			System.out.println("Given no is in between 41 to 50");
			return;
		}
		else{
			System.out.println("Given no is 0 or negative or gratter than 50");
		}
	}
}
