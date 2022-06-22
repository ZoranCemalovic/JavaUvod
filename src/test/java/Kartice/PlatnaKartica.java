package Kartice;

public class PlatnaKartica {
    // U PlatnaKartica klasi imamo atribute mesec, godina, broj kartice i suma.
    private int mesec;
    private int godina;
    private String brojKartice;
    private double suma;

    public PlatnaKartica(int mesec, int godina, String brojKartice, double suma) {
        this.mesec = mesec;
        this.godina = godina;
        this.brojKartice = brojKartice;
        this.suma = suma;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public double getSuma() {
        return suma;
    }
    public void dodajSredstva(double uplata) {
        this.suma=suma+uplata;
    }
    public void izvrsiTransakciju(double trosak) {
        this.suma=suma-trosak;
    }
    public void stampanje() {
        System.out.println(this.brojKartice+", "+this.mesec+"/"+this.godina+", $"+this.suma);
    }
}
