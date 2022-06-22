package Kartice;

public class GlavnaKlasa {
    public static void main(String[] args) {
        PlatnaKartica p1=new PlatnaKartica(11, 2024, "1234-5678-1234-5678", 212);
        p1.stampanje();
        VisaKartica v1=new VisaKartica(06, 2026, "3455-1234-5678-2345", 124, "Petar", "Petrovic");
        v1.stampanje();
        v1.izvrsiTransakciju(50);
        v1.stampanje();
        PlatnaKartica m1=new MasterKartica(12, 2025, "4565-5686-6573-9867", 456);
        m1.izvrsiTransakciju(56);
        m1.stampanje();
    }
}
