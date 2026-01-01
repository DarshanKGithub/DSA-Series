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

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;

public class Monster {
    
    public static class Monsters{
        int power;
        int bonus;

        Monsters(int power, int bonus){
            this.power = power;
            this.bonus = bonus;
        }
    }

    public static int maxMonster(int n, int e, int[] power, int[] bonus){
        //1.Create MonsterList, here we created number of monster where assing in n
        Monsters[] monsters = new Monsters[n];
        for(int i = 0; i < n; i++){
            monsters[i] = new Monsters(power[i], bonus[i]);
        } 

        //.We to sort the power in ascending order
        Arrays.sort(monsters, (a,b) -> a.power - b.power);

        //MaxHeap means maxDeafet by Monster
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        int exp = e;
        int count = 0;
        int i = 0;
   
        //Conditions 
        while(true){
            //Add all monster that can defeated now
            while(i < n && monsters[i].power <= exp){
                maxHeap.add(monsters[i].bonus);
                i++;
            }

            //No monster can be defeated
            if(maxHeap.isEmpty()){
                break;
            }

            //Defeat monster with maximum bonus
            exp += maxHeap.poll();
            count++;
        }

        return count;

    }
    public static void main(String[] args){
        int n = 3; //Monsters
        int e = 2;//Experience
        int[] power ={1,3,2};
        int[] bonus = {2,4,1};
        System.out.println(maxMonster(n,e,power,bonus));
    }
    
}
