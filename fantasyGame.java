
import java.util.Scanner;

interface SpecialAbility {
    void useSpecialAbility();
}

class Character {
    String name;
    int health;

    Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    }

    void attack() {
        System.out.println(name + " performs a general attack!");
    }
}

class Warrior extends Character implements SpecialAbility {
    String weapon;

    Warrior(String name, int health, String weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    @Override
    void attack() {
        System.out.println(name + " attacks using a " + weapon + "!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " performs a powerful sword attack!");
    }
}

class Mage extends Character implements SpecialAbility {
    int magicPower;

    Mage(String name, int health, int magicPower) {
        super(name, health);
        this.magicPower = magicPower;
    }

    @Override
    void attack() {
        System.out.println(name + " attacks using magic!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts a powerful magic spell!");
    }
}

class Archer extends Character implements SpecialAbility {
    int arrows;

    Archer(String name, int health, int arrows) {
        super(name, health);
        this.arrows = arrows;
    }

    @Override
    void attack() {
        System.out.println(name + " attacks using arrows!");
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " fires multiple arrows!");
    }
}

public class fantasyGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Warrior name: ");
        String warriorName = sc.nextLine();

        System.out.print("Enter Warrior health: ");
        int warriorHealth = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Mage name: ");
        String mageName = sc.nextLine();

        System.out.print("Enter Mage health: ");
        int mageHealth = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Archer name: ");
        String archerName = sc.nextLine();

        System.out.print("Enter Archer health: ");
        int archerHealth = Integer.parseInt(sc.nextLine());

        Warrior warrior = new Warrior(warriorName, warriorHealth, "Sword");
        Mage mage = new Mage(mageName, mageHealth, 80);
        Archer archer = new Archer(archerName, archerHealth, 20);


        Character c1 = warrior;
        c1.displayDetails();
        c1.attack();
        warrior.useSpecialAbility();

        System.out.println();


        Character c2 = mage;
        c2.displayDetails();
        c2.attack();
        mage.useSpecialAbility();

        System.out.println();


        Character c3 = archer;
        c3.displayDetails();
        c3.attack();
        archer.useSpecialAbility();

        sc.close();
    }
}
