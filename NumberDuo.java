package be.intecbrussel.hoofdstuk17;

public class NumberDuo<E extends Number>
{
    private E premier;
    private E second;

    public NumberDuo(E premierP, E secondP)
    {
        this.premier = premierP;
        this.second = secondP;
    }

    public double getSum()
    {
        return premier.doubleValue() + second.doubleValue();
    }
}
