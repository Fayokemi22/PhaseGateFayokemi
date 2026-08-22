public class PrimeNumber{

public static String prime(int number){
if (number%2==0){
return "It's not a prime number";
}
else{
return "Its a prime number";
}

}

public static void main(String[] args){

int number= 5;
System.out.println (prime(number));

}
}
