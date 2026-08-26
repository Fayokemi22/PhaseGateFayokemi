import java.util.Arrays;
public class Interleave{
public static int []digit(int [] number, int [] numberTwo){
	for(int count=1; count<number.length; count++){
	
	for(int index=1; index<numberTwo[number]; index++){
	if(number[count]==numberTwo[count][number]){
number[count] = number[count];
}
	
	}
	

	
	}
	return number;
	}
public static void main(String [] args){
int [] number = {1,2,3};
int [] numberTwo = {3,5,4};

System.out.println(Arrays.toString(digit(number + numberTwo)));


	}
}
 


