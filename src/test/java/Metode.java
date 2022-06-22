public class Metode {
    public static void main(String[] args) {
        //kaziZdravo2("Marko");
        String vrednostIzZdravo2=kaziZdravo2("Zarko");
        System.out.println(vrednostIzZdravo2);
    }

    public static void kaziZdravo(String ime) {
        System.out.println("Ovde pocinje metoda Kazi zdravo");
        System.out.println("Zdravo"+ime);
    }
    public static String kaziZdravo2(String ime){
        return "Zdravo "+ime;
    }

}
