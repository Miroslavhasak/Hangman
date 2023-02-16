import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to guess");
        String word = input.nextLine().toLowerCase();

        System.out.println("Ok lets start.\nGuess the letter ");

        char[] guessedChars = new char[word.length()];
        Arrays.fill(guessedChars, '_');
        System.out.println(new String(guessedChars));

        while (new String(guessedChars).contains("_")) {
            String guessedWord = input.nextLine().toLowerCase();
            if (guessedWord.length() > 1) {
                System.out.println("Only one letter you dumbass");
                continue;
            } else if (!Character.isLetter(guessedWord.charAt(0))) {
                System.out.println("Write only letters not numbers");
                continue;
            }
            char guessedLetter = guessedWord.charAt(0);
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guessedLetter) {
                    guessedChars[i] = guessedLetter;
                    correctGuess = true;
                }
            }
            if (correctGuess) {
                System.out.println(new String(guessedChars));
            } else {
                System.out.println("Nope, try again");
            }
        }
        System.out.println("You guessed the right word.\nCongrats!");
        input.close();
    }
}
