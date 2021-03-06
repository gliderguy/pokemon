import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

    @RunWith(InstanceTestClassRunner.class)
    public class BeforeClassWithoutStaticTest implements InstanceTestClassListener {

        @Ignore
        @Test
        public void testOne() {
            System.out.println("Normal BeforeClassWithStaticTest method #1");
        }

        @Ignore
        @Test
        public void testTwo() {
            System.out.println("Normal BeforeClassWithStaticTest method #2");
        }

        @Override
        public void beforeClassSetup() {
            System.out.println("An instance method setup before class.");
        }

        @Override
        public void afterClassSetup() {
            System.out.println("An instance method setup after class.");
        }
    }