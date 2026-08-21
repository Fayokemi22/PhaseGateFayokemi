/*
Question 3
print numbers from 1-100, but but instead of fixed skip rules, dynamically builld the skip condition: skip a number if the sum of its digits is divisible by 3_ print "skip" for those instead

*/

public class Greetings{

    public static void main(String [] args){
    
    for(int count=1; count<=100; count ++ ){
    
    if(count%3!=0){
       System.out.println(count);
    }

    }
    
   }
   
  }
