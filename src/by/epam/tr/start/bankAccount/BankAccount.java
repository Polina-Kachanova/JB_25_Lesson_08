package by.epam.tr.start.bankAccount;

public class BankAccount {

    public enum CURRENCY{USD, EUR, RUB}
    private int accountNo;
    private double accountSum;
    private CURRENCY currency;

    public BankAccount(int accountNo, double accountSum, CURRENCY currency){
        this.accountNo = accountNo;
        this.accountSum = accountSum;
        this.currency = currency;
    }

    public int getAccountNo() {
        return this.accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public double getAccountSum() {
        return this.accountSum;
    }

    public void setAccountSum(double accountSum) {
        this.accountSum = accountSum;
    }

    public CURRENCY getCurrency() {
        return this.currency;
    }

    public void setCurrency(CURRENCY currency) {
        this.currency = currency;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + accountNo;
        result = prime * result + (int)accountSum;
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BankAccount other = (BankAccount) obj;
        if (accountNo != other.accountNo)
            return false;
        if (accountSum != other.accountSum)
            return false;
        if (currency != other.currency)
            return false;
        return true;
    }

    @Override
    public String toString(){
        return ("Bank Account: " + getAccountNo() + ", account sum: " + getAccountSum() + " " + getCurrency());
    }
}




