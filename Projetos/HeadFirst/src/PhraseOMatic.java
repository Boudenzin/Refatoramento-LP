public class PhraseOMatic {
    public static void main (String[] args) {
        String[] numeros = {"um", "dois", "tres", "quatro", "cinco", "seis"};
        int numerosLen = numeros.length;

        int randint = (int) (Math.random() * numerosLen);
        System.out.print("O número de hoje é " + randint + " e ele é divisivel por 3");

    }
}
