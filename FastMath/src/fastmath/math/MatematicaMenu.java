package fastmath.math;

import java.util.Scanner;

public class MatematicaMenu {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {

        int opcao;

        do {
            System.out.println("\n==== FASTMATH ====");
            System.out.println("1 - Bhaskara");
            System.out.println("2 - Porcentagem");
            System.out.println("3 - Regra de Três");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {

                case 1:
                    menuBhaskara();
                    break;

                case 2:
                    menuPorcentagem();
                    break;

                case 3:
                    menuRegraDeTres();
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

    private void menuBhaskara() {
        System.out.println("=== BHASKARA ===");
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        Bhaskara bh = new Bhaskara(a, b, c);

        double delta = bh.delta();
        System.out.println("\nDelta = " + delta);

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            System.out.println("x1 = " + bh.x1());
            System.out.println("x2 = " + bh.x2());
        }
    }

    private void menuPorcentagem() {
        System.out.println("=== PORCENTAGEM ===");
        System.out.print("Valor base: ");
        double base = sc.nextDouble();

        System.out.print("Porcentagem: ");
        double pct = sc.nextDouble();

        Porcentagem p = new Porcentagem(base, pct);

        System.out.println("\n1 - Calcular porcentagem");
        System.out.println("2 - Aumento");
        System.out.println("3 - Desconto");
        System.out.println("4 - Percentual de um valor");
        System.out.println("5 - Variação percentual");
        System.out.print("Escolha: ");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + p.calcularPorcentagem());
                break;

            case 2:
                System.out.println("Resultado: " + p.calcularAumento());
                break;

            case 3:
                System.out.println("Resultado: " + p.calcularDesconto());
                break;

            case 4:
                System.out.print("Informe o valor: ");
                double v = sc.nextDouble();
                System.out.println("Percentual: " + p.calcularPercentualDe(v) + "%");
                break;

            case 5:
                System.out.print("Novo valor: ");
                double nv = sc.nextDouble();
                System.out.println("Variação: " + p.calcularVariacaoPercentual(nv) + "%");
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuRegraDeTres() {
        System.out.println("=== REGRA DE TRÊS ===");

        System.out.print("Valor A: ");
        int a = sc.nextInt();

        System.out.print("Valor B: ");
        int b = sc.nextInt();

        System.out.print("Valor C: ");
        int c = sc.nextInt();

        RegradeTres r = new RegradeTres(a, b, c);

        System.out.println("\n1 - Regra de três direta");
        System.out.println("2 - Regra de três inversa");
        System.out.print("Escolha: ");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Resultado: " + r.calcularDireta());
                break;

            case 2:
                System.out.println("Resultado: " + r.calcularInversa());
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
