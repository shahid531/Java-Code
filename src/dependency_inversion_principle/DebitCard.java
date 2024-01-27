package dependency_inversion_principle;

import dependency_inversion_principle.solution.BankCard;

/* High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions.*/
public class DebitCard implements BankCard {
    @Override
    public void transaction() {
        System.out.println("using debit card");
    }
}
