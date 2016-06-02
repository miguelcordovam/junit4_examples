package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import rules.ErrorCollectorTests;
import rules.LongRunningTests;

@RunWith(Suite.class)
@SuiteClasses({ErrorCollectorTests.class, LongRunningTests.class})
public class TestSuiteExample {
}
