package pl.sda;

public class Main {

    public static void main(String[] args) {
        // Napisz aplikacje do analizy zdolnosci kredytowej, parametry które powinny zostać wzięte pod uwagę to:
        // * wiek
        // * dochód
        // * sumarycznie raty kredytów, które kredytobiorca spłaca
        // * czy było opóźnienie w spłacie kredytu - jeśli było to odrzuć
        // * kwota kredytu
        // * koszt kredytu
        // * okres spłaty (w latach)
        // * rata kredytu, który kredytobiorca chce wziąć
        // Reguły odrzucania:
        // a wiek > 65 odrzuć
        // b sumaryczne raty kredytów + rata nowego kredytu >= dochód * 0,80 odrzuć
        // c opóźnienie w spłacie == tak odrzuć
        // d wiek + okres spłaty > 65 odrzuć
        // jak wyliczyć ratę koszt kredytu
        // kwota kredytu * oprocentowanie + prowizja
        // Jak wyliczyć ratę kredytu
        // kwota kredytu + koszt kredytu / okres spłaty
        // ************ Jak powinna działać aplikacja? ***************
        // 1. Klient jest pytany o:
        // * wiek (age)
        // * dochód (income)
        // * raty kredytów które spłaca (wprowadza po przecinku) (loanInstallments)
        // * odpowiada czy było opóźnienie (repaymentDelayed)
        // * wprowadza ile chce pożyczyć (amountOfCredit)
        // Wprowadzone dane zapisz do klasy Debtor (raty kredytów wprowadzone po przecinku musisz rozbić na pojedyncze elementy, zapisz je tablicy)
        // 2. Stwórz klasę RulesEngine, która będzie przetwarzała podane argumenty, powinna:
        // a mieć pola, które są wypełniane w konstruktorze:
        // * oprocentowanie (np. 0,06)
        // * kwota stała prowizji (np. 3000)
        // b mieć metodę isCreditApproved przyjmującą obiekt typu Debtor - dane osoby wnioskującej o kredyt i zwracającą boolean (true = wniosek ok, false = wniosek odrzucony)
        // * w metodzie zaimplementuj wszystkie reguły odrzucania, jeśl żadna z nich nie jest spełniona zwróć true, jeśli którakolwiek jest spełniona zwróć false
        // 3. W main utwórz zmienną zawierającą nowy obiekt typu RulesEngine podając w konstruktorze parametry (np. 0,06 i 3000), przetestuj czy rzeczywiscie podane reguły działają
        // 4. W argumencie wprowadź obiekt Debtor utworzony z wprowadzonych przez klienta danych



    }
}
