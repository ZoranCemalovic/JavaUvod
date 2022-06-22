package Reakcije;

public class Reakcija {
    private String tipReakcije;
    private String imePrezime;

    public Reakcija(String tipReakcije, String imePrezime) {
        this.tipReakcije = tipReakcije;
        this.imePrezime = imePrezime;
    }

    public String getTipReakcije() {
        return tipReakcije;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setTipReakcije(String tipReakcije) {
        this.tipReakcije = tipReakcije;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}
