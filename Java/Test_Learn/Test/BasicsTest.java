import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicsTest
{
    @Test
    public void BasicsClass_Instantiation_True()
    {
        Basics b = new Basics();
        assertEquals(10, b.add(5,5));
    }
}
