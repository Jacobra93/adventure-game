public class Character {
    public String name;
    public double level;
    public double magicLevel;
    public double stealthLevel;
    public double strengthLevel;

    public Character (String name) {
        this.name = name;
        this.level = 1;
        this.magicLevel = 0;
        this.stealthLevel = 0;
        this.strengthLevel = 0;
    }

    public void levelUp() {
        level++;
    }

    public void increaseSpecialty(String specialty) {
        if (specialty == "magicLevel") {
            magicLevel++;
        } else if (specialty == "stealthLevel") {
            stealthLevel++;
        } else {
            strengthLevel++;
        }
    }

    public void displayCharacter() {
        System.out.println(name + "\n" + "Level: " + level + "\n" +
        "Magic: " + magicLevel + ", Stealth: " + stealthLevel +
         ", Strength: " + strengthLevel);
    }

}
