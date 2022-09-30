import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztette;

    public Bejegyzes(String szerzo, String tartalom, int likeok, LocalDateTime letrejott, LocalDateTime szerkesztette) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = likeok;
        this.letrejott = letrejott;
        this.szerkesztette = szerkesztette;
    }
}
