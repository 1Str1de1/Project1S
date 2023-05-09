package OOP;

public class Beer {
    public static void main(String[] args) {
        Beer beer1 = new Beer();
        beer1.setCountry("Belgium");
        beer1.setBrand("Hoegaarden");
        beer1.setQuantity(2);
        beer1.setVolume(0.5);

        beer1.complimentTheBeer();
        System.out.println();
    }

    private String country;
    private String brand;
    private double volume;
    private int quantity;
    private Person person;

    public void setCountry(String country) {
        if (country.isEmpty()) {
            System.out.println("Страна не может не иметь названия");
        } else {
            this.country = country;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty()) {
            System.out.println("Пиво обязано иметь название!");
        } else {
            this.brand = brand;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setVolume(double volume) {
        if (volume < 0) {
            return;
        } else {
            this.volume = volume;
        }
    }

    public double getVolume() {
        return volume;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            return;
        } else {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void complimentTheBeer() {
        System.out.println("- Какие сорта пива предпочитаете?");
        System.out.println("- Вот брал недавно пиво из прекрасной страны под названием " + country + " марки " + brand + ". Нормальное пиво. Пить можно.");
        System.out.println("- Похвалите ещё пиво");
        System.out.println("- Ну как его похвалить? Ну заебись пиво, пиздатое пиво. Как его ещё похвалить, блять? :D");
        System.out.println("- А ещё пару красивых слов?");
        System.out.println("- Невъебенное пиво. Жидкое золото!");
    }
}

