public class AccountTest {
  public AccountTest() {
     // Tidak melakukan apa-apa
  }

  public void test() {
     // Melakukan tes terhadap method transfer.
     // Asumsikan method lainnya benar.
     Account a = AccountFactory.withBalance(20);
     Account b = AccountFactory.withBalance(20);
     Account t = AccountFactory.withBalance(0);
     try {
        a.transfer(t, 15);
     } catch (InvalidAmountException e) {
         // bad
         assert false; 
     }
     assert a.getNumOfTransaction() == 1;
     // assert t.getNumOfTransaction() == 0;
     assert a.getBalance() == 5;
     assert t.getBalance() == 15;
     try {
        b.transfer(t, 25);
        assert false;
     } catch (InvalidAmountException e) {
         // good
     }
     assert b.getNumOfTransaction() == 0;
     // assert t.getNumOfTransaction() == 0;
     assert b.getBalance() == 20;
     assert t.getBalance() == 15;
  }
}