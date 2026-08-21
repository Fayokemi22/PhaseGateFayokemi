import java.util.Scanner;

public class TaskFour{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int sum=0;
int even = 0;

for (int count=2; count<=10; count++){

System.out.print("Enter score : ");
int score = input.nextInt();
sum +=score;
if (sum%2==0){
even +=score;
}

}

System.out.println("The even index is : " + even);

}

}







