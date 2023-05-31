import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*-------------------INPUT THE GUESSING WORD------------------*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word to guess");
        String word = input.nextLine().toLowerCase();		//word = miro

        /*-----------GUESSING THE LETTER----------------------*/

        System.out.println("Ok lets start.\nGuess the letter ");
        for (int i = 0; i<word.length();i++) {		//za kazde pismeno co je vo "word" tak vypise _
            System.out.print("_ ");
        }
        System.out.println("\n");
        /*neviem*/
        /*-----------ONLY ONE LETTER INPUT--------------------*/

        String guessedLetter = input.nextLine();
        int characterCount = guessedLetter.length();
        boolean allLetters = guessedLetter.chars().allMatch(Character::isLetter);

        if (!allLetters) {
            System.out.println("Write only letters not numbers");
        }

        if (characterCount == 1) {
            System.out.println("right");
        } else {
            System.out.println("Only one letter you fucking dumbass");
        }

        /*-----------GUESSING THE LETTERS ONE BY ONE-----------------*/

        char[] letter = word.toCharArray();

        for (int i = 0; i < word.length();i++) {
            char c = word.charAt(i);
        }
		/*if (word.contains("")) {
													//ak input word obsahuje hociake pismeno z toho co hadany napise tak sa to nahradi za _
		}*/

        /*-------------------HANGMAN GRAPHICS--------------*/

        while (!word.equals(guessedLetter)) {             //todo chyba tu je ze ak sa nerovna slovo tak vykresli a ja chcem iba pismeno
            System.out.println("Try again!");
            System.out.println(" -------");
            System.out.println("  |    |");
            System.out.println("  O    |");
            System.out.println(" /|\\   |");
            System.out.println(" / \\   |");
            System.out.println(" ______|");
            System.out.println("|______|");
            System.out.println("hahahah");
            System.out.println("hahahah");

            guessedLetter = input.nextLine();
        }
        System.out.println("You guessed the right word.\nCongrats!");
        input.close();

    }
}
//todo ak zadam spravne pismeno tak to nezobere