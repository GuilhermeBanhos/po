import produto.Produto;
import java.util.Scanner;

public class Produtocodigo{
    public static void main (String[]args){
    String nome;
    int ID;
    double preco;
        Scanner inpput = new Scanner(System.in);

        System.out.print("Informe o nome do primeiro produto: ");
        String nome1 = input.nextLine();
        System.out.print("Informe o preço do primeiro produto: ");
        double preco1 = input.nextDouble();
        Produto produto1 = new Produto(nome1, preco1);
        input.nextLine(); 

    
        System.out.print("Informe o nome do segundo produto: ");
        String nome2 = input.nextLine();
        System.out.print("Informe o preço do segundo produto: ");
        double preco2 = input.nextDouble();
        Produto produto2 = new Produto(nome2, preco2);

        System.out.print("Informe o percentual de reajuste: ");
        double reajuste = scanner.nextDouble();
        produto1.reajustaPreco(reajuste);
        produto2.reajustaPreco(reajuste);

    
        System.out.println("\nInformações do primeiro produto:");
        produto1.exibe();

        System.out.println("\nInformações do segundo produto:");
        produto2.exibe();

    
        System.out.println("\nÚltimo ID gerado: " + Produto.ultimoId);
    }
}
    
