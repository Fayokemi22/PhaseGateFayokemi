import java.util.Arrays;
public class ReturnEven{
public static Boolean []digit(int [] number){
	for(int count=1; count<number.length; count++){
	
if(number[count]%2==0){
return true;
}
	
	}
	return false;
	}
public static void main(String [] args){
int [] number={1,2,3};

System.out.println(Arrays.toString(digit(number)));


	}
}

