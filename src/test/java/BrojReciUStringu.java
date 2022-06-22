public class BrojReciUStringu {
    public static void main(String[] args) {
        //napravi metodu koja prima kao parametar String a vraca kao rezultat broj reci u datom string-u.
        String recenica = "ItBootcamp je super!";
        //int broj=brojReci(recenica);
                    System.out.println(brojReci(recenica));

    }
    public static int brojReci(String recenica) {

        int broj=recenica.split(" ").length;
        return broj;
    }
}
