 
  
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EvenArrayTest{

@Test

public void testForEvenOddArray(){

EvenArray add= new EvenArray();

int[] number={2,8,14,5,1};

int actual = add.isEven(number);
int expected={4,16,28,6,2};

assertEquals(expected,actual);


    }

}






