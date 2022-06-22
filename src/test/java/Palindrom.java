public class Palindrom {
    public static void main(String[] args) {
        //Zadatak4:
        //napraviti metodu `boolean palindrom(String s)`
        //input: String s
        //output: boolean isPalindrom
        //primer: palindrom("cao") -> false, palindrom("anavolimilovana") -> true
        String s="pera";
        System.out.println(palindrom(s));

    }
    public static boolean palindrom(String s) {
        String[] nizKaraktera = s.split("");
        String obrnuto="";
        for (int i = nizKaraktera.length -1; i >= 0; i--) {
            obrnuto=obrnuto+nizKaraktera[i];
        }
        return obrnuto.equals(s);
    }

}

