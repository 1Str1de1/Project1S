package OOP.New;

public class Student extends Person {

    private int studentID;


    public Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return this.studentID;
    }

    @Override
    public String toString() {
        return ("Студенту " + getName() + " " + getAge() + " лет. Его студенческий ID: " + getStudentID());
    }

    public void study() {
        System.out.println("Студент " + getName() + " старается учиться");
    }
}
