public class BankAccount {
    double balance;
    int accountID;
    String password;
    public BankAccount(double b, int id, String p) {
        balance = b;
        accountID = a;
        password = p;
    }
    public BankAccount() {
        balance = 1023.45;
        accountID = 100203;
    }
    public String toString() {
        return accountID + "\t" + balance;
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountID() {
        return accountID;
    }
    public void setPassword(String npw) {
        password = npw;
    }
    public boolean deposit(double am) {
        if(balance >= 0) {
            balance += am;
            return true;
        }
        else{return false;}
    }
    public boolean withdraw(double amt) {
        if(balance - amt >= 0) {
            balance -= amt;
            return true;
        }
        else{return false;}
    }
    
    public void main(String[] args) {
        BankAccount a = new BankAccount(987.65, 1234567, "bean");
        System.out.println(a.getBalance());
        System.out.println(a.getAccountID());
        a.setPassword("monky");
        deposit(102.3);
        withdraw(300.0);
        withdraw(10000.0);
    }
}
