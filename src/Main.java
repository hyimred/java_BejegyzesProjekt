import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Bejegyzes> bejegyzesek = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        bejegyzesekHozzaadasa();
        bejegyzesekFelveteleKonzolrol();
        System.out.println(bejegyzesek);
    }
    private static void bejegyzesekHozzaadasa() {
        Bejegyzes teszt1 = new Bejegyzes("JohnDoe", "Ez egy teszt...");
        Bejegyzes teszt2 = new Bejegyzes("JohnDoe", "Ez egy teszt...");
        bejegyzesek.add(teszt1);
        bejegyzesek.add(teszt2);
    }
    private static void bejegyzesekFelveteleKonzolrol() {
        System.out.print("Kérem adja meg, hogy hány bejegyzést szeretne írni: ");
        int db = Integer.parseInt(sc.nextLine());
        if (db < 0) {
            throw new NumberFormatException();
        }
        for (int i = 0; i < db; i++) {
            System.out.printf("%d . BEJEGYZÉS\n", (i + 1));
            System.out.printf("Kérem adja meg a bejegyzés szerzőjét:\n");
            String szerzo = sc.nextLine();
            System.out.printf("Kérem adja meg a bejegyzés tartalmát:\n");
            String tartalom = sc.nextLine();
            Bejegyzes bejegyzes = new Bejegyzes(szerzo, tartalom);
            bejegyzesek.add(bejegyzes);
        }
    }
}