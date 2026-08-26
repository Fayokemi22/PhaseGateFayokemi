import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class DuplicateNumberTest{

@Test

public void testForLastInteger(){

DuplicateNumber number = new DuplicateNumber();

int [] numbers={1,2,3,1};
	boolean  actual = number.returnABooleanIfAduplicate(numbers);
 

assertTrue(actual);

}

}




