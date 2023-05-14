package collection.tasks;

public class Creature {
    String name;
    int level, attack, protection, speed, amount = 0;

    public Creature(String name, int level, int attack, int protection, int speed, int amount) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.protection = protection;
        this.speed = speed;
        this.amount = amount;
    }

    public int getDamage(int attack, int protection) {
       if (attack > protection) {
           return attack - protection;
       }
       return 0;
    }

    public void addAmount(int amount) {
        this.amount += amount;
    }
    public void removeAmount(int quantity) {
        amount = amount - quantity;
    }

    @Override
    public String toString() {
        return "Creature{" + "name = '" + name + "'" +
                ", level = '" + level + "'" +
                ", attack = " + attack +
                ", protection = " + protection +
                ", speed = " + speed +
                ", amount = " + amount + "}";
    }

}
