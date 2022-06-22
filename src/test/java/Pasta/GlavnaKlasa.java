package Pasta;

public class GlavnaKlasa {
    //Kreirati klasu Sastojak koja ima naziv, cenu, getere i setere, konstruktore, metodu za stampanje koja stampa
    // u formatu - naziv - cena.din
    //Kreirati klasu Pasta koja ima:
    //listu sastojaka
    //metodu dodavanja sastojaka
    //metodu za brisanje sastojaka. U metodu se salje naziv sastojka koji se brise
    //defaultni konstruktor
    //metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
    //metodu za stampu koja stampa podatke u formatu:
    //Pasta je sa sastojcima:
    //naziv - cena.din
    //naziv - cena.din
    //Cena paste je cena.din
    public static void main(String[] args) {
        Sastojak s1=new Sastojak("sunka", 50);
        Sastojak s2=new Sastojak("masline", 30);
        Sastojak s3=new Sastojak("kackavalj", 40);
        s1.stampanje();
        s2.stampanje();
        s3.stampanje();
        System.out.println("-----------");

        Pasta p1=new Pasta();
        p1.dodajSastojak(s1);
        p1.dodajSastojak(s2);
        p1.dodajSastojak(s2);
        p1.dodajSastojak(s3);
        p1.stampa();


        p1.obrisiSastojak(s2);
        p1.stampa();

        p1.brisiSastojke("sunka");
        p1.stampa();

    }
}
