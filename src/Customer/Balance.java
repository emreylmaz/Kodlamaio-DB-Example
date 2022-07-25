package Customer;

public class Balance {
    private long id;
    private double balance;
    private IndividualBalance individualBalance;
    private CorporateBalance corporateBalance;
    private String firstDate; //nullable
    private String secondDate; //nullable

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public IndividualBalance getIndividualBalance() {
        return individualBalance;
    }

    public void setIndividualBalance(IndividualBalance individualBalance) {
        this.individualBalance = individualBalance;
    }

    public CorporateBalance getCorporateBalance() {
        return corporateBalance;
    }

    public void setCorporateBalance(CorporateBalance corporateBalance) {
        this.corporateBalance = corporateBalance;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getSecondDate() {
        return secondDate;
    }

    public void setSecondDate(String secondDate) {
        this.secondDate = secondDate;
    }
}
