package OOP.Monsters;

public class Goblin extends Monster {
    private static int count = 1;
    public Goblin() {
        setName("Goblin" + count);
        setHp(10);
        setStrength(2);
        count++;
    }
}
