package Kartice;

public class VisaKartica extends PlatnaKartica{
    public String ime;
    public String prezime;

    public VisaKartica(int mesec, int godina, String brojKartice, double suma, String ime, String prezime) {
        super(mesec, godina, brojKartice, suma);
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public void izvrsiTransakciju(double trosak) {
        double provizija = trosak * 0.018;
        if (provizija<4) {
            super.izvrsiTransakciju(trosak+4);
        } else {
            super.izvrsiTransakciju(trosak+provizija);
        }
    }
    public void stampanje() {
        System.out.print("Visa ");
        super.stampanje();
        System.out.println("Vlasnik je "+this.ime+" "+this.prezime);
    }
}
