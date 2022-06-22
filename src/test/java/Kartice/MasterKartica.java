package Kartice;

public class MasterKartica extends PlatnaKartica{

    public MasterKartica(int mesec, int godina, String brojKartice, double suma) {
        super(mesec, godina, brojKartice, suma);
    }
    public void izvrsiTransakciju(double trosak) {
        double provizija = trosak * 0.018;
        super.izvrsiTransakciju(trosak+provizija);
    }
    public void odrzavanjeRacuna () {
        super.izvrsiTransakciju(2);
    }
    public void stampanje() {
        System.out.println("Master "+getBrojKartice()+", "+getMesec()+"/"+getGodina()+", $"+getSuma());
    }
}
