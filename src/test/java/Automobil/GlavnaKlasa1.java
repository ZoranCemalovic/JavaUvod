package Automobil;

public class GlavnaKlasa1 {
    //Zadatak 1 - Napraviti paket "Automobil" i kreirati tri klase - "GlavnaKlasa1", "GlavnaKlasa2" i "Automobil".
    // U klasu Automobil deklarisati marku, model, gorivo, broj vrata i godiste. Kreirati prazan i pun konstruktor.
    // U GlavnaKlasa1 kreirati objekat preko praznog konstruktora, u GlavnaKlasa2 kreirati objekat preko punog konstruktora.
    // Kreirati tri objekta u obe glavne klase i svaki odstampati. Stampanje se radi u posebnoj metodi u klasi Automobil.
    public static void main(String[] args) {
        Automobil a1=new Automobil();
        a1.marka="Volvo";
        a1.model="XC60";
        a1.gorivo="dizel";
        a1.brojVrata=5;
        a1.godiste=2019;
        a1.stampanje();

        Automobil a2=new Automobil();
        a2.marka="Citroen";
        a2.model="C5";
        a2.gorivo="dizel";
        a2.brojVrata=5;
        a2.godiste=2017;
        a2.stampanje();

        Automobil a3=new Automobil();
        a3.marka="Opel";
        a3.model="Astra";
        a3.gorivo="dizel";
        a3.brojVrata=5;
        a3.godiste=2016;
        a3.stampanje();
    }

}
