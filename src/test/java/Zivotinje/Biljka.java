package Zivotinje;

public class Biljka extends ZivoBice{
    String narodniNaziv;
    boolean lekovita;

    public Biljka(String vrsta, boolean ugrozeno, boolean otrovno, String narodniNaziv, boolean lekovita) {
        super(vrsta, ugrozeno, otrovno);
        this.narodniNaziv = narodniNaziv;
        this.lekovita = lekovita;
    }

    public String getNarodniNaziv() {
        return narodniNaziv;
    }

    public boolean isLekovita() {
        return lekovita;
    }

    public void setNarodniNaziv(String narodniNaziv) {
        this.narodniNaziv = narodniNaziv;
    }

    public void setLekovita(boolean lekovita) {
        this.lekovita = lekovita;
    }
}
