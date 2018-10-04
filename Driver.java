public class Driver {

	public static void main(String[] args) {
		BankAccount a = new BankAccount(987.65, 1234567, "bean");
        System.out.println(a.getBalance());
        System.out.println(a.getAccountID());
        a.setPassword("monky");
        a.deposit(102.3);
        a.withdraw(300.0);
        a.withdraw(10000.0);
		System.out.println(a.getBalance());
	}
}