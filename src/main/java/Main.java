import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*-------------------INPUT THE GUESSING WORD------------------*/

        int attempts = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to guess");
        String secretWord = input.nextLine().toLowerCase();
        String guessedWord = "_".repeat(secretWord.length());

        /*-----------GUESSING THE LETTER----------------------*/        //todo osetrit aby tam islo davat aj prazdne miesta
        System.out.println("Ok lets start. ");
        while (attempts > 0) {
            System.out.println("Actual word: " + guessedWord);
            System.out.println("Guess the letter ");

            String guessedLetter = input.nextLine();
            int characterCount = guessedLetter.length();
            boolean allLetters = guessedLetter.chars().allMatch(Character::isLetter);

        /*-----------ONLY ONE LETTER INPUT--------------------*/

            if (characterCount != 1) {
                System.out.println("Only one letter you fucking dumbass");
                continue;
            }

            if (!allLetters) {
                System.out.println("Write only letters not numbers");
                continue;
            }
            char guess = guessedLetter.charAt(0);


            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedWord = guessedWord.substring(0, i) + guess + guessedWord.substring(i + 1);
                }
            }

            /*-----------GUESSING THE LETTERS ONE BY ONE-----------------*/

            if (secretWord.contains(guessedLetter)) {

                /*-------------------HANGMAN GRAPHICS--------------*/
                //while (letter.equals(guessedLetter))

        /*while (guessedWord != secretWord.length()) {
            System.out.println("Try again!");
            System.out.println(" -------");
            System.out.println("  |    |");
            System.out.println("  o    |");
            System.out.println(" /|\\   |");
            System.out.println(" / \\   |");
            System.out.println(" ______|");
            System.out.println("|______|");

        }*/
                System.out.println("You guessed the right letter.\nCongrats!");
            }
            else {
                System.out.println("Noob");
                attempts--;
                System.out.println("You have "+attempts+" attempts");
            }

            if (guessedWord.equals(secretWord)) {
                System.out.println("You won you lucky bastard.");
                break;
            }

        }
        if (attempts == 0) {
            System.out.println("You lost haha the word was so easy take a look it is " +secretWord);
            input.close();
        }
    }
}