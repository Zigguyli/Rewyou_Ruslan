package collection.tasks;

public class Test {
    public static void main(String[] args) {
        Hero rustikHero = new Hero("Ruslan", "Magic", 39, 3);
        rustikHero.addCreature(new Pikeman("General Pikeman", 4, 350, 300, 50, 1), 1);

        Hero ilyasHero = new Hero("Ilyas", "Swordman", 32, 3);

        ilyasHero.addCreature(new Angel("General Pikeman", 10, 600, 500, 75, 1), 1);
        ilyasHero.addCreature(new Angel("Generallisimus", 10, 600, 500, 75, 1), 1);
        Battlefield battlefield_1 = new Battlefield();
        battlefield_1.battle(rustikHero, ilyasHero);
    }
}
