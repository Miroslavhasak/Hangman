public class GuessingOneByOne {
    Main main = new Main();
    public void guessingOneByOne() {
        for (int i = 0; i < main.secretWord.length(); i++) {
            if (main.secretWord.charAt(i) == main.guess) {
                main.guessedWord = main.guessedWord.substring(0, i) + main.guess + main.guessedWord.substring(i + 1);
            }
        }
    }
}
