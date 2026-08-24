
import java.util.Arrays;
public class EvenArray{

public static int []isEven(int[]number){


for(int count=1; count<number.length; count++){
if( number[count]%2==0 ){
	number[count] *=2;
}

else{
number[count] +=1;
}
}
return number;
}

public static void main(String[] args){

int[] number={2,8,14,5,1};




System.out.println(Arrays.toString(isEven(number)));


}
}

      

