import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

import com.example.Hello;

public class HelloTest {
    
    @Test
    public void testMainMethod() {
        try {
            Hello.main(new String[]{});
            assertTrue(true);
        } catch (Exception e) {
            fail("Main method threw an exception: " + e.getMessage());
        }
    }
} 