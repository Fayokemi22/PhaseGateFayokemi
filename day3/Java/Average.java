
public class Average{

public static void main(String[] args){

int sum = 0;
int average= 1;


for (int count=1; count<=100; count++){
sum += count;
average = sum/count;
}

System.out.println(average);
}
}

