import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int rastgeleSayi = random.nextInt(10) + 1; // 1 ile 10 arası sayı
        int toplamHak = 3;
        boolean kazandiMi = false;

        System.out.println("=== Welcome to the number guessing game of 777! ===");
        System.out.println("i picked a number beetween 1-10 you have 3 guesses.");

        for (int i = 1; i <= toplamHak; i++) {
            System.out.print(i + ". guess amount - your guess: ");
            int tahmin = scanner.nextInt();

            if (tahmin == rastgeleSayi) {
                System.out.println("Congrats! the number was: " + rastgeleSayi);
                kazandiMi = true;
                break;
            } else {
                System.out.println(": " + (toplamHak - i));
            }
        }

        if (!kazandiMi) {
            System.out.println("Sorry the number was: " + rastgeleSayi);
        }
    }
}
