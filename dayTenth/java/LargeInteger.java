
import java.util.Arrays;
public class LargeInteger{
public static int []digit(int [] number){
	for(int count=1; count<number.length; count++){
	
if(number[count]==3){
number[count] = number[count] + 1;
}
	
	}
	return number;
	}
public static void main(String [] args){
int [] number={1,2,3};

System.out.println(Arrays.toString(digit(number)));


	}
}


