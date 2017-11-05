package com.github.jacobra93.games.adventure.executable;

import com.github.jacobra93.games.adventure.data.Choice;
import com.github.jacobra93.games.adventure.config.GameInitializer;
import com.github.jacobra93.games.adventure.enums.Option;
import com.github.jacobra93.games.adventure.enums.StoryName;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        StoryName storySection = StoryName.ONE;
        List<Choice> choices = GameInitializer.loadChoices();
        Map<StoryName, String> stories = GameInitializer.loadStories();

        // main loop for the game
        while (true) {
            List<Choice> specifiedChoices = new ArrayList<>();

            for (Map.Entry<StoryName, String> entry : stories.entrySet()) {
                if (entry.getKey() == storySection) {
                    System.out.println(entry.getValue());
                }
            }

            for (Choice choice : choices) {
                if (choice.getStartStory() == storySection) {
                    choice.printChoice();
                    specifiedChoices.add(choice);
                }
            }

            System.out.println("Choose a response: ");
            String optionString = reader.nextLine();

            Option option;
            while(true){
                if(optionString.toLowerCase().equals("exit")){
                    System.out.println("Exiting game...");
                    return;
                }

                try {
                    option = Option.valueOf(optionString.toUpperCase());
                    break;
                } catch (IllegalArgumentException e){
                    System.out.println(optionString + " is not a valid option.");
                    System.out.println("Please enter A, B or Exit");
                    optionString = reader.nextLine();
                }
            }

            for (Choice specificChoice : specifiedChoices) {
                if (specificChoice.getOption() == option) {
                    storySection = specificChoice.getResultStory();
                }
            }
        }
    }
}
