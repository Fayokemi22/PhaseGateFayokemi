public class SimpleInterest{

public static float calculateSimpleInterest(int principal, int rate, int time){
return (principal * rate * time) /100;

}

public static void main(String[] args){

int principal = 50;
int rate =44;
int time=60;
float interest = calculateSimpleInterest(principal, rate, time)/100;

System.out.println("The interest is : "+interest);
}
}
