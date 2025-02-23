package OOP.New;

public class ClassesTraining {
    public static void main(String[] args) {

        Person p1 = new Person("Bob",  25);
        Person p2 = new Person("John", 30);
        Student student = new Student("Nigga", 20, 324586);

        System.out.println(student.toString());

        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());

        p2.birthday();

    }
}

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        this.age++;
        System.out.println("У " + this.getName() + " сегодня день рождения! Ему исполняется " + age + " лет!");
    }

}
