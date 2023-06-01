import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*-------------------INPUT THE GUESSING WORD------------------*/

        int attempts = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to guess");
        String secretWord = input.nextLine().toLowerCase();

        StringBuilder guessedWordBuilder = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            char currentChar = secretWord.charAt(i);
            if (currentChar == ' ') {
                guessedWordBuilder.append(' ');
            } else {
                guessedWordBuilder.append('_');
            }
        }
        String guessedWord = guessedWordBuilder.toString();


        /*-----------GUESSING THE LETTER----------------------*/

        System.out.println("Ok lets start. ");
        while (attempts > 0) {
            System.out.println("Actual word: " + guessedWord);
            System.out.println("Guess the letter. ");
            String guessedLetter = input.nextLine();
            int characterCount = guessedLetter.length();
            boolean allLetters = guessedLetter.chars().allMatch(Character::isLetter);

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
            char guess = guessedLetter.charAt(0);

            /*-----------GUESSING THE LETTERS ONE BY ONE-----------------*/

            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    guessedWord = guessedWord.substring(0, i) + guess + guessedWord.substring(i + 1);
                }
            }

            if (secretWord.contains(guessedLetter)) {
                System.out.println("You guessed the right letter.\nCongrats!");
            } else {
                attempts--;
            }

            /*-------------------HANGMAN GRAPHICS--------------*/

            if (attempts == 9) {
                System.out.println("Noob");
                System.out.println("Try again!");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ______");
                System.out.println("|______|");
                System.out.println("You have " + attempts + " attempts");
            } else if (attempts == 8) {
                System.out.println("Try again!");
                System.out.println(" ");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println(" ______|");
                System.out.println("|______|");
            } else if (attempts == 7) {
                System.out.println("Try again!");
                System.out.println(" -------");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println(" ______|");
                System.out.println("|______|");
            } else if (attempts == 6) {
                System.out.println("Try again!");
                System.out.println(" -------");
                System.out.println("  |    |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println(" ______|");
                System.out.println("|______|");
            } else if (attempts == 5) {
                System.out.println("Try again!");
                System.out.println(" -------");
                System.out.println("  |    |");
                System.out.println("  o    |");
                System.out.println("       |");
                System.out.println("       |");
                System.out.println(" ______|");
                System.out.println("|______|");
            } else if (attempts == 4) {
                System.out.println("Try again!");
                System.out.println(" -------");
                System.out.println("  |    |");
                System.out.println("  o    |");
                System.out.println("  |    |");
                System.out.println("       |");
                System.out.println(" ______|");
                System.out.println("|______|");
            } else if (attempts == 3) {
                System.out.println("Try again!");
                System.out.println(" -------");
                System.out.println("  |    |");
                System.out.println("  o    |");
                System.out.println("  |    |");
                System.out.println(" /     |");
                System.out.println(" ______|");
                System.out.println("|______|");
            } else if (attempts == 2) {
                System.out.println("Try again!");
                System.out.println(" -------");
                System.out.println("  |    |");
                System.out.println("  o    |");
                System.out.println("  |    |");
                System.out.println(" / \\   |");
                System.out.println(" ______|");
                System.out.println("|______|");
            } else if (attempts == 1) {
                System.out.println("Try again!");
                System.out.println(" -------");
                System.out.println("  |    |");
                System.out.println("  o    |");
                System.out.println(" /|    |");
                System.out.println(" / \\   |");
                System.out.println(" ______|");
                System.out.println("|______|");
            }

            if (guessedWord.equals(secretWord)) {
                System.out.println("You won you lucker.");
                System.out.println("The word was " + guessedWord);
                break;
            }
        }
        if (attempts == 0) {
            System.out.println("You lost haha the word was so easy take a look it is " + secretWord);
            System.out.println(" -------");
            System.out.println("  |    |");
            System.out.println("  o    |");
            System.out.println(" /|\\   |");
            System.out.println(" / \\   |");
            System.out.println(" ______|");
            System.out.println("|______|");
            input.close();
        }
    }
}