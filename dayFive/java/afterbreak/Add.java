/*given an integer num, repeatedly add all its digit until th result has  one digit and returnit */

public class Add{


public static int AddDigit (int number, int digit, int sum){
while(digit>=10){
sum+= digit%10;
digit /=10;}
digit = sum;
}
public static void main(String [] args){

int number = 38;
int sum = 0;
int digit=number;

System.out.println(AddDigit(digit));
}
}





