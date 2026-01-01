/*
/*
Problem Statement: While playing an RPG game, you were assigned to complete one of the hardest quests in this game. There are n monsters you’ll need to defeat in this quest.

Each monster i is described with two integer numbers – poweri and bonusi. To defeat this monster, you’ll need at least poweri experience points. If you try fighting this monster without having enough experience points, you lose immediately. You will also gain bonusi experience points if you defeat this monster. You can defeat monsters in any order.
The quest turned out to be very hard – you try to defeat the monsters but keep losing repeatedly. Your friend told you that this quest is impossible to complete.
Knowing that, you’re interested, what is the maximum possible number of monsters you can defeat?

(Question difficulty level: Hardest)

Input:

The first line contains an integer, n, denoting the number of monsters. The next line contains an integer, e, denoting your initial experience.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, poweri, which represents power of the corresponding monster.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, bonusi, which represents bonus for defeating the corresponding monster.

 what we have:
 i)We hae monster = n times;
 ii)Each monster have two integer number:
    a)Power
    b)Bonus
    *Defeating the monster
 */



package Test.Monster;

import java.util.*;

public class MaxMonstersWithIndex {

    static class Monster {
        int power;
        int bonus;
        int index;

        Monster(int power, int bonus, int index) {
            this.power = power;
            this.bonus = bonus;
            this.index = index;
        }
    }

    public static List<Integer> maxMonsters(
            int n, int e, int[] power, int[] bonus) {

        // Step 1: Create monster list with index
        Monster[] monsters = new Monster[n];
        for (int i = 0; i < n; i++) {
            monsters[i] = new Monster(power[i], bonus[i], i);
        }

        // Step 2: Sort by power (ascending)
        Arrays.sort(monsters, (a, b) -> a.power - b.power);

        // Step 3: Max heap based on bonus
        PriorityQueue<Monster> maxHeap =
                new PriorityQueue<>((a, b) -> b.bonus - a.bonus);

        int exp = e;
        int i = 0;

        // To store defeated monster indices
        List<Integer> defeated = new ArrayList<>();

        // Step 4: Main logic
        while (true) {

            // Add all monsters that can be defeated now
            while (i < n && monsters[i].power <= exp) {
                maxHeap.add(monsters[i]);
                i++;
            }

            // No monster can be defeated
            if (maxHeap.isEmpty()) {
                break;
            }

            // Defeat the monster with maximum bonus
            Monster current = maxHeap.poll();
            exp += current.bonus;
            defeated.add(current.index);
        }

        return defeated;
    }

    public static void main(String[] args) {
        int n = 3;
        int e = 2;
        int[] power = {1, 3, 2};
        int[] bonus = {2, 4, 1};

        List<Integer> result = maxMonsters(n, e, power, bonus);

        System.out.println("Total monsters defeated: " + result.size());
        System.out.println("Monster indices defeated: " + result);
    }
}

