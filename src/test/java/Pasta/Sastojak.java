package Pasta;

public class Sastojak {
    private String naziv;
    private double cena;

    public Sastojak(String naziv, double cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    public void stampanje() {
        System.out.println(getNaziv()+" - "+getCena()+" din");

    }
}
