public class Bank {
    private String bankName;
    private String accountNo;
    private String accountType;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    private double balance;
    public Bank(String bankName, String accountNo, String accountType, double balance) {
        this.bankName = bankName;
        this.accountNo = accountNo;
        this.accountType = accountType;
        setBalance(100);
        this.balance = balance+getBalance();
    }
    public void show(){
        System.out.println(bankName+" "+accountNo+" "+accountType+" "+balance);
    }
}
