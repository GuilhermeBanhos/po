public class Amigo extends PF {
    private String blog;

   
    public Amigo() {
        super();  
        blog = "";
    }

    public Amigo(String nome, String telefone, String endereco, String RG, String CPF, String blog) {
        super(nome, telefone, endereco, RG, CPF);  
        this.blog = blog;
    }

    @Override
    public void exibe() {
        super.exibe();  
        System.out.println("Blog: " + blog); 
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
}
