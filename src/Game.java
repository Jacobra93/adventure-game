import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Choose your character's name: ");
        String name = reader.nextLine();

        Character character = new Character(name);

        character.displayCharacter();
    }
}