//Ler duas notas N1 e N2 e exibir a média. Obs.: N1 tem peso 1 e N2 tem peso 2 e resultado deve estar entre 0 e 10.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        double n1,n2,result;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        n1 = in.nextDouble();
        System.out.println("Digite a segunda nota:");
        n2 = in.nextDouble();
        result = (n1 + n2 * 2)/3;
        System.out.println("A média é:" + result);
    }
}