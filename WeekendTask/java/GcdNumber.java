import java.util.Scanner;
public class GcdNumber{
	public static int greatestCommonFactor(int firstNumber, int secondNumber){
	int greatestNumber=0;
		for(int count=1; count<=firstNumber; count++){
		 
			if (firstNumber %count ==0 && secondNumber % count==0){
				greatestNumber = count;
				}
	
	
		}
		return greatestNumber;
		
			
	}
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Number ");
int firstNumber= input.nextInt();

System.out.print("Enter Second Number ");
int secondNumber = input.nextInt();


System.out.println(greatestCommonFactor(firstNumber,secondNumber));


	
	}
}
