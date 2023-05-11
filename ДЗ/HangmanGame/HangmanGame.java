package HangmanGame;
import java.util.Scanner;


public class HangmanGame {
    private static final String[] WORDS = {"собака", "солнце", "инцидент", "апельсин", "дружба"};
    private static final int MAX_TRIES = 7;
    private static final String[] HANGMAN_IMAGES = {
        "  +---+\n  |   |\n      |\n      |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n      |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n  |   |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|   |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n      |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n /    |\n      |\n=========",
        "  +---+\n  |   |\n  O   |\n /|\\  |\n / \\  |\n      |\n========="
    };

    private String secretWord;
    private StringBuilder guessedWord;
    private int triesLeft;

    public HangmanGame() {
        secretWord = getRandomWord();
        guessedWord = new StringBuilder("-".repeat(secretWord.length()));
        triesLeft = MAX_TRIES;
    }

    private String getRandomWord() {
        int index = (int) (Math.random() * WORDS.length);
        return WORDS[index];
    }

    public void play() {
        System.out.println("Добро пожаловать в игру Виселица!");
        System.out.println("Угадайте загаданное слово.");
        System.out.println("Количество попыток: " + MAX_TRIES);

        Scanner scanner = new Scanner(System.in);

        while (triesLeft > 0) {
            System.out.println(HANGMAN_IMAGES[MAX_TRIES - triesLeft]);
            System.out.println("Слово: " + guessedWord.toString());
            System.out.println("Введите букву: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.length() != 1) {
                System.out.println("Пожалуйста, введите только одну букву.");
                continue;
            }

            char letter = input.charAt(0);

            if (!Character.isLetter(letter)) {
                System.out.println("Пожалуйста, введите букву.");
                continue;
            }

            if (guessedWord.indexOf(String.valueOf(letter)) != -1) {
                System.out.println("Вы уже угадали эту букву. Попробуйте еще раз.");
                continue;
            }

            boolean found = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == letter) {
                    guessedWord.setCharAt(i, letter);
                    found = true;
                }
            }

            if (!found) {
                triesLeft--;
                System.out.println("Буква '" + letter + "' отсутствует в загаданном слове. Осталось попыток: " + triesLeft);
            } else {
                System.out.println("Буква '" + letter + "' угадана!");
            }

            if (guessedWord.toString().equals(secretWord)) {
                System.out.println("Поздравляем! Вы угадали слово '" + secretWord + "'. Вы победили!");
                // Воспроизведение танца человечка
                try {
                    DancingMan.dance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return;
            }
        }

        System.out.println("К сожалению, вы проиграли. Загаданное слово было: '" + secretWord + "'.");
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.play();
    }
}