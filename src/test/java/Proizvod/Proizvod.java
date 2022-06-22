package Proizvod;

public class Proizvod {
    //Napraviti klasu Proizvod koja sadrzi:
    //- naziv
    //- cenu
    //- rokTrajanja
    //Napisati metodu koja stampa proizvod, i konstruktor kojem se prosledjuju ova 3 atributa
    //U main metodi napraviti 3 proizvoda i ispisati ih
    public String naziv;
    public double cena;
    public int rokTrajanja;

    public Proizvod(String naziv, double cena, int rokTrajanja) {
        this.naziv = naziv;
        this.cena = cena;
        this.rokTrajanja = rokTrajanja;
    }

    public void stampanje() {
        System.out.println("Naziv proizvoda je "+this.naziv+", cena mu je "+this.cena+" din. i rok trajanja mu istice "+this.rokTrajanja+". godine.");
    }
}
