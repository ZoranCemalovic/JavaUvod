public class Stepen {
    public static void main(String[] args) {
        //Zadatak2:
        //napraviti metodu `int stepen(int broj, int n)`
        //input: int broj, int n
        //output: broj "na" n, odnosno, broj^n
        //primer: stepen(2, 3) -> 8, stepen(4, 3) -> 64, stepen(0, 2) -> 0, stepen(3, 0) -> 1, stepen(-1, 3) -> -1
        int broj=2;
        int n=3;
        System.out.println("broj "+broj+" na "+n+" je "+stepen(broj, n));

    }
    public static int stepen(int broj, int n) {
        int stepenovanBroj=1;
        for (int i=0; i<n; i++) {
            stepenovanBroj=stepenovanBroj*broj;
        }
        return stepenovanBroj;
    }
}
