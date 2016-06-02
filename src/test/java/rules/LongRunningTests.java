package rules;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;

public class LongRunningTests {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(5);

    @Rule
    public TestName name = new TestName();

    @Test
    @Ignore
    public void eternity() {
        System.out.println("Testing : "  + name);

        while (true);

    }
}
