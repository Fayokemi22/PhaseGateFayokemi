

public class ArrayDigits{
public static int []arrayNumber (int []number){

for(int count =0;count<number.length;count++){
for(int counter =0;counter<count;counter++){
if (number[count]==number[counter]){
return (number[count] );
}
}
}
}
public static void main(String[] args){

int[]number ={2,2,1};
int count = 0;

System.out.println (ArrayDigits(number[count));
}

}



/*
public class ArrayDigits{
public static void main(String[] args){

int[]number ={2,2,1};
int count = 0;

for(int count =0;count<number.length;count++){
for(int counter =0;counter<count;counter++){
if (number.length[count]==number[counter]){
System.out.print(number[count]);
}

}
}

*/





