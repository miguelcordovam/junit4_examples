package theory.supplier;

import org.junit.FixMethodOrder;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import theory.supplier.SomeData;

import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TheoryWithSupplier {

    @Theory
    public void testSomething(@SomeData int x) {
        System.out.println(x + " Something");
        assertTrue(x < 3);
    }


    @Theory
    public void testSomethingElse(@SomeData int x){
        System.out.println(x + " Something else");
    }
}
