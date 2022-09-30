import java.time.LocalDateTime;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom, int likeok, LocalDateTime letrejott, LocalDateTime szerkesztette) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = likeok;
        this.letrejott = letrejott;
        this.szerkesztve = szerkesztve;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public int getlikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getszerkesztve() {
        return szerkesztve;
    }

    public void setTartalom(String tartalom) {
        this.tartalom = tartalom;
    }

    public void like() {

    }
}
