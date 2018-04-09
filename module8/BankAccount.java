package module8;

public class BankAccount {

    private int accountId;
    private String accountName;

    public BankAccount(int id, String name) {
        this.accountId = id;
        this.accountName = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) obj;
        if (accountId != bankAccount.accountId) {
            return false;
        }
        if (null == accountName) {
            return (accountName == bankAccount.accountName);
        } else {
            if (!accountName.equals(bankAccount.accountName)) {
                return false;
            }
        }
        return true;
    }
    // return accountName != null ? accountName.equals(bankAccount.accountName): bankAccount.accountName == null;


    public int hashCode() {
        int hash = accountId;
        hash = hash * 31 + (accountName != null ? accountName.hashCode() : 0);
        return hash;
    }

    public String toString() {
        return "Bank Account [accountName=" + accountName + " accountId=" + accountId + "]";
    }

    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(2, "f");
        BankAccount bank2 = new BankAccount(2, "f");
        if (bank1.equals(bank2)) {
            System.out.println("First " + bank1.toString() + " равен Second " + bank2.toString());
        } else {
            System.out.println("First " + bank1.toString() + " НЕ равен Second" + bank2.toString());
        }
    }
}
