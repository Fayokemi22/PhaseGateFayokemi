import java.util.Scanner;
public class Factorial{
	public static void factorialOfANumber(int numbers){
	int factorial=1;
		for(int count=numbers; count>=1; count--){
	
	factorial =factorial *count;
	
	
		}
			System.out.print(factorial);
	}
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Number ");
int numbers = input.nextInt();

factorialOfANumber(numbers);


	
	}
}
