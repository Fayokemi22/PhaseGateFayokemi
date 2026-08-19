/*write a function that takes a string & returns the count of distinct case-incensitive alphabet characters and numeric digits that occurs more than once in the input string. the input string can be assumed to contain only alphabet both upper or lower case and numeric*/


/*
public class AfternoonTask{

public static void main(String [] args){

String letter = "abcdef";
int counter= 0;

for(int count=1; count<letter.length(); count++){

if (letter.charAt(0)==letter.charAt(count)){
counter++;
}

System.out.print(counter);
}
}
}
*/

public class AfternoonTask{

public static String returnString(String letter){


int counter= 0;

for(int count=1; count<letter.length(); count++){

if (letter.charAt(0)==letter.charAt(count)){
counter++;
}
System.out.print(counter);
}


return counter;
}


public static void main(String [] args){
String letter = "abcdef";

returnString(letter);

}

}


