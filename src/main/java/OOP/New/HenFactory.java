package OOP.New;

public class HenFactory {
    public static void main(String[] args) {

        RussianHen rh1 = new RussianHen();
        UkranianHen uh1 = new UkranianHen();
        RussianHen[] russianHens = new RussianHen[12];

        for (int i = 0; i < russianHens.length; i++) {
            russianHens[i] = new RussianHen();
        }

        Hen hen = HenFactory.getHen("Russia");

        System.out.println(hen.getDescription());
        System.out.println(rh1.getDescription());
        System.out.println(uh1.getDescription());

    }

    public static Hen getHen(String country) {
        Hen hen = null;
        if (country.equals("Russia")) {
            hen = new RussianHen();
        } else if (country.equals("Ukraine")) {
            hen = new UkranianHen();
        }
        return hen;
    }
}

abstract class Hen {

    public abstract int getAmountOfEggsPerMonth();
    public abstract String getCountry();

    public String getDescription() {
        return "Я курица.";
    }
}

class RussianHen extends Hen {

    private static String country = "Russia";
    private int amountOfEggs = 21;

    @Override
    public int getAmountOfEggsPerMonth() {
        return amountOfEggs;
    }

    @Override
    public String getDescription() {
        return "Я курица. Моя страна - " + country + ". Я несу " + getAmountOfEggsPerMonth() + " яиц в месяц.";
    }

    public String getCountry() {
        return country;
    }
}

class UkranianHen extends Hen {

    private static String country = "Ukraine";
    private int amountOfEggs = 18;

    @Override
    public int getAmountOfEggsPerMonth() {
        return amountOfEggs;
    }

    @Override
    public String getDescription() {
        return "Я курица. Моя страна - " + country + ". Я несу " + getAmountOfEggsPerMonth() + " яиц в месяц.";
    }

    public String getCountry() {
        return country;
    }
}

