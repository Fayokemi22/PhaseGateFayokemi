

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LargeIntegerTest{

@Test

public void testForLastInteger(){

LargeInteger large = new LargeInteger();

int [] number= {1,2,3};
	int actual = large.digit(number);
		int expected =1,2,4

assertEquals(actual,expected);

}

}

