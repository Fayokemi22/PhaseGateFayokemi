//perfect number
public class PerfectNumber{
	public static void main(String[] args){
		int number= 6;
		int sum = 0;
		for(int count=0; count<number; count++){
	if(count % 2 == 0){
		sum +=count;
	
	}
	}
	//is sum is equal to the number used for division
	
	if (sum == number){
	System.out.println("It's a perfect number");
	}
else{
System.out.println("It is not a perfect number");
}
	

			}
	
}



