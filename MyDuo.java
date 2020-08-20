package be.intecbrussel.hoofdstuk17;

public class MyDuo<E1, E2>
{
    private E1 premier;
    private E2 second;


    public MyDuo(E1 premierParam, E2 secondParam)
    {
        this.premier = premierParam;
        this.second = secondParam;
    }

    public E1 getPremier()
    {
        return premier;
    }
    public void setPremier(E1 premierParam)
    {
        this.premier = premierParam;
    }

    public E2 getSecond()
    {
        return second;
    }
    public void setSecond(E2 secondParam)
    {
        this.second = secondParam;
    }
}
