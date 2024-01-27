package liskov_substitution_principle;

import liskov_substitution_principle.solution.PlaneFunctionality;

/*Subtypes should be substitutable for their base types without altering the correctness of the program.*/
public class Aeroplane implements PlaneFunctionality {
    @Override
    public void fly() {

    }

    @Override
    public void road() {

    }
}
