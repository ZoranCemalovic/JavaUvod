package Automobil;

public class GlavnaKlasa2 {
    //Zadatak 1 - Napraviti paket "Automobil" i kreirati tri klase - "GlavnaKlasa1", "GlavnaKlasa2" i "Automobil".
    // U klasu Automobil deklarisati marku, model, gorivo, broj vrata i godiste. Kreirati prazan i pun konstruktor.
    // U GlavnaKlasa1 kreirati objekat preko praznog konstruktora, u GlavnaKlasa2 kreirati objekat preko punog konstruktora.
    // Kreirati tri objekta u obe glavne klase i svaki odstampati. Stampanje se radi u posebnoj metodi u klasi Automobil.
    public static void main(String[] args) {
        Automobil a1=new Automobil("Skoda", "Kodiaq", "benzin", 5,2022);
        a1.stampanje();
        Automobil a2=new Automobil("Renault", "Talisman", "dizel", 4,2021);
        a2.stampanje();
        Automobil a3=new Automobil("Fiat", "500l", "benzin", 5,2020);
        a3.stampanje();
    }
}
