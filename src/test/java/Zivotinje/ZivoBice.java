package Zivotinje;

public abstract class ZivoBice {
    private String vrsta;
    private boolean ugrozeno;
    private boolean otrovno;

    public ZivoBice(String vrsta, boolean ugrozeno, boolean otrovno) {
        this.vrsta = vrsta;
        this.ugrozeno = ugrozeno;
        this.otrovno = otrovno;
    }

    public String getVrsta() {
        return vrsta;
    }

    public boolean isUgrozeno() {
        return ugrozeno;
    }

    public boolean isOtrovno() {
        return otrovno;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public void setUgrozeno(boolean ugrozeno) {
        this.ugrozeno = ugrozeno;
    }

    public void setOtrovno(boolean otrovno) {
        this.otrovno = otrovno;
    }
}
