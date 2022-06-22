public class ApsolutniBroj {
    public static void main(String[] args) {
        //napraviti metodu int apsolut(int broj)
        //input: int broj
        //output: int apsolutBroj
        //primer: apsolut(5) -> 5, apsolut(-5) -> 5, apsolut(0) -> 0
    int broj=-8;
        System.out.println("Apsolutni broj je ");
        System.out.println(apsolut(broj));


    }
    public static int apsolut(int broj) {

        return (broj<0) ? -broj : broj;
    }
}
//    public static int apsolut(int broj) {
//        //broj > 0, vrati samo broj
//        // broj <= 0 vrati |-x| = x.. x * (-1).. -
//
////        if (broj < 0) return -broj;
////        return broj; //broj * (-1)
//        //ternarni operator
//        return (broj < 0) /*uslov(condition)*/ ? /*ako je uslov tacan (prvo grananje*/ -broj : /*inace(2 grana)*/ broj;
//    }