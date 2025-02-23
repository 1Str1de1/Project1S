package OOP.Monsters;

public class Ghoul extends Monster {
    private static int count = 1;
    public Ghoul() {
        setName("Ghoul" + count);
        setHp(12);
        setStrength(4);
        count++;
    }

}
