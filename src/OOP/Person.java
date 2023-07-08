package OOP;

public class Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(25);
        person1.setName("Chris");
        person1.setBeer(person1.beer);

        person1.getDescription();
    }

    private static final String description = "Just a usual human";
    private String name;
    private int age;
    private Beer beer;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным!");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Имя не может быть пустым!");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setBeer(Beer beer) {
        this.beer = beer;
    }

    public Beer getBeer() {
        return beer;
    }

    public void getDescription() {
        System.out.println(description);
    }

    public void drinkBeer() {
        System.out.println("Slurp-Slurp... Ahhh... " + beer.getBrand() + " is so freacking good");
    }

    public void buyingSomeBeer() {
        if (age < 18) {
            System.out.println("- Добрый вечер, что для вас?");
            System.out.println("- Дайте мне пожалуйста " + beer.getQuantity() + " банки " + beer.getBrand() + "'а по " + beer.getVolume() + " л пожалуйста");
            System.out.println("- Рано тебе ещё пива, купи лучше мороженку.");
        } else {
            System.out.println("- Добрый вечер, что для вас?");
            System.out.println("- Дайте мне пожалуйста " + beer.getQuantity() + " банки " + beer.getBrand() + "'а по " + beer.getVolume() + " л пожалуйста");
        }
    }
}
