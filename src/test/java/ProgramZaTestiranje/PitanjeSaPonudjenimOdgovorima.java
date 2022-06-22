package ProgramZaTestiranje;

public class PitanjeSaPonudjenimOdgovorima extends Pitanje{
     String odgovorA;
     String odgovorB;
     String odgovorC;
     String odgovorD;
     String tacanOdgovor;

    public PitanjeSaPonudjenimOdgovorima(String tekstPitanja, int brojMaxPoena, String odgovorA, String odgovorB, String odgovorC, String odgovorD, String tacanOdgovor) {
        super(tekstPitanja, brojMaxPoena);
        this.odgovorA = odgovorA;
        this.odgovorB = odgovorB;
        this.odgovorC = odgovorC;
        this.odgovorD = odgovorD;
        this.tacanOdgovor = tacanOdgovor;
        this.odgovorStudenta = "";
    }

    public String getOdgovorA() {
        return odgovorA;
    }

    public void setOdgovorA(String odgovorA) {
        this.odgovorA = odgovorA;
    }

    public String getOdgovorB() {
        return odgovorB;
    }

    public void setOdgovorB(String odgovorB) {
        this.odgovorB = odgovorB;
    }

    public String getOdgovorC() {
        return odgovorC;
    }

    public void setOdgovorC(String odgovorC) {
        this.odgovorC = odgovorC;
    }

    public String getOdgovorD() {
        return odgovorD;
    }

    public void setOdgovorD(String odgovorD) {
        this.odgovorD = odgovorD;
    }

    public String getTacanOdgovor() {
        return tacanOdgovor;
    }

    public void setTacanOdgovor(String tacanOdgovor) {
        this.tacanOdgovor = tacanOdgovor;
    }

    public int ocenjivanje(boolean pitanjePregledano){
        this.pitanjePregledano = pitanjePregledano;
        if (this.pitanjePregledano && this.tacanOdgovor.equals(this.odgovorStudenta)){
            this.osvojenBrojPoena = this.brojMaxPoena;
        }
        return osvojenBrojPoena;
    }

    @Override
    public String toString() {
        return "Pitanje sa ponudjenim odgovorima: " + tekstPitanja + "\n" +
                "A. " + odgovorA + '\n' +
                "B. " + odgovorB + '\n' +
                "C. " + odgovorC + '\n' +
                "D. " + odgovorD + '\n' +
                "Odgovor studenta: " + odgovorStudenta;
    }
}



