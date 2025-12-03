package fastmath.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {

    private static final Scanner sc = new Scanner(System.in);

    public static double lerDouble(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número.");
                sc.nextLine();
            }
        }
    }

    public static int lerInt(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite um número inteiro.");
                sc.nextLine();
            }
        }
    }
}
