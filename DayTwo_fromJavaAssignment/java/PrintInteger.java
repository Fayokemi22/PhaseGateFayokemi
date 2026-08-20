/* question 4
print numbers 1-100 with helloworld rules, but replace numbers with hello/hello/orion based on divisibility by 3,5, and 7 respectively and for any number where none apply, print the number reversed digit-wise instead of the number itself

*/

public class PrintInteger{

    public static void main(String [] args){
    
    for (int count=1; count<=100; count++){
    if (count%3!=0 && count%5!=0 && count%7!=0){
    System.out.println("helloworld");
    
    }
    if (count%3==0){
    System.out.println("hello/hello/orion");
    
    }
    if (count%5==0){
    System.out.println("hello/hello/orion");
    
    }
    
   if (count%7==0){
    System.out.println("hello/hello/orion");
    
    }
  System.out.println("");
    }
    
    
    
   } 
 }
 
 
 
