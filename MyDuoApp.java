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

        NumberDuo<Integer> ndI = new NumberDuo<>(1, 2);
        NumberDuo<Double> ndD = new NumberDuo<>(3.4, 5.6);
        NumberDuo<Number> ndN = new NumberDuo<>(7, 8.9);
        System.out.println(ndI.getSum());
        System.out.println(ndD.getSum());
        System.out.println(ndN.getSum());
    }
}
