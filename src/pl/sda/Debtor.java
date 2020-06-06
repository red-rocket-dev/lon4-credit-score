package pl.sda;

import java.math.BigDecimal;
import java.util.Arrays;

public class Debtor {
    private int age;
    private BigDecimal amountOfCredit;
    private BigDecimal[] installments;
    private BigDecimal income;
    private long durationInMonth;
    private boolean repaymentDelayed;

    public Debtor(int age, BigDecimal amountOfCredit, BigDecimal[] installments, BigDecimal income, long durationInMonth, boolean repaymentDelayed) {
        this.age = age;
        this.amountOfCredit = amountOfCredit;
        this.installments = installments;
        this.income = income;
        this.durationInMonth = durationInMonth;
        this.repaymentDelayed = repaymentDelayed;
    }

    public boolean isRepaymentDelayed() {
        return repaymentDelayed;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getAmountOfCredit() {
        return amountOfCredit;
    }

    public BigDecimal[] getInstallments() {
        return installments;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public long getDurationInMonth() {
        return durationInMonth;
    }

    @Override
    public String toString() {
        return "Debtor{" +
                "age=" + age +
                ", amountOfCredit=" + amountOfCredit +
                ", installments=" + Arrays.toString(installments) +
                ", income=" + income +
                ", durationInMonth=" + durationInMonth +
                '}';
    }
}
