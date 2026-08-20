

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ApplicationTest{

@Test

public void testForApplication(){

Application app= new Application();

int initialDeposit =0;
int deposit = 500;
int withdraw = 200;

int expected = app.remainingTransaction(initialDeposit,deposit,withdraw);
int actual =1300;

assertEquals(expected,actual);


    }

}



 
     



    
                    
                    
                    
                    
                    
                    
        
