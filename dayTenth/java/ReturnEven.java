import java.util.Arrays;
public class DuplicateNumber{
public static boolean returnABooleanIfAduplicate(int [] number){
	int result [] = new int[number.length];
	
	 for(int count = 0;count<number.length;count++){
	 	for(int index = count + 1;index<number.length;index++){
	 	if(number[count]== number[index]){
	 	
			return true;
	 	}
	 	}
	 }
	 return false;
	 
}
public static void main(String [] args){
int [] number={1,2,3,1};

System.out.println(returnABooleanIfAduplicate(number));


	}
}







