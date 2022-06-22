package ProgramZaTestiranje;

public class KlasicnoPitanje extends Pitanje{
     String odgovorNaPitanje;

    public KlasicnoPitanje(String tekstPitanja, int brojMaxPoena, String odgovorNaPitanje) {
        super(tekstPitanja, brojMaxPoena);
        this.odgovorNaPitanje = odgovorNaPitanje;
        this.odgovorStudenta = "";
    }

    public String getOdgovorNaPitanje() {
        return odgovorNaPitanje;
    }

    public void setOdgovorNaPitanje(String odgovorNaPitanje) {
        this.odgovorNaPitanje = odgovorNaPitanje;
    }

    @Override
    public String toString() {
        return "Klasicno Pitanje: " + this.tekstPitanja + "? " + "\n" +
                "Odgovor Studenta: " + odgovorStudenta;
    }

    public int ocenjivanje(boolean pitanjePregledano){
        this.pitanjePregledano = pitanjePregledano;
        if (this.pitanjePregledano && this.odgovorNaPitanje.equals(this.odgovorStudenta)){
            this.osvojenBrojPoena = this.brojMaxPoena;
        }
        return osvojenBrojPoena;
    }
}
