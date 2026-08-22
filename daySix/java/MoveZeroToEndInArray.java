import java.util.Arrays;
public class MoveZeroToEndInArray{
public static int []arrayToZero(int[] number){

 
for(int count=0; count<number.length; count++){
if(number[count] == 0){

number[count] = number.length -1;
}
 }
 return number;

}
public static void main(String[] args){
int[] number ={5,0,3,0,2,0};


System.out.println(Arrays.toString(arrayToZero(number)));
}
}
