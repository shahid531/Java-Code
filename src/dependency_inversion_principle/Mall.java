package dependency_inversion_principle;

import dependency_inversion_principle.solution.BankCard;

/* High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details; details should depend on abstractions.*/
public class Mall {

    private final BankCard bankCard;

    public Mall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void transaction() {
        bankCard.transaction();
    }
}
