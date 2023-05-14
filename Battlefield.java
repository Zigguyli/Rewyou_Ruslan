package collection.tasks;

public class Battlefield {
    static int counter_1, counter_2, i = 0;
    public String battle(Hero hero_1, Hero hero_2) {
        if (hero_1.getExp() > hero_2.getExp()) {
            counter_1++;
        } else {
            counter_2++;
        }
        if (hero_1.getLevel() > hero_2.getLevel()) {
            counter_1++;
        } else {
            counter_2++;
        }
        while (hero_1.arrayList.size() > i && hero_2.arrayList.size() > i) {
            System.out.println(hero_1.arrayList.get(i).equals(hero_2.arrayList.get(i)));
            if (hero_1.arrayList.get(i).name.equals(hero_2.arrayList.get(i).name)) {
                if (hero_1.arrayList.get(i).speed > hero_2.arrayList.get(i).speed) { counter_1++;} else { counter_2++;}
                if (hero_1.arrayList.get(i).attack > hero_2.arrayList.get(i).attack) { counter_1++;} else { counter_2++;}
                if (hero_1.arrayList.get(i).protection > hero_2.arrayList.get(i).speed) { counter_1++;} else { counter_2++;}
                if (hero_1.arrayList.get(i).level > hero_2.arrayList.get(i).level) { counter_1++;} else { counter_2++;}
                if (hero_1.arrayList.get(i).amount > hero_2.arrayList.get(i).amount) { counter_1++;} else { counter_2++;}
            }
            i++;
        }
        if (hero_1.arrayList.size() > hero_2.arrayList.size()) {
            counter_1 += (hero_1.arrayList.size() - hero_2.arrayList.size()) * 5;
        } else {
            counter_2 += (hero_2.arrayList.size() - hero_1.arrayList.size()) * 5;
        }
        if (counter_1 > counter_2) {
            System.out.println("Winner is " + hero_1.getName());
        } else {
            System.out.println("Winner is " + hero_2.getName());
        }
        return " ";
    }
}
