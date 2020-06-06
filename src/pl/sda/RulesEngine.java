package pl.sda;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class RulesEngine {
    private BigDecimal interestRate;
    private BigDecimal commission;

    public RulesEngine(BigDecimal interestRate, BigDecimal commission) {
        this.interestRate = interestRate;
        this.commission = commission;
    }

    public boolean isCreditApproved(Debtor debtor) {
        // Reguły odrzucania:
        // a wiek > 65 odrzuć
        // b sumaryczne raty kredytów + rata nowego kredytu <= dochód * 0,80 odrzuć
        // c opóźnienie w spłacie == tak odrzuć
        // d wiek + okres spłaty > 65 odrzuć
        // jak wyliczyć ratę koszt kredytu
        // kwota kredytu * oprocentowanie + prowizja
        // Jak wyliczyć ratę kredytu
        // kwota kredytu + koszt kredytu / okres spłaty
        //a
        boolean isOver65 = debtor.getAge() > 65;
        //b
        BigDecimal incomeFactor = debtor.getIncome().multiply(BigDecimal.valueOf(0.8));

        BigDecimal installmentsSum = BigDecimal.ZERO;
        for (BigDecimal installment : debtor.getInstallments()) {
            installmentsSum = installmentsSum.add(installment);
        }
        BigDecimal loanCost = debtor.getAmountOfCredit()
                .multiply(interestRate)
                .add(commission);
        BigDecimal newInstallment = loanCost.add(debtor.getAmountOfCredit())
                .divide(BigDecimal.valueOf(debtor.getDurationInMonth()), RoundingMode.DOWN);

        boolean installmentRule = installmentsSum.add(newInstallment).compareTo(incomeFactor) >= 0;
        //c
        boolean repaymentDelayed = debtor.isRepaymentDelayed();
        //d
        boolean willBeAfter65InLastDayOfLoan = (debtor.getAge() + debtor.getDurationInMonth()/12) > 65;

        return !(isOver65 || installmentRule || repaymentDelayed || willBeAfter65InLastDayOfLoan);
    }
}
