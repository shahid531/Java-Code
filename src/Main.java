import dependency_inversion_principle.DebitCard;
import dependency_inversion_principle.CreditCard;
import dependency_inversion_principle.Mall;
import dependency_inversion_principle.solution.BankCard;

public class Main {
    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();

        Mall mall = new Mall(bankCard);
        mall.transaction();
    }
}