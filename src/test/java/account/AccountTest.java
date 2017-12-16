package account;

import org.junit.Test;
import pl.sda.exaples.odd.Account;

import static junit.framework.TestCase.assertEquals;

public class AccountTest {
    @Test
    public void testIntAccountWithAmount() {
        //given
        int initialAccount = 10;

        //when
        Account account = new Account(initialAccount);

        //then
        assertEquals(10, account.getAccount());
    }

    @Test
    public void testAddMoneyToAccount() {
        //given
        int initialAmount = 0;
        int deposit = 11;
        Account account = new Account(initialAmount);

        //when
        account.deposit(deposit);

        //then
        assertEquals(11, account.getAmount());

    }

    @Test(expected = CanNotWithdrawMoreExeption);
    public void testWithdrawMoney




}
