

import java.util.Scanner;

public class AgeYears{

public static int year(int fatherAge,int sonAge){

return fatherAge -(sonAge *2);
}

public static void main(String[] args){

Scanner input= new Scanner (System.in);

	System.out.print("Current Father's Age: ");

		int fatherAge = input.nextInt();

	System.out.print("Current Age Of His Son: ");
		
		int sonAge = input.nextInt();

int years= fatherAge - (sonAge * 2);

System.out.println("The father would be twice older than his son in " + years + " years");


}
}



