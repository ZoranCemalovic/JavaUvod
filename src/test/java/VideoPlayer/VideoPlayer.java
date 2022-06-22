package VideoPlayer;

public class VideoPlayer {
    //Kreirati paket VideoPlayer
    //Kreirati klasu VideoPlayer koja ima
    //private atribute duzina videa, jacina zvuka, trenutno vreme videa i kvalitet videa
    //kreirati pun konstruktor, getere, setere i metodu koja ce da stampa u formatu
    //Trenutno vreme videa:
    //Trenutna jacina zvuka:
    //Trenutni kvalitet videa:
    private double duzinaVidea;
    private int jacinaZvuka;
    private double trenutnoVremeVidea;
    private int kvalitetVidea;

    public VideoPlayer(double duzinaVidea, int jacinaZvuka, double trenutnoVremeVidea, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.kvalitetVidea = kvalitetVidea;
    }

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public double getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    /*public void stampanje() {
        System.out.println("Trenutno vreme videa: "+getTrenutnoVremeVidea());
        System.out.println("Trenutna jacina zvuka: "+getJacinaZvuka());
        System.out.println("Trenutni kvalitet videa: "+getKvalitetVidea());
        System.out.println("------------------");

    }*/

    @Override
    public String toString() {
        return "VideoPlayer{" +
                "jacinaZvuka=" + jacinaZvuka +
                "trenutnoVremeVidea=" + trenutnoVremeVidea +
                "kvalitetVidea=" + kvalitetVidea +
                '}';
    }
}
