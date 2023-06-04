package OOP.Monsters;

public class Fight {
    public static void main(String[] args) {
        Ghoul ghoul = new Ghoul();
        Goblin goblin = new Goblin();

        goblin.hitWithFists(ghoul);
        ghoul.getHpString();
        ghoul.hitWithFists(goblin);
        goblin.getHpString();

        goblin.hitWithFists(ghoul);
        ghoul.getHpString();
        ghoul.hitWithFists(goblin);
        goblin.getHpString();

        goblin.hitWithFists(ghoul);
        ghoul.getHpString();
        ghoul.hitWithFists(goblin);
        goblin.getHpString();
    }
}
