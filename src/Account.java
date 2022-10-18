public class Account {
    private String accountHolderName;

    private String accountNumber;

    private String accountType;

    private int currentAmount;

    private int deposit;

    public boolean isLoan;

    // List Card

    public static void printCountryName() {
        System.out.println("Bangladesh");
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void publicMethod() {
        sampleMethod();
    }

    private void sampleMethod() {

    }
}
