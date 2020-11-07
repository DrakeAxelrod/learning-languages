import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz fb;

    @BeforeEach
    public void setUp() throws Exception {
    fb = new FizzBuzz();
    }

    @Test
    public void canEvaluate(){
        fb.evaluate(1);
    }

    @Test
    public void oneReturnsOne(){
        String result = fb.evaluate(1);
        assertEquals("1",result);
    }
}
