package VideoPlayer;

public class QualityOptimiserControl extends Control{
    //Kreirati klasu QualityOptimiserControl koja nasledjuje klasu Control i koja ima samo jedan private integer
    // atribut "internet". Kreirati konstruktor, geter i seter za atribut.
    //Unutar klase kreirati metodu izvrsiAkciju koja podesava kvalitet videa.
    //Kolicinu interneta unositi u MBps, a kvalitet video poredi sa Mbps. Kvalitet videa se podesava na prvu
    // narednu granicu koju moze da podrzi.
    //(Mbps = MBps * 8.4)
    //(Ako unesete internet 20 MBps onda ce se kvalitet videa podesiti na 240)
    //Granice kvaliteta zvuka su 144, 240, 360, 480, 720 i 1080
    private int internet;

    public QualityOptimiserControl(int internet) {
        this.internet = internet;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }
    public void izvrsiAkciju(VideoPlayer v) {
        double konekcija=this.internet*8.4;
        if (konekcija<144) {
            v.setKvalitetVidea(144);
        } else if (konekcija<240) {
            v.setKvalitetVidea(240);
        } else if (konekcija<360) {
            v.setKvalitetVidea(360);
        } else if (konekcija<480) {
            v.setKvalitetVidea(480);
        } else if (konekcija<720) {
            v.setKvalitetVidea(720);
        } else {
            v.setKvalitetVidea(1080);
        }
    }
}

