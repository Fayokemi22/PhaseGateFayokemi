/*

Given text_1 ="Hello" and text_2 = "World", 
Print them with quote interleaved character-by-character-style using index-based access with:
output: "HWeorllldo"
*/
public class Greetings{

    public static void main(String [] args){
    
    String name = "Hello";
    String nameTwo = "World";
    
   String add = name.charAt(0) + nameTwo.charAt(1);
    
    System.out.println('\"'+add +'\"');
    
    }

}
