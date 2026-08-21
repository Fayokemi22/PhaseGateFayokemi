/*

Reverse a given string using a for loop
*/
public class ReverseString{

public static void main(String[] args){

String number = "12345" ;
String reverse = 0;

for (int count=number.length()-1; count>=0; count--){
reverse += number.charAt(count);

}
System.out.print(reverse);
}
}


