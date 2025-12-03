package fastmath.application;

import fastmath.math.MatematicaMenu;
import fastmath.physics.FisicaMenu;
import fastmath.util.InputUtils;

public class FastMathApp {

    public void iniciar() {

        MatematicaMenu matematica = new MatematicaMenu();
        FisicaMenu fisica = new FisicaMenu();

        int opcao;

        do {
            System.out.println("\n===== FASTMATH =====");
            System.out.println("1 - Matemática");
            System.out.println("2 - Física");
            System.out.println("0 - Sair");
            opcao = InputUtils.lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    matematica.iniciar();
                    break;

                case 2:
                    fisica.iniciar();
                    break;

                case 0:
                    System.out.println("Encerrando FastMath...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 0);
    }
}
