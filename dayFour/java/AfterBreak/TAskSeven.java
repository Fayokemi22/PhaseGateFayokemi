import java.util.Scanner;

public class TaskFour{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int sum=0;
int even = 0;
double average=0;

for (int count=1; count<=10; count++){

System.out.print("Enter score : ");
int score = input.nextInt();
sum +=score;
if (sum%2==0){
even +=score;
}

}
average = even/10;
System.out.println("The sum is : " + sum);
System.out.println("The average is : " + average);

}

}

