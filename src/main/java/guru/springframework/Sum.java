package guru.springframework;

public class Sum implements Expression {
    Money augmend;
    Money addmend;

    String name = "Viktor";

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(String to, Bank bank) {
        int amount = augmend.amount + addmend.amount;
        return new Money(amount, to);
    }
}
