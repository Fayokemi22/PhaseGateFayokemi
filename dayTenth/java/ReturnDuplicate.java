import java.util.Arrays;
public class ReturnDuplicate {
public static int []digit(int [] number,int secondNumber[]){
	int result [] = new int[number.length];
	
	 for(int count = 0;count<number.length;count++){
	 	for(int index = count;index<secondNumber.length;index++){
	 	if(number[count]== secondNumber[index]){
 		result[count] = secondNumber[count];
	 	}
	 	}
	 }
	 return result;
	 
}
public static void main(String [] args){
int [] number={1,2,2,1};
int [] secondNumber={2,2};

System.out.println(Arrays.toString(digit(number,secondNumber)));


	}
}






