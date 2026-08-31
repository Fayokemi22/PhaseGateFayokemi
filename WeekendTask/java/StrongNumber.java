import java.util.Scanner;
public class StrongNumber{
	public static void factorialOfANumber(int numbers){
	int factorial=1;
	int sum=0;
		for(int count=numbers; count>=1; count--){
	
	factorial =factorial *count;
//	sum +=factorial;
	
		}
			//System.out.print(factorial);
			
//if (sum==numbers){
//System.out.print("It's a strong number");
//}
//else{
//System.out.print("It's not a strong number");
//}
	}
	public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter Number ");
int numbers = input.nextInt();

factorialOfANumber(numbers);


	
	}
}
