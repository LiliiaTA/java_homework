package HangmanGame;

public class DancingMan {
    private static final String[] MAN = {
        " o  ",
        "/|\\ ",
        "/ \\ "
    };
     

    private static final int FRAMES_PER_SECOND = 10;
    private static final long FRAME_TIME_MS = 1000L / FRAMES_PER_SECOND;

    public static void dance() throws InterruptedException {
        int frameIndex = 0;

        while (true) {
            // Очищаем экран
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Выводим текущий кадр
            System.out.println(MAN[frameIndex]);

            // Переходим к следующему кадру
            frameIndex = (frameIndex + 1) % MAN.length;

            // Ожидаем время до следующего кадра
            Thread.sleep(FRAME_TIME_MS);
        }
    }
}