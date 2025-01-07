import java.util.Scanner;

public class Maior {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valores = sc.nextLine().split(" ");
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);
        int MaiorAB = (a+b+Math.abs(a-b))/2;
        int MaiorAC = 0;
        if (MaiorAB == a) {
            MaiorAC = (a+c+Math.abs(a-c))/2;
        }
        else if (MaiorAB == b) {
            MaiorAC = (b+c+Math.abs(b-c))/2;
        }
        System.out.println(MaiorAC + " eh o maior");
        sc.close();
    }
}
