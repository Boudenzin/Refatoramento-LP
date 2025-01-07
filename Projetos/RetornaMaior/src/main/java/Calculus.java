public class Calculus {
    public static int max(int num1, int num2) {
        return Math.max(num1, num2);
    }
    public static int max(int num1, int num2, int num3) {
        if (num1>=num2 && num1>=num3) {
            return num1;
        } else if (num2>=num1 && num2>=num3) {
            return num2;
        } else {
            return num3;
        }
    }
    public static int max(int[] numeros) {
        int maior = numeros[0];
        for (int k=1; k < numeros.length; k++) {
            if (numeros[k]>maior) {
                maior = numeros[k];
            }
        }
        return maior;
    }
}
