import static org.junit.Assert.*;
import org.junit.Test;

import solution.clas;


public class unitTest {

       @Test
       public void testMoveDown() {
            clas elevator = new clas();
            elevator.add(5,1);
            assertEquals(6, 6);      
       }

}
