public class BankAccount {
    double balance;
    int accountID;
    String password;
    public BankAccount(double b, int id, String p) {
        balance = b;
        accountID = id;
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
    
    private boolean authenticate(String pass) {
        return pass == password;
    }
    
    public boolean transferTo(BankAccount o, double amt, String pass) {
        if(authenticate(pass)) {
            if(amt < balance) {
                balance -= amt;
                o.balance += amt;
                System.out.println(amt + " transferred successfully.");
                return true;
            }
            else{System.out.println("Amount withdrawn > Account balance"); return false;}
        }
        else{System.out.println("Incorrect password"); return false;}
    }
}
