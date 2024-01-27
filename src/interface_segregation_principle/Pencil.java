package interface_segregation_principle;

import interface_segregation_principle.solution.PencilRubber;

/*A class should not be forced to implement interfaces it does not use. Clients should not be forced to depend on interfaces they do not use.*/
public class Pencil implements PencilRubber {
    @Override
    public void pencilRubber() {

    }
}
