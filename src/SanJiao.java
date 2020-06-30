import java.io.PrintStream;

public class SanJiao {

    public static void main(String[] args) {
        sanjiao();
    }

    private static void sanjiao() {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}