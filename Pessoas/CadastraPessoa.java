import javax.swing.JOptionPane; //import necessário para usar o JOptionPane

public class CadastraPessoa {

    public static void main(String[] args) {

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n\n1. Pessoa física\n2. Pessoa Jurídica"));

        String nome = JOptionPane.showInputDialog("Digite o nome");
        String telefone = JOptionPane.showInputDialog("Digite o telefone");
        String endereco = JOptionPane.showInputDialog("Digite o endereço");

        if (opcao == 1) {
            Pessoa pessoa = new Pessoa();

            String RG = JOptionPane.showInputDialog("Digite o RG");
            String CPF = JOptionPane.showInputDialog("Digite o CPF");

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n\n1. Amigos\n2. Parentes"));
            
            if (opcao == 1) {
                String blog = JOptionPane.showInputDialog("Digite o blog");

                Amigo Amigo = new Amigo(nome, telefone, endereco, RG, CPF, blog);
                
               
                JOptionPane.showMessageDialog(null, Amigo.exibe());
            }
            else if (opcao == 2) {
                String email = JOptionPane.showInputDialog("Digite o e-mail");
                Parente Parente = new Parente(nome, telefone, endereco, RG, CPF, email);
                
                JOptionPane.showMessageDialog(null, Parente.exibe());
            }
        }
        else if (opcao == 2) {
            String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ");
            String IE = JOptionPane.showInputDialog("Digite a Inscrição Estadual");
            PJ PJ = new PJ(nome, telefone, endereco, CNPJ, IE);
            
            JOptionPane.showMessageDialog(null, PJ.exibe());
        }
    }
}
