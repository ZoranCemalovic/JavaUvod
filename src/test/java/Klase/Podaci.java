package Klase;

public class Podaci {
    //Zadatak 4 - Kreirati paket "Klase" i unutar tog paketa kreirati klasu "Ekosistem" i "Podaci".
    // U klasi Podaci deklarisati ime, prezime, fakultet i prosecnu ocenu sa fakulteta.
    // U klasi Ekosistem kreirati 3 objekta i odstampati podatke koje prosledjujete preko konstruktora
    // u klasu Podaci. Klasa Podaci sadrzi i metodu za stampanje.
    String ime;
    String prezime;
    String fakultet;
    Double prosecnaOcena;

    public Podaci(String ime, String prezime, String fakultet, Double prosecnaOcena) {
        this.ime = ime;
        this.prezime = prezime;
        this.fakultet = fakultet;
        this.prosecnaOcena = prosecnaOcena;


    }
    public void stampanje() {
        System.out.println("Student "+this.ime+" "+this.prezime+" pohadja "+this.fakultet+" i ima prosecnu ocenu "+this.prosecnaOcena);
    }
}
