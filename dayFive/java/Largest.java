public class Largest{

public static int numbers(int largest){
for (int count=1; count<=10; count++){
if(count>largest){
largest=count;
}


}
return largest;
}

public static void main(String[] args){

int largest=0;


System.out.println("The largest is : " + numbers(largest));
}

}










