import java.util.Scanner;

public class TaskOne{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int sum=0;

for (int count=0; count<=100; count++){

System.out.print("Enter score : ");
int score = input.nextInt();
sum +=score;
if (score%10==0)
sum +=score

}
count++;
}


System.out.println("The sum is : " + sum);

}

}


