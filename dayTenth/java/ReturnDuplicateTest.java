import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ReturnDuplicateTest{

@Test

public void testForReturnDuplicate(){

ReturnDuplicate number = new ReturnDuplicate();

int [] firstNumber={1,2,2,1};
int [] secondNumber={2,2};
	int  [] actual = number.digit(firstNumber, secondNumber);
	int[]  expected={0,2,0,0};
 

assertArrayEquals(actual,expected);

}

}




