package rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.core.Is.is;

public class ErrorCollectorTests {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void statementsCollectedSuccessfully() {

        String s = null;

        collector.checkThat("Value should not be null", null, is(s));

        s = "";
        collector.checkThat("Value should have the length of 1", s.length(), is(1));

        s = "Junit!";
        collector.checkThat("Value should have length of 10", s.length(), is(10));
    }
}
