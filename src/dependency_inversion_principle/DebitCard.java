package dependency_inversion_principle;

import dependency_inversion_principle.solution.BankCard;

public class DebitCard implements BankCard {
    @Override
    public void transaction() {
        System.out.println("using debit card");
    }
}
