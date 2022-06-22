package VideoPlayer;

public class TimeControl extends Control{
    //Kreirati klasu TimeControl koja nasledjuje klasu Control i koja ima samo jedan private boolean atribut "unapred".
    // Kreirati konstruktor, geter i seter za atribut
    //Unutar klase kreirati metodu izvrsiAkciju koja pomera vreme videa unapred za 15 sekundi ako je boolean true
    // i unazad za 15 sekundi ako je false. Ako je trenutno vreme krace od 15 sekundi i vreme se vrati unazad
    // onda vreme treba podesiti na nulu. Isto tako ako je ostalo manje od 15 sekundi do kraja videa i vreme se
    // pomeri unapred onda vreme treba podesiti na maksimalni duzinu videa
    private boolean unapred;

    public TimeControl(boolean unapred) {
        this.unapred = unapred;
    }

    public boolean isUnapred() {
        return unapred;
    }

    public void setUnapred(boolean unapred) {
        this.unapred = unapred;
    }
    public void izvrsiAkciju(VideoPlayer v) {
        if (!unapred && v.getTrenutnoVremeVidea()<=15) {
            v.setTrenutnoVremeVidea(0);
        } else if (!unapred && v.getTrenutnoVremeVidea()>15) {
            v.setTrenutnoVremeVidea(v.getTrenutnoVremeVidea()-15);
        } else if (unapred && (v.getDuzinaVidea()-v.getTrenutnoVremeVidea())<15) {
            v.setTrenutnoVremeVidea(v.getDuzinaVidea());
        } else if (unapred && (v.getDuzinaVidea()-v.getTrenutnoVremeVidea())>=15) {
            v.setTrenutnoVremeVidea(v.getTrenutnoVremeVidea() + 15);
        }
    }
}
