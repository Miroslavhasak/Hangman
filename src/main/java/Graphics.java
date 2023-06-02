public class Graphics {
    public static int attempts = 10;
    public void drawHangman() {

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
    }
}
