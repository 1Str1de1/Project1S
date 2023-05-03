
public class Beer {
    public static void main(String[] args) {
        Beer beer1 = new Beer();
        beer1.setCountry("Belgium");
        beer1.setBrand("Hoegaarden");
        beer1.setQuantity(2);
        beer1.setVolume(0.5);

        beer1.drinkBeer();
        System.out.println();

        beer1.complimentTheBeer();
        System.out.println();

        beer1.giveMeThePivo();
    }

    private String country;
    private String brand;
    private double volume;
    private int quantity;

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void drinkBeer() {
        System.out.println("Slurp-Slurp... Ahhh..." + brand + " is so freacking good");
    }

    public void complimentTheBeer() {
        System.out.println("- Какие сорта пива предпочитаете?");
        System.out.println("- Вот брал недавно пиво из прекрасной страны под названием " + country + " марки " + brand +
                ". Нормальное пиво. Пить можно.");
        System.out.println("- Похвалите ещё пиво");
        System.out.println("- Ну как его похвалить? Ну заебись пиво, пиздатое пиво. Как его ещё похвалить, блять? :D");
        System.out.println("- А ещё пару красивых слов?");
        System.out.println("- Невъебенное пиво. Жидкое золото!");
    }

    public void giveMeThePivo() {
        System.out.println("- Добрый вечер, что для вас?");
        System.out.println("- Дайте мне пожалуйста " + quantity + " банки " + brand + "'а по " + volume + " л пожалуйста");
    }
}

