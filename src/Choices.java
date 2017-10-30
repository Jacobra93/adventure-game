import java.util.ArrayList;

public class Choices {
        String storyBlock;
        String option;
        String choice;
        String result;

        public Choices (String storyBlock, String option, String choice, String result) {
            this.storyBlock = storyBlock;
            this.option = option;
            this.choice = choice;
            this.result = result;
        }

        public void printChoices () {
            System.out.println(this.option + ": " + this.choice);
            }

}
