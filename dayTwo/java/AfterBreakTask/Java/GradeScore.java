
import java.util.Scanner;

public class GradeScore{

public static int grades(int average){
if(90<=average <=100){
return ("A");
}
   
else if(80<=average <=90){
System.out.print("B");

}
       
else if (70<=average <=80){

System.out.print("c");

}
        
else if (60<=average <=70){

System.out.print("D");

}
    else{
       System.out.print("F");

}
return (average) / 3;

}

public static void main(String[] args){

Scanner ageCollector= new Scanner (System.in);

	System.out.print("The First Score: ");

		int scoreOne = ageCollector.nextInt();

	System.out.print("The Second Score: ");
		
		int scoreTwo = ageCollector.nextInt();
		
		System.out.print("The Third Score: ");
		
		int scoreThree = ageCollector.nextInt();
 int average = grades(average)/ 3;

System.out.println("The grade is: " + average + " years");


}
}

