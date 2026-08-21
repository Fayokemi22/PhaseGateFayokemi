

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddDigitTest{

@Test

public void testForApplication(){

ArrayDigits add= new ArrayDigits();

int[] number = {2,2,1};
int count = 0;

int []expected = add.arrayNumber(number,count);
int actual =1;

assertEquals(expected,actual);


    }

}



