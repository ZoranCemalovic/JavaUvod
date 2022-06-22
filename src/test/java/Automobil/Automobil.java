package Automobil;

public class Automobil {
    //Zadatak 1 - Napraviti paket "Automobil" i kreirati tri klase - "GlavnaKlasa1", "GlavnaKlasa2" i "Automobil".
    // U klasu Automobil deklarisati marku, model, gorivo, broj vrata i godiste. Kreirati prazan i pun konstruktor.
    // U GlavnaKlasa1 kreirati objekat preko praznog konstruktora, u GlavnaKlasa2 kreirati objekat preko punog konstruktora.
    // Kreirati tri objekta u obe glavne klase i svaki odstampati. Stampanje se radi u posebnoj metodi u klasi Automobil.
    public String marka;
    public String model;
    public String gorivo;
    public int brojVrata;
    public int godiste;

    public Automobil() {

    }
    public Automobil(String marka, String model, String gorivo, int brojVrata, int godiste) {
        this.marka = marka;
        this.model = model;
        this.gorivo = gorivo;
        this.brojVrata = brojVrata;
        this.godiste = godiste;
    }


    public void stampanje() {
        System.out.println("Marka automobila je "+this.marka+", model je "+this.model+", koji koristi gorivo "+this.gorivo+". Auto ima "+this.brojVrata+" vrata i napravljen je "+this.godiste+". godine.");
    }

}
