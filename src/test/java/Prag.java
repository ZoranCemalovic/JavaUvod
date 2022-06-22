public class Prag {
    public static void main(String[] args) {
        //Napraviti niz koji ce sadrzati nazive gradove i treba odstampati sve gradove osim grada "Prag"
    String[] grad={"Beograd","Berlin","Milano","Pariz","Prag","London","Madrid"};
    for (int i=0; i<grad.length; i++) {
                if (!grad[i].equals("Prag")) {
            System.out.println(grad[i]);
        }
    }



    }
}
