public class Main {
    public static void main(String[] args) {
        Bejegyzes teszt = new Bejegyzes("JohnDoe", "Ez egy teszt...\n");
        System.out.println(teszt);
        teszt.like(30);
        System.out.println(teszt);

    }
}