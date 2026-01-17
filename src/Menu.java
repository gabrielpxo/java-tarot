import java.util.Scanner;

public class Menu{

    private Baralho baralho;
    private Scanner scanner;

    public Menu(){
        baralho = new Baralho();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu(){
        int opcao;
        do {
            System.out.println("\n═══════════════════════════════");
            System.out.println("        JAVA TAROT");
            System.out.println("═══════════════════════════════");
            System.out.println("1. Embaralhar cartas");
            System.out.println("2. Sortear uma carta");
            System.out.println("3. Tirar 3 cartas (passado/presente/futuro)");
            System.out.println("4. Cruz Celta (tiragem completa)");
            System.out.println("0. Sair");
            System.out.println("═══════════════════════════════");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    usuarioEmbaralhaCartas();
                    break;
                case 2:
                    sortearCarta();
                    break;
                case 3:
                    sortearTresCartas();
                    break;
                case 4:
                    sortearCruzCelta();
                    break;
                case 0:
                    System.out.println("\nAté logo!");
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida.");
            }
        } while (opcao != -1);
        scanner.close();
    }

    private void aguardaEnter(){
        System.out.println("\n═══════════════════════════════");
        System.out.print("Pressione ENTER para voltar ao menu...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    private void usuarioEmbaralhaCartas() {
        System.out.println("\n═══════════════════════════════");
        System.out.println("   EMBARALHANDO AS CARTAS   ");
        System.out.println("═══════════════════════════════");
        baralho.loadingDeEmbaralhamento();
        baralho.usuarioEmbaralhaCartas();
        aguardaEnter();
    }

    private void sortearCarta() {
        System.out.println("\n═══════════════════════════════");
        System.out.println("      SORTEANDO UMA CARTA     ");
        System.out.println("═══════════════════════════════");
        baralho.loadingDeEmbaralhamento();
        String carta = baralho.sortearCarta();
        System.out.println("Carta sorteada: " + carta);
        aguardaEnter();
    }

    private void sortearTresCartas() {
        System.out.println("\n═══════════════════════════════");
        System.out.println("    SORTEANDO TRÊS CARTAS    ");
        System.out.println("═══════════════════════════════");
        baralho.loadingDeEmbaralhamento();
        String[] cartas = baralho.sortearTresCartas();
        System.out.println("As três cartas são:");
        for (int i = 0; i < cartas.length; i++) {
            System.out.println((i+1) + ". " + cartas[i]);
        }
        aguardaEnter();
    }

    private void sortearCruzCelta() {
        System.out.println("\n═══════════════════════════════");
        System.out.println("      CRUZ CELTA (10 CARTAS)  ");
        System.out.println("═══════════════════════════════");
        baralho.loadingDeEmbaralhamento();
        String[] cruz = baralho.sortearCruzCelta();

        System.out.println("Tiragem da Cruz Celta:");
        System.out.println("\n1.  VOCÊ (Presente): " + cruz[0]);
        System.out.println("2.  CRUZ (Desafio): " + cruz[1]);
        System.out.println("3.  COROA (Objetivo): " + cruz[2]);
        System.out.println("4.  BASE (Raiz): " + cruz[3]);
        System.out.println("5.  ATRÁS (Passado): " + cruz[4]);
        System.out.println("6.  ADIANTE (Futuro): " + cruz[5]);
        System.out.println("7.  ATITUDE: " + cruz[6]);
        System.out.println("8.  AMBIENTE: " + cruz[7]);
        System.out.println("9.  ESPERANÇAS/MEDOS: " + cruz[8]);
        System.out.println("10. RESULTADO: " + cruz[9]);
        aguardaEnter();
    }

}

