package liskov_substitution_principle;

import liskov_substitution_principle.solution.DriftFunctionality;
import liskov_substitution_principle.solution.VehicleFunctionality;

/*Subtypes should be substitutable for their base types without altering the correctness of the program.*/
public class Car implements VehicleFunctionality, DriftFunctionality {
    @Override
    public void road() {

    }

    @Override
    public void drift() {

    }
}
