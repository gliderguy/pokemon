import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BeforeClassWithStaticTest {

    @Ignore
    @Test
    public void testOne() {
        System.out.println("Normal BeforeClassWithStaticTest method #1.");
    }

    @Ignore
    @Test
    public void testTwo() {
        System.out.println("Normal BeforeClassWithStaticTest method #2.");
    }

    @BeforeClass
    public static void beforeClassSetup() {
        System.out.println("A static method setup before class.");
    }

    @AfterClass
    public static void afterClassSetup() {
        System.out.println("A static method setup after class.");
    }
}