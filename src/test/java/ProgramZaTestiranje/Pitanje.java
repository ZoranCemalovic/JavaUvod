package ProgramZaTestiranje;

public abstract class Pitanje {
     String tekstPitanja;
     int brojMaxPoena;
     int osvojenBrojPoena;
     boolean pitanjePregledano;

     String odgovorStudenta;

    public String getOdgovorStudenta() {
        return odgovorStudenta;
    }

    public void setOdgovorStudenta(String odgovorStudenta) {
        this.odgovorStudenta = odgovorStudenta;
    }

    public Pitanje(String tekstPitanja, int brojMaxPoena ) {
        this.tekstPitanja = tekstPitanja;
        if(brojMaxPoena>0){
            this.brojMaxPoena = brojMaxPoena;
        } else {
            this.brojMaxPoena = 1;
        }
        this.osvojenBrojPoena = 0;
        this.pitanjePregledano = false;
    }

    public String getTekstPitanja() {
        return tekstPitanja;
    }

    public void setTekstPitanja(String tekstPitanja) {
        this.tekstPitanja = tekstPitanja;
    }

    public int getBrojMaxPoena() {
        return brojMaxPoena;
    }

    public void setBrojMaxPoena(int brojMaxPoena) {
        if(brojMaxPoena>0){
            this.brojMaxPoena = brojMaxPoena;
        } else {
            this.brojMaxPoena = 1;
        }
    }

    public int getOsvojenBrojPoena() {
        return osvojenBrojPoena;
    }

    public void setOsvojenBrojPoena(int osvojenBrojPoena) {
        if (osvojenBrojPoena>=0){
            this.osvojenBrojPoena = osvojenBrojPoena;
        }else {
            this.osvojenBrojPoena =0;
        }
    }

    public boolean isPitanjePregledano() {
        return pitanjePregledano;
    }

    public void setPitanjePregledano(boolean pitanjePregledano) {
        this.pitanjePregledano = pitanjePregledano;
    }
    public int ocenjivanje(boolean pitanjePregledano){
        this.pitanjePregledano = pitanjePregledano;
        if (this.pitanjePregledano){
            osvojenBrojPoena = brojMaxPoena;
        }
        return osvojenBrojPoena;
    }

    @Override
    public String toString() {
        return "Pitanje{" +
                "tekstPitanja='" + tekstPitanja + '\'' +
                ", brojMaxPoena=" + brojMaxPoena +
                ", osvojenBrojPoena=" + osvojenBrojPoena +
                ", pitanjePregledano=" + pitanjePregledano +
                '}';
    }
}
