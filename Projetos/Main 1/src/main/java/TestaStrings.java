public class TestaStrings {
    public static void main(String[] args) {
        if(args.length==0) {
            System.out.println("Programa sem parametros");
        } else {
            System.out.println("Os parametros são:");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
