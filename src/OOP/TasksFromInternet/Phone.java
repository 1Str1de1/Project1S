package OOP.TasksFromInternet;

public class Phone {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.setNumber(123567890);
        phone2.setNumber(123567891);
        phone3.setNumber(123567892);

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.setModel("A30");
        phone2.setModel("A50");
        phone3.setModel("A9999999");

        System.out.println("Модель: " + phone1.getModel());
        System.out.println("Модель: " + phone2.getModel());
        System.out.println("Модель: " + phone3.getModel());

        phone1.setWeight(0.150);
        phone2.setWeight(0.178);
        phone3.setWeight(0.125);

        System.out.println("Вес телефона: " + phone1.getWeight());
        System.out.println("Вес телефона: " + phone2.getWeight());
        System.out.println("Вес телефона: " + phone3.getWeight());

        phone1.receiveCall("Chris");
        phone2.receiveCall("Biba");
        phone3.receiveCall("Boba");

        phone1.receiveCall("Boris", 1234567895);

        phone1.sendMessage(1234456789, 1234567890, 1234567891);
    }

    private int number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + " номер телефона: " + number);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Номера телефонов, на которые было отправлено сообщение: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
