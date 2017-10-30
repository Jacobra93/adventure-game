import java.util.ArrayList;

public class Story {
   String storyName;
   String storyText;

   public Story (String name, String text) {
       this.storyName = name;
       this.storyText = text;
   }

   public void printStory() {
       System.out.println(this.storyText);
       }

}
