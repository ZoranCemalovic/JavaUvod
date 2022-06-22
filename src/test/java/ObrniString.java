public class ObrniString {
    public static void main(String[] args) {
        //Zadatak3:
        //napraviti metodu `String obrniString(String s)`
        //input: String s
        //output: String sObrnuto
        //primer: obrniString("cao") -> "oac", obrniString("naravno") -> "onvaran", obrniString("ana") -> "ana"
    String s="sam";
        System.out.println(obrniString(s));

    }
    public static String obrniString(String s) {
        String[] nizKaraktera = s.split("");
        String obrnuto="";
        for (int i = nizKaraktera.length -1; i >= 0; i--) {
            obrnuto=obrnuto+nizKaraktera[i];
        }
        return obrnuto;
    }

}
