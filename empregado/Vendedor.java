public class Vendedor extends Empregado {
    
    private double valorVendas;
    private double comissao;

    
    public Vendedor(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double INSS, double valorVendas, double comissao) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, INSS);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * comissao / 100);
    }

    
    @Override
    public String obterInformacoes() {
        return super.obterInformacoes() + ", Vendas: " + valorVendas + ", Comissão: " + comissao + "%";
    }
}
