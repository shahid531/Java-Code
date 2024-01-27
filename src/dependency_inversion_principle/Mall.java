package dependency_inversion_principle;

import dependency_inversion_principle.solution.BankCard;

public class Mall {

    private final BankCard bankCard;

    public Mall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void transaction() {
        bankCard.transaction();
    }
}
