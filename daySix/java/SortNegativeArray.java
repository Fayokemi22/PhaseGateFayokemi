import java.util.Arrays;
public class SortNegativeArray{
public static int []negativeArray(int array[]){

for (int count=0; count<array.length; count++){
if(array[count] < 0){
array[count] = 0;
}

}
return array;

}

public static void main(String[] args){

int[] array = {5,-9,3,-6,2,-11};

System.out.println(Arrays.toString(negativeArray(array)));


	}
}
