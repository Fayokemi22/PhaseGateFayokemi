
public class CountNumber{
public static void main(String[] args){

int sum = 0;
int divide= 1;
int counter = 0;


for (int count=1; count<=50; count++){
sum += count;
divide = sum/count;

counter ++;
}
System.out.println(divide);
}
}

