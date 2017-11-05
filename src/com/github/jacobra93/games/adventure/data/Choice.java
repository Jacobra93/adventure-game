package com.github.jacobra93.games.adventure.data;

import com.github.jacobra93.games.adventure.enums.Option;
import com.github.jacobra93.games.adventure.enums.StoryName;

public class Choice {
    private final StoryName startStory;
    private final Option option;
    private final String choice;
    private final StoryName resultStory;

    public Choice(StoryName startStory, Option option, String choice, StoryName resultStory) {
        this.startStory = startStory;
        this.option = option;
        this.choice = choice;
        this.resultStory = resultStory;
    }

    public StoryName getStartStory() {
        return startStory;
    }

    public Option getOption() {
        return option;
    }

    public String getChoice() {
        return choice;
    }

    public StoryName getResultStory() {
        return resultStory;
    }

    public void printChoice() {
        System.out.println(this.option + ": " + this.choice);
    }

}