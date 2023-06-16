public class GuessingOneByOne {
    public void guessingOneByOne(String guessedWord,String secretWord,char guess) {
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                guessedWord = guessedWord.substring(0, i) + guess + guessedWord.substring(i + 1);
            }
        }
    }
}
