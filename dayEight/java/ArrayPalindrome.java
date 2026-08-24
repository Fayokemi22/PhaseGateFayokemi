
import java.util.Arrays;
public class ArrayPalindrome{

public static String []isPalindrome(String[]palindrome){

for(int count=1; count<palindrome.length; count++){
if( palindrome[count].charAt(0)== palindrome[count].charAt(3) ){
	System.out.println("true");
	}
else{
System.out.println("true");
}
}
return palindrome;
}


public static void main(String[] args){

String[] palindrom={"{()[]}"};




System.out.println(Arrays.toString(isPalindrome(palindrom)));


}
}

