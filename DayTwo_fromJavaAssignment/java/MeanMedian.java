/*
Question 2
Given x,y and z, print the mean and median of the three values without using any built in min/max/sort
just nested if/else logic, and print which variable name (x,y or z) held the median value).
*/

import java.util.Scanner;

    public class MeanMedian{

    public static void main(String [] args){
    
 Scanner input = new Scanner(System.in);
 
    System.out.print("Enter First Integer : ");
    int LetterX =input.nextInt();
    
     System.out.print("Enter Second Integer: ");
    int LetterY =input.nextInt();
    
     System.out.print("Enter Third Integer ");
    int LetterZ =input.nextInt();
    
    int mean = (LetterX + LetterY + LetterZ) / 3;
    
    int median = LetterY;
    
    if (LetterX==median){
    
    System.out.println("The median is : " +LetterX);
    }
    
    else if (LetterZ==median){
    
    System.out.println("The median is : " + LetterZ);
    }
    else{
    System.out.println("The median is : " +LetterY);
    }
    
   System.out.println("The mean is : "+mean);     
    
    }


        }
    
