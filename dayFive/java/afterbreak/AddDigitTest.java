

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddDigitTest{

@Test

public void testForApplication(){

Add add= new Add();

int number = 38;
int sum = 0;
int digit=number;

int expected = add.AddDigit(digit,number,sum);
int actual =11;

assertEquals(expected,actual);


    }

}


