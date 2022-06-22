package Klase;

public class MainKlasa {
    //Zadatak 4 - Kreirati paket "Klase" i unutar tog paketa kreirati klasu "Ekosistem" i "Podaci".
    // U klasi Podaci deklarisati ime, prezime, fakultet i prosecnu ocenu sa fakulteta.
    // U klasi Ekosistem kreirati 3 objekta i odstampati podatke koje prosledjujete preko konstruktora
    // u klasu Podaci. Klasa Podaci sadrzi i metodu za stampanje.
    public static void main(String[] args) {
        Podaci p1= new Podaci("Marko", "Petrovic", "Pravni fakultet", 7.8);
        p1.stampanje();
        Podaci p2= new Podaci("Jelena", "Bakic", "Ekonomski fakultet", 9.2);
        p2.stampanje();
        Podaci p3= new Podaci("Milos", "Milosevic", "Filozofski fakultet", 6.7);
        p3.stampanje();



    }
}
