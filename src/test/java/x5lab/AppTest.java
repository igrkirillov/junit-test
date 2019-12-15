package x5lab;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testHashCode() {
        Stream.of("1","2")
                .peek(System.out::println)
                .peek(System.out::println)
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);
    }
}
