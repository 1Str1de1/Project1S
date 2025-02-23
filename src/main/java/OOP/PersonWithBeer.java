package OOP;

public class PersonWithBeer {
    public static void main(String[] args) {
        Beer beer1 = new Beer();
        PersonOutdate personOutdate1 = new PersonOutdate("Borya", 23);
        PersonOutdate personOutdate2 = new PersonOutdate("Max", 14);

        personOutdate2.setBeer(beer1);
        personOutdate1.setBeer(beer1);
        beer1.setBrand("Hoegaarden");
        beer1.setPerson(personOutdate1);
        beer1.setCountry("Belgium");
        beer1.setVolume(0.5);
        beer1.setQuantity(2);

        personOutdate1.drinkBeer();

        personOutdate1.buyingSomeBeer();

        personOutdate2.buyingSomeBeer();
    }
}
