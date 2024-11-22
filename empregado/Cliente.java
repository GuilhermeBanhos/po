public class Empregado extends Pessoa {
    private int numeroSecao;
    private double salarioBase;
    private double INSS;

    // Construtor
    public Empregado(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double INSS) {
        super(nome, idade, altura, peso);
        this.numeroSecao = numeroSecao;
        this.salarioBase = salarioBase;
        this.INSS = INSS;
    }

    public int getNumeroSecao() {
        return numeroSecao;
    }

    public void setNumeroSecao(int numeroSecao) {
        this.numeroSecao = numeroSecao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getINSS() {
        return INSS;
    }

    public void setINSS(double INSS) {
        this.INSS = INSS;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * INSS / 100);
    }

    @Override
    public String obterInformacoes() {
        return super.obterInformacoes() + ", Seção: " + numeroSecao + ", Salário Base: " + salarioBase + ", INSS: " + INSS + "%";
    }
}
