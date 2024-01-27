package dependency_inversion_principle;


import dependency_inversion_principle.solution.BankCard;

public class CreditCard implements BankCard {
    @Override
    public void transaction() {
        System.out.println("using credit card");
    }
}
