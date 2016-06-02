package theory.supplier;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;


public class TestDataSupplier extends ParameterSupplier {

    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {

        List<PotentialAssignment> result = new ArrayList<>();
        result.add(PotentialAssignment.forValue("One", new Integer(1)));
        result.add(PotentialAssignment.forValue("Any text", new Integer(2)));
        result.add(PotentialAssignment.forValue("Too big", new Integer(3)));
        result.add(PotentialAssignment.forValue("Way too big", new Integer(10)));

        return result;
    }
}
