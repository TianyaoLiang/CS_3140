import java.util.*;

public class Prithee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String sonnet = "Two households, both alike in dignity,\n" +
                        "In fair Verona, where we lay our scene,\n" +
                        "From ancient grudge break to new mutiny,\n" +
                        "Where civil blood makes civil hands unclean.\n" +
                        "From forth the fatal loins of these two foes\n" +
                        "A pair of star-cross’d lovers take their life;\n" +
                        "Whose misadventured piteous overthrows\n" +
                        "Do with their death bury their parents’ strife.\n" +
                        "The fearful passage of their death-mark’d love,\n" +
                        "And the continuance of their parents’ rage,\n" +
                        "Which, but their children’s end, nought could remove,\n" +
                        "Is now the two hours’ traffic of our stage;\n" +
                        "The which if you with patient ears attend,\n" +
                        "What here shall miss, our toil shall strive to mend.";

        int correct = 0;
        int incorrect = 0;

        while (correct < 3 && incorrect < 3) {
            String[] splitWords = sonnet.split(" "); // separates the sonnet into different array items every " "
            int stopIndex = rand.nextInt(splitWords.length); // picks random word to stop
            String missingWord = splitWords[stopIndex];

            // print up to stopped word
            for (int i = 0; i < stopIndex; i++) {
                System.out.print(splitWords[i] + " ");
            }

            System.out.println("_____");
            System.out.println();

            System.out.print("Next word: ");
            String guess = input.nextLine();

            if (guess.equalsIgnoreCase(missingWord)) {
                System.out.println("Correct!\n");
                correct++;
            } else {
                System.out.println("Incorrect — the word was \"" + missingWord + "\"\n");
                incorrect++;
            }

            System.out.println("Score: " + correct + " correct, " + incorrect + " incorrect\n");
        }

        System.out.println("Game over!");
        if (correct == 3) {
            System.out.println("You win!");
        }
        else {
            System.out.println("You lose!");
        }

        input.close();
    }
}
