import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Main main = new Main();
        String secretWord;
        String guessedWord;
        String guessedLetter;
        int characterCount;
        boolean allLetters;
        char guess;
        /*-------------------INPUT THE GUESSING WORD------------------*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to guess");
        secretWord = input.nextLine().toLowerCase();

        StringBuilder guessedWordBuilder = new StringBuilder();     //todo zistit ci to dat ako atribut alebo nie
        for (int i = 0; i < secretWord.length(); i++) {
            char currentChar = secretWord.charAt(i);
            if (currentChar == ' ') {
                guessedWordBuilder.append(' ');
            } else {
                guessedWordBuilder.append('_');
            }
        }
         guessedWord = guessedWordBuilder.toString();

        /*-----------GUESSING THE LETTER----------------------*/

        System.out.println("Ok lets start. ");
        while (Graphics.attempts > 0) {
            System.out.println("Actual word: " + guessedWord);
            System.out.println("Guess the letter. ");
            guessedLetter = input.nextLine();
            characterCount = guessedLetter.length();
            allLetters = guessedLetter.chars().allMatch(Character::isLetter);

            /*-----------ONLY ONE LETTER INPUT--------------------*/

            if (characterCount != 1) {
                System.out.println("Enter only one letter.");
                continue;
            }

            /*-----------ONLY LETTERS INPUT--------------------*/

            if (!allLetters) {
                System.out.println("Write only letters not numbers");
                continue;
            }
            guess = guessedLetter.charAt(0);

            /*-----------GUESSING THE LETTERS ONE BY ONE-----------------*/
            GuessingOneByOne guessingOneByOne = new GuessingOneByOne();
            guessingOneByOne.guessingOneByOne(guessedWord,secretWord,guess);

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedWord = guessedWord.substring(0, i) + guess + guessedWord.substring(i + 1);
                }
            }

            if (secretWord.contains(guessedLetter)) {
                System.out.println("You guessed the right letter.\nCongrats!");
            } else {
                Graphics.attempts--;
            }

            Graphics graphics = new Graphics();
            graphics.drawHangman();

            if (guessedWord.equals(secretWord)) {
                System.out.println("You won congrats.");
                System.out.println("The word was " + guessedWord+ ".");
                break;
            }
        }
        System.out.println("You lost the word was " + secretWord);
            input.close();
        }
    }