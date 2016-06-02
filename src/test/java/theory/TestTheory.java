package theory;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assume.assumeThat;

@RunWith(Theories.class)
public class TestTheory {

    @DataPoints
    public static String[] animals = {"aligator", "bear", "camel"};

    @DataPoints
    public static Integer[] integers = {1, 2, 3};

    @Theory
    public void someTest(String x, Integer y) {
        System.out.println(x + " " + y);
        assumeThat(x, not(startsWith("a")));
        System.out.println("continua " + x + " " + y);
    }

}
