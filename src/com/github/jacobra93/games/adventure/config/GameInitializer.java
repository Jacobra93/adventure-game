package com.github.jacobra93.games.adventure.config;

import com.github.jacobra93.games.adventure.data.Choice;
import com.github.jacobra93.games.adventure.enums.Option;
import com.github.jacobra93.games.adventure.enums.StoryName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameInitializer {

    public static List<Choice> loadChoices(){
        List<Choice> choices = new ArrayList<>();

        choices.add(new Choice(StoryName.ONE, Option.A, "frightened", StoryName.TWO_A));
        choices.add(new Choice(StoryName.ONE, Option.B, "faintly excited at the notion of getting to fight", StoryName.TWO_B));
        choices.add(new Choice(StoryName.TWO_A, Option.A, "Continue", StoryName.THREE));
        choices.add(new Choice(StoryName.TWO_B, Option.A, "Continue",StoryName.THREE));

        return choices;
    }

    public static Map<StoryName, String> loadStories(){
        Map<StoryName, String> stories = new HashMap<>();

        /*
         * I removed the Story object because it currently only contains 2 fields which are effectively a
         * key-value pair (which is what a map is for :) ). If your stories end up needing more fields, I would
         * still use a map, but instead of a String value, put your Story object as the value.
         *
         */

        stories.put(StoryName.ONE, "The many rolling fields within Argonia are ideal for\n" +
                "raising sheep, which is what my family has done for generations. In my grandfather's\n" +
                "day, our village was known all round for having some of the best sheep in the land.\n" +
                "It's not anymore. For years we've barely had enough sheep to help keep our family fe\n " +
                "and clothed. It's been tough ever since the Ostians invaded our land and pillaged our towns\n" +
                "and villages. After years of teetering on the edge of warfare, our countries finally clashed.\n" +
                "We lost, obviously. Ostia is a much rougher country than ours, and it didn't take long for our\n" +
                "peace seeking king to surrender his country. Though naive, I have to respect him for doing\n" +
                "what he thought would save the most lives. And maybe it did save the most lives, but at the\n" +
                "steep price of our freedom and well being. My village has struggled, but it hasn't been as\n" +
                "bad as some of the villages that aren't as far out in the hills as we are. I've heard rumors that\n" +
                "the Dark Hordes have taken to ravaging the countryside again, though, so it's only a matter\n" +
                "of time until something very bad happens.\n" +
                "The thought of them coming to my village and having to defend it makes me...\n");

        stories.put(StoryName.TWO_A, "...frightened. The Dark Horde is notorious for their savagery,\n" +
                " and the king lets them loose to keep the populous of our country in fear of him. Their warriors\n" +
                "are cold blooded killers, and their mages are even worse. Just thinking of coming into contact\n" +
                "with them makes me stir from the place I have been sitting on the hill. I look up and after a\n" +
                "quick count I realize that Pud has gone missing. That fluffer, always going over one hill or\n" +
                "another. I just hope he hasn't gotten lost in the woods again. I might have to chase off another\n" +
                "bear.");

        stories.put(StoryName.TWO_B, "...faintly excited at the notion of getting to fight. Though\n" +
                " the Dark Horde is notorious for their savagery, I would almost welcome a chance to fight some\n" +
                "of them. The king lets them loose to keep the populous of our country in fear of him.  Their\n" +
                "warriors are cold blooded killers, and their mages are even worse. This makes me concerned for\n" +
                "my family and friends, but inside myself I can feel a craving for the adventure they would\n" +
                "bring. While tending the flock I have fought bears, cougars, and even run into some roving hob\n" +
                "goblins. My job has been to keep the flock safe, and I am very capable. And it also would give\n" +
                "me a chance to practice the sword skills my father has been teaching me since he came back from\n" +
                "the war that we lost. After a quick count realize that Pud has gone missing. That fluffer,\n" +
                "always going over one hill or another. I just hope he hasn't gotten lost in the woods again.");

        return stories;
    }
}
