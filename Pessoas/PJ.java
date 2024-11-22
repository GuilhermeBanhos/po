public class PJ extends Pessoa {
    private String CNPJ;
    private String IE;

    public PJ() {
        super();
        CNPJ = "";
        IE = "";public class PJ extends Pessoa {
            private String CNPJ;
            private String IE;
        
           
            public PJ() {
                super();  
                CNPJ = "";
                IE = "";
            }
        
            
            public PJ(String nome, String telefone, String endereco, String CNPJ, String IE) {
                super(nome, telefone, endereco);  
                this.CNPJ = CNPJ;
                this.IE = IE;
            }
        
            
            @Override
            public void exibe() {
                super.exibe();  // Exibe nome, telefone, e endereço
                System.out.println("CNPJ: " + CNPJ);
                System.out.println("IE: " + IE);
            }
        }
        
    }
    public PJ(String nome, String telefone, String endereco, String CNPJ, String IE) {
        super (nome, telefone, endereco);
        this.CNPJ = CNPJ;
        this.IE = IE;
    }
}
