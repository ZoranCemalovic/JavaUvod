package VideoPlayer;

public class GlavnaKlasa {
    public static void main(String[] args) {
        VideoPlayer v1=new VideoPlayer(56, 23,20,240);
        TimeControl napred=new TimeControl(true);
        TimeControl nazad=new TimeControl(false);
        AudioControl pojacaj=new AudioControl(true);
        AudioControl utisaj=new AudioControl(false);
        QualityOptimiserControl brzinaInterneta=new QualityOptimiserControl(45);

        //v1.stampanje();
        System.out.println(v1);
        napred.izvrsiAkciju(v1);
        //v1.stampanje();
        System.out.println(v1);
        pojacaj.izvrsiAkciju(v1);
        //v1.stampanje();
        System.out.println(v1);
        brzinaInterneta.izvrsiAkciju(v1);
        //v1.stampanje();


    }
}
