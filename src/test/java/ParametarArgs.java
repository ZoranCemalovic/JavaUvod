public class ParametarArgs {
    public static void main(String[] args) {
        //napisati program koji cita parametar args iz main metode i stampa svaki od clanova niza args na novoj liniji.
        //Run > Edit configuration > program arguments
        System.out.println(args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
        }

    }
}
