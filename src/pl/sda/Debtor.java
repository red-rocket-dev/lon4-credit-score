package pl.sda;

import java.math.BigDecimal;
import java.util.Arrays;

public class Debtor {
    private int age;
    private BigDecimal amountOfCredit;
    private BigDecimal[] installments;
    private BigDecimal income;
    private long durationInMonth;

    public Debtor(int age, BigDecimal amountOfCredit, BigDecimal[] installments, BigDecimal income, long durationInMonth) {
        this.age = age;
        this.amountOfCredit = amountOfCredit;
        this.installments = installments;
        this.income = income;
        this.durationInMonth = durationInMonth;
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
