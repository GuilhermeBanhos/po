public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    // Construtor
    public Operario(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double INSS, double valorProducao, double comissao) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, INSS);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * comissao / 100);
    }

    @Override
    public String obterInformacoes() {
        return super.obterInformacoes() + ", Produção: " + valorProducao + ", Comissão: " + comissao + "%";
    }
}
