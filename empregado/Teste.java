import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de pessoa para cadastrar:");
        System.out.println("1 - Pessoa");
        System.out.println("2 - Empregado");
        System.out.println("3 - Cliente");
        System.out.println("4 - Administrador");
        System.out.println("5 - Operário");
        System.out.println("6 - Vendedor");

        int escolha = scanner.nextInt();
        scanner.nextLine();

        if (escolha == 1) {
            System.out.println("Digite o nome da pessoa:");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade da pessoa:");
            int idade = scanner.nextInt();
            System.out.println("Digite a altura da pessoa:");
            double altura = scanner.nextDouble();
            System.out.println("Digite o peso da pessoa:");
            double peso = scanner.nextDouble();
            
            Pessoa pessoa = new Pessoa(nome, idade, altura, peso);
            System.out.println("Dados cadastrados: " + pessoa.obterInformacoes());

        } else if (escolha == 2) {
            System.out.println("Digite o nome do empregado:");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do empregado:");
            int idade = scanner.nextInt();
            System.out.println("Digite a altura do empregado:");
            double altura = scanner.nextDouble();
            System.out.println("Digite o peso do empregado:");
            double peso = scanner.nextDouble();
            System.out.println("Digite o número da seção do empregado:");
            int numeroSecao = scanner.nextInt();
            System.out.println("Digite o salário base do empregado:");
            double salarioBase = scanner.nextDouble();
            System.out.println("Digite o percentual de INSS do empregado:");
            double INSS = scanner.nextDouble();
            
            Empregado empregado = new Empregado(nome, idade, altura, peso, numeroSecao, salarioBase, INSS);
            System.out.println("Dados cadastrados: " + empregado.obterInformacoes());
            System.out.println("Salário calculado: " + empregado.calcularSalario());

        } else if (escolha == 3) {
            System.out.println("Digite o nome do cliente:");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do cliente:");
            int idade = scanner.nextInt();
            System.out.println("Digite a altura do cliente:");
            double altura = scanner.nextDouble();
            System.out.println("Digite o peso do cliente:");
            double peso = scanner.nextDouble();
            System.out.println("Digite o crédito máximo do cliente:");
            double credMax = scanner.nextDouble();
            System.out.println("Digite o valor em dívida do cliente:");
            double valorEmDivida = scanner.nextDouble();

            Cliente cliente = new Cliente(nome, idade, altura, peso, credMax, valorEmDivida);
            System.out.println("Dados cadastrados: " + cliente.obterInformacoes());

        } else if (escolha == 4) {
            System.out.println("Digite o nome do administrador:");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do administrador:");
            int idade = scanner.nextInt();
            System.out.println("Digite a altura do administrador:");
            double altura = scanner.nextDouble();
            System.out.println("Digite o peso do administrador:");
            double peso = scanner.nextDouble();
            System.out.println("Digite o número da seção do administrador:");
            int numeroSecao = scanner.nextInt();
            System.out.println("Digite o salário base do administrador:");
            double salarioBase = scanner.nextDouble();
            System.out.println("Digite o percentual de INSS do administrador:");
            double INSS = scanner.nextDouble();
            System.out.println("Digite o valor de ajuda de custo do administrador:");
            double ajudaDeCusto = scanner.nextDouble();
            
            Administrador administrador = new Administrador(nome, idade, altura, peso, numeroSecao, salarioBase, INSS, ajudaDeCusto);
            System.out.println("Dados cadastrados: " + administrador.obterInformacoes());
            System.out.println("Salário calculado: " + administrador.calcularSalario());

        } else if (escolha == 5) {
            System.out.println("Digite o nome do operário:");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do operário:");
            int idade = scanner.nextInt();
            System.out.println("Digite a altura do operário:");
            double altura = scanner.nextDouble();
            System.out.println("Digite o peso do operário:");
            double peso = scanner.nextDouble();
            System.out.println("Digite o número da seção do operário:");
            int numeroSecao = scanner.nextInt();
            System.out.println("Digite o salário base do operário:");
            double salarioBase = scanner.nextDouble();
            System.out.println("Digite o percentual de INSS do operário:");
            double INSS = scanner.nextDouble();
            System.out.println("Digite o valor da produção do operário:");
            double valorProducao = scanner.nextDouble();
            System.out.println("Digite a comissão do operário:");
            double comissao = scanner.nextDouble();

            Operario operario = new Operario(nome, idade, altura, peso, numeroSecao, salarioBase, INSS, valorProducao, comissao);
            System.out.println("Dados cadastrados: " + operario.obterInformacoes());
            System.out.println("Salário calculado: " + operario.calcularSalario());

        } else if (escolha == 6) {
            System.out.println("Digite o nome do vendedor:");
            String nome = scanner.nextLine();
            System.out.println("Digite a idade do vendedor:");
            int idade = scanner.nextInt();
            System.out.println("Digite a altura do vendedor:");
            double altura = scanner.nextDouble();
            System.out.println("Digite o peso do vendedor:");
            double peso = scanner.nextDouble();
            System.out.println("Digite o número da seção do vendedor:");
            int numeroSecao = scanner.nextInt();
            System.out.println("Digite o salário base do vendedor:");
            double salarioBase = scanner.nextDouble();
            System.out.println("Digite o percentual de INSS do vendedor:");
            double INSS = scanner.nextDouble();
            System.out.println("Digite o valor das vendas do vendedor:");
            double valorVendas = scanner.nextDouble();
            System.out.println("Digite a comissão do vendedor:");
            double comissao = scanner.nextDouble();

            Vendedor vendedor = new Vendedor(nome, idade, altura, peso, numeroSecao, salarioBase, INSS, valorVendas, comissao);
            System.out.println("Dados cadastrados: " + vendedor.obterInformacoes());
            System.out.println("Salário calculado: " + vendedor.calcularSalario());
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
