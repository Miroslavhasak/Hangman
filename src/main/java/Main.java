import java.util.*;

public class Main {
    String secretWord;
    String guessedWord;
    String guessedLetter;
    int characterCount;
    boolean allLetters;
    char guess;
    public static void main(String[] args) {
        Main main = new Main();

        /*-------------------INPUT THE GUESSING WORD------------------*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to guess");
        main.secretWord = input.nextLine().toLowerCase();

        StringBuilder guessedWordBuilder = new StringBuilder();     //todo zistit ci to dat ako atribut alebo nie
        for (int i = 0; i < main.secretWord.length(); i++) {
            char currentChar = main.secretWord.charAt(i);
            if (currentChar == ' ') {
                guessedWordBuilder.append(' ');
            } else {
                guessedWordBuilder.append('_');
            }
        }
         main.guessedWord = guessedWordBuilder.toString();
        /*Input input = new Input();
        input.inputGuessingWord();*/

        /*-----------GUESSING THE LETTER----------------------*/

        System.out.println("Ok lets start. ");
        while (Graphics.attempts > 0) {
            System.out.println("Actual word: " + main.guessedWord);
            System.out.println("Guess the letter. ");
            main.guessedLetter = input.nextLine();
            main.characterCount = main.guessedLetter.length();
            main.allLetters = main.guessedLetter.chars().allMatch(Character::isLetter);

            /*-----------ONLY ONE LETTER INPUT--------------------*/

            if (main.characterCount != 1) {
                System.out.println("Enter only one letter.");
                continue;
            }

            /*-----------ONLY LETTERS INPUT--------------------*/

            if (!main.allLetters) {
                System.out.println("Write only letters not numbers");
                continue;
            }
            main.guess = main.guessedLetter.charAt(0);

            /*-----------GUESSING THE LETTERS ONE BY ONE-----------------*/
            GuessingOneByOne guessingOneByOne = new GuessingOneByOne();
            guessingOneByOne.guessingOneByOne();

            /*for (int i = 0; i < main.secretWord.length(); i++) {
                if (main.secretWord.charAt(i) == main.guess) {
                    main.guessedWord = main.guessedWord.substring(0, i) + main.guess + main.guessedWord.substring(i + 1);
                }
            }*/

            if (main.secretWord.contains(main.guessedLetter)) {
                System.out.println("You guessed the right letter.\nCongrats!");
            } else {
                Graphics.attempts--;
            }

            Graphics graphics = new Graphics();
            graphics.drawHangman();

            if (main.guessedWord.equals(main.secretWord)) {
                System.out.println("You won you lucker.");
                System.out.println("The word was " + main.guessedWord+ ".");
                break;
            }
        }
        System.out.println("You lost haha the word was so easy take a look it is " + main.secretWord);
            input.close();
        }
    }