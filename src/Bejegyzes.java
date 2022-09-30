import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bejegyzes {
    private String szerzo;
    private String tartalom;
    private int likeok = 0;
    private LocalDateTime letrejott = LocalDateTime.now();
    private LocalDateTime szerkesztve;
    public Bejegyzes(String szerzo, String tartalom) {
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
    public void like(int i) {
        for (int j = 0; j < i; j++) {
            this.likeok++;
        }
    }
    public void szerkesztett(String ujTartalom) {
        if (this.tartalom != ujTartalom) {
            this.szerkesztve = LocalDateTime.now();
            this.tartalom = ujTartalom;
            boolean szerkesztett = true;
        }
    }
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String bejegyzesAdat = String.format("%s - %d - %s",
                this.szerzo, this.likeok, this.letrejott.format(formatter));

        bejegyzesAdat += String.format("\n%s",this.tartalom);

        return bejegyzesAdat;
    }
}
