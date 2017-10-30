import java.util.ArrayList;

public class Character {
    public String name;
    public double level;
    public double magicLevel;
    public double strengthLevel;
    public ArrayList<Item> itemList;

    public Character (String name) {
        this.name = name;
        this.level = 1;
        this.magicLevel = 0;
        this.strengthLevel = 0;
        this.itemList = new ArrayList<>();
    }

    public void levelUp() {
        level++;
    }

    public void increaseSpecialty(String specialty) {
        if (specialty == "magicLevel") {
            magicLevel++;
        } else {
            strengthLevel++;
        }
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void loseItem(Item item) {
        itemList.remove(item);
    }

    public void displayCharacter() {
        System.out.println(name + "\n" + "Level: " + level + "\n" +
        "Magic: " + magicLevel + ", Strength: " + strengthLevel);
    }

}
