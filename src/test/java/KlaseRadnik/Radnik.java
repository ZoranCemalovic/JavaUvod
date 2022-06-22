package KlaseRadnik;

public class Radnik {
    //Zadatak 2 - Napraviti paket "KlaseRadnik" i dve klase - "Radnik" i "Ekosistem".
    // U klasi Radnik deklarisati public atribute jmbg (tipa long), ime i prezime (jedan string),
    // broj dece, stepen strucne spreme i radni staz.
//Kreirati pun konstruktor za sve atribute
//Potrebno je izracunati da li je korisnik sposoban za kredit. Ako ima platu vecu od 5000 onda je true, ako ima ispod onda je false
//Platu racunamo tako sto ce se zbir koeficijenta i minulog rada pomnoziti sa 10 000 i na to dodati jos 2500
//Koeficijent se racuna zavisno od stepena strucne spreme
//Stepen strucne spreme moze biti 1,2,3,4 i koeficijent po tom redosledu je 1.03, 2.00, 2.88, 3.40
//Minuli rad se racuna zavisno od radnog staza. Ako je radni staz kraci od 10 godina onda je minuli rad 0.05.
// Ako je izmedju 10 i 20 onda je 0.75 i ako je duzi od 20 onda je 1.0
//Potrebno je izracunati i dane godisnjeg odmora tako sto ce se broj dece pomnoziti sa 2 i na to dodati 22 dana
//Podatke odstampati van MainKlase

    public long jmbg;
    public String imePrezime;
    public int brojDece;
    public int stepenStrucneSpreme;
    public double radniStaz;

    public Radnik(long jmbg, String imePrezime, int brojDece, int stepenStrucneSpreme, double radniStaz) {
        this.jmbg = jmbg;
        this.imePrezime = imePrezime;
        this.brojDece = brojDece;
        this.stepenStrucneSpreme = stepenStrucneSpreme;
        this.radniStaz = radniStaz;
    }
    double koeficijent=0;
    public double koeficijent() {

        switch (this.stepenStrucneSpreme) {
            case 1:
                koeficijent=1.03;
                break;
            case 2:
                koeficijent=2.0;
                break;
            case 3:
                koeficijent=2.88;
                break;
            case 4:
                koeficijent=3.40;
                break;
            default:
                koeficijent=1;
        }
        return koeficijent;
    }

    public double minuliRad() {
        if (this.radniStaz<10) {
            return 0.05;
        } else if(this.radniStaz<=20) {
            return 0.75;
        } else {
            return 1;
        }
    }
    double plata;

    public double plata() {
        plata=(koeficijent()+minuliRad())*10000+2500;
        return plata;
    }


    public boolean kredit() {
        if (plata()>5000) {
            return true;
        } else {
            return false;
        }
    }
    public int odmor() {
        return this.brojDece*2+22;
    }

    public void stampanje() {
        System.out.println("Plata je "+this.plata());
        System.out.println("Kredit odobren? "+this.kredit());
        System.out.println("Godisnji odmor je "+this.odmor()+" dana");
    }
//Potrebno je izracunati da li je korisnik sposoban za kredit. Ako ima platu vecu od 5000 onda je true, ako ima ispod onda je false

}

