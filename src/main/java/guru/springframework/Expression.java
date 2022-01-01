package guru.springframework;

public interface Expression {

    @Override
    Expression(Money augmend, Money addmend);

    @Override
    Expression(Money augmend, Money addmend);

    Money reduce(Bank bank, String to);

    Money reduce(String to);
}
