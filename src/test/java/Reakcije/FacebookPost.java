package Reakcije;

import java.util.ArrayList;

public class FacebookPost {
    private String imePrezime;
    private String tekstObjave;
    private ArrayList<Reakcija> reakcije;

    public FacebookPost(String imePrezime, String tekstObjave) {
        this.imePrezime = imePrezime;
        this.tekstObjave = tekstObjave;
        this.reakcije = new ArrayList<Reakcija>();
    }

    public void dodajReakciju(Reakcija r) {
        reakcije.add(r);
    }
    private int prebrojavanje(String tipReakcije) {
        int brojac=0;
        for (int i=0; i<reakcije.size(); i++) {
            if (reakcije.get(i).getTipReakcije().equals(tipReakcije)) {
                brojac ++;
            }
        } return brojac;
    }
    public void stampanje() {
        System.out.println(this.imePrezime);
        System.out.println(this.tekstObjave);
        System.out.println("Smiley: "+prebrojavanje("smiley"));
        System.out.println("Like: "+prebrojavanje("like"));
        System.out.println("Heart: "+prebrojavanje("heart"));
    }

}
