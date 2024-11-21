import calculadora.Inteiro;
import java.util.Scanner;
public class Claculadora{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Inteiro inteiro = new Inteiro();
    int opcao;

    do {
        System.out.println("Escolha uma opção:");
        System.out.println("1 – Multiplicação");
        System.out.println("2 – Potência");
        System.out.println("3 – Divisão");
        System.out.println("4 – Par");
        System.out.println("5 – Sair");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Informe o primeiro número: ");
                int a1 = input.nextInt();
                System.out.print("Informe o segundo número: ");
                int b1 = input.nextInt();
                System.out.println("Resultado: " + inteiro.multiplicacao(a1, b1));
                break;

            case 2:
                System.out.print("Informe a base : ");
                int a2 = input.nextInt();
                System.out.print("Informe o expoente : ");
                int b2 = input.nextInt();
                System.out.println("Resultado: " + inteiro.potencia(a2, b2));
                break;

            case 3:
                System.out.print("Informe o dividendo : ");
                int a3 = input.nextInt();
                System.out.print("Informe o divisor): ");
                int b3 = input.nextInt();
                try {
                    System.out.println("Resultado: " + inteiro.divisao(a3, b3));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 4:
                System.out.print("Informe o número : ");
                int a4 = input.nextInt();
                System.out.println("É par? " + inteiro.par(a4));
                break;

            case 5:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    } while (opcao != 5);

    scanner.close();
}
}