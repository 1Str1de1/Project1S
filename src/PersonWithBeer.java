public class PersonWithBeer {
    public static void main(String[] args) {
        Beer beer1 = new Beer();
        Person person1 = new Person("Borya", 23);

        person1.setBeer(beer1);
        beer1.setBrand("Hoegaarden");
        beer1.setPerson(person1);
        beer1.setCountry("Belgium");
        beer1.setVolume(0.5);
        beer1.setQuantity(2);

        person1.drinkBeer();

        person1.buyingSomeBeer();
    }
}
