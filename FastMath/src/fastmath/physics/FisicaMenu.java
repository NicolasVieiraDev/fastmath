package fastmath.physics;

import java.util.Scanner;

public class FisicaMenu {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {

        int opcao;

        do {
            System.out.println("\n==== FASTMATH - FÍSICA ====");
            System.out.println("1 - MRU");
            System.out.println("2 - MRUV");
            System.out.println("3 - Força");
            System.out.println("4 - Energia");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {

                case 1:
                    menuMru();
                    break;

                case 2:
                    menuMruv();
                    break;

                case 3:
                    menuForca();
                    break;

                case 4:
                    menuEnergia();
                    break;

                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    private void menuMru() {

        System.out.println("=== MRU ===");
        System.out.println("1 - Calcular Velocidade");
        System.out.println("2 - Calcular Distância");
        System.out.println("3 - Calcular Tempo");
        System.out.print("Escolha: ");

        int op = sc.nextInt();

        switch (op) {

            case 1:
                System.out.print("Distância: ");
                double d1 = sc.nextDouble();
                System.out.print("Tempo: ");
                double t1 = sc.nextDouble();

                Mru m1 = new Mru(d1, t1);
                System.out.println("Velocidade = " + m1.calcularVelocidade());
                break;

            case 2:
                System.out.print("Velocidade: ");
                double v2 = sc.nextDouble();
                System.out.print("Tempo: ");
                double t2 = sc.nextDouble();

                Mru m2 = new Mru(0, t2, v2);
                System.out.println("Distância = " + m2.calcularDistancia());
                break;

            case 3:
                System.out.print("Distância: ");
                double d3 = sc.nextDouble();
                System.out.print("Velocidade: ");
                double v3 = sc.nextDouble();

                Mru m3 = new Mru(d3, 0, v3);
                m3.setTempo(d3 / v3);
                System.out.println("Tempo = " + m3.getTempo());
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuMruv() {

        System.out.println("=== MRUV ===");
        System.out.println("1 - Velocidade Final");
        System.out.println("2 - Aceleração");
        System.out.println("3 - Deslocamento");
        System.out.println("4 - Torricelli");
        System.out.print("Escolha: ");

        int op = sc.nextInt();

        switch (op) {

            case 1:
                System.out.print("Velocidade Inicial: ");
                double vi1 = sc.nextDouble();
                System.out.print("Aceleração: ");
                double a1 = sc.nextDouble();
                System.out.print("Tempo: ");
                double t1 = sc.nextDouble();

                Mruv mv1 = new Mruv(vi1, a1, t1);
                System.out.println("Velocidade Final = " + mv1.calcularVelocidadeFinal());
                break;

            case 2:
                System.out.print("Velocidade Inicial: ");
                double vi2 = sc.nextDouble();
                System.out.print("Velocidade Final: ");
                double vf2 = sc.nextDouble();
                System.out.print("Tempo: ");
                double t2 = sc.nextDouble();

                Mruv mv2 = new Mruv(vi2, vf2, 0.0, t2, 0.0);
                System.out.println("Aceleração = " + mv2.calcularAceleracao());
                break;

            case 3:
                System.out.print("Velocidade Inicial: ");
                double vi3 = sc.nextDouble();
                System.out.print("Aceleração: ");
                double a3 = sc.nextDouble();
                System.out.print("Tempo: ");
                double t3 = sc.nextDouble();

                Mruv mv3 = new Mruv(vi3, a3, t3);
                System.out.println("Deslocamento = " + mv3.calcularDeslocamento(0));
                break;

            case 4:
                System.out.print("Velocidade Inicial: ");
                double vi4 = sc.nextDouble();
                System.out.print("Aceleração: ");
                double a4 = sc.nextDouble();
                System.out.print("Deslocamento: ");
                double ds4 = sc.nextDouble();

                Mruv mv4 = new Mruv(vi4, 0.0, a4);
                System.out.println("Torricelli = " + mv4.calcularTorricelli(ds4));
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }

    private void menuForca() {

        System.out.println("=== FORÇA ===");

        System.out.print("Massa: ");
        double m = sc.nextDouble();

        System.out.print("Aceleração: ");
        double a = sc.nextDouble();

        Forca f = new Forca(m, a);

        System.out.println("Força = " + f.calcularForca());
    }

    private void menuEnergia() {

        System.out.println("=== ENERGIA ===");
        System.out.println("1 - Energia Cinetica");
        System.out.println("2 - Energia Potencial");
        System.out.print("Escolha: ");

        int op = sc.nextInt();

        switch (op) {

            case 1:
                System.out.print("Massa: ");
                double m1 = sc.nextDouble();
                System.out.print("Velocidade: ");
                double v1 = sc.nextDouble();

                Energia e1 = new Energia(m1, v1);
                System.out.println("Energia Cinética = " + e1.calcularEnergiaCinetica());
                break;

            case 2:
                System.out.print("Massa: ");
                double m2 = sc.nextDouble();
                System.out.print("Altura: ");
                double h2 = sc.nextDouble();

                Energia e2 = new Energia(m2, h2, 9.8);
                System.out.println("Energia Potencial = " + e2.calcularEnergiaPotencial());
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }
}
