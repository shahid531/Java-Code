package liskov_substitution_principle;

import liskov_substitution_principle.solution.DriftFunctionality;
import liskov_substitution_principle.solution.VehicleFunctionality;

public class Car implements VehicleFunctionality, DriftFunctionality {
    @Override
    public void road() {

    }

    @Override
    public void drift() {

    }
}
