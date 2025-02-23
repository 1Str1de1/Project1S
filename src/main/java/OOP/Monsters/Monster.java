package OOP.Monsters;

import java.util.Random;

public class Monster {
    private Random random = new Random();
    private int hp;
    private int strength;
    private String name;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHP() {
        return hp;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getHpString () {
        System.out.println("У " + name + " осталось " + hp + " hp.");
    }

    public void hitWithFists(Monster monster) {
        int hit = random.nextInt(4 + strength);
        monster.hp -= hit;
        System.out.println(name + " бьёт " + monster.name + ", нанося " + hit + " урона.");
        if (monster.getHP() <= 0) {
            System.out.println(monster.getName() + " пал от кулаков " + name);
        } else return;
    }
}
