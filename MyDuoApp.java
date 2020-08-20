package be.intecbrussel.hoofdstuk17;

public class MyDuoApp
{
    public static void main(String[] args)
    {
        MyDuo<Integer, String> moi = new MyDuo<>(123, "C'est moi.");
        String monString = moi.getSecond();
        Integer monInteger = moi.getPremier();
        System.out.println(monString);
        System.out.println(monInteger);
    }
}
