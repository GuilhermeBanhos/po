
class Produto {
    private static int ultimoId = 0; 
    private final int id; 
    private String nome;
    private double preco; 

    
    public Produto() {
        this("Nome não informado", 0);
    }

    public Produto(String nome, double preco) {
        ultimoId++;
        this.id = ultimoId;
        this.nome = nome;
        setPreco(preco);
    }
    public int getId() {
        return id;
    }
    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }
    public double getPreco() {
        return preco;
    }
    public void exibe() {
        System.out.println("Produto: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
    }
    public void reajustaPreco(double percentual) {
        if (percentual < 0) {
            percentual = 0;
        }
        preco += preco * (percentual / 100);
    }
}