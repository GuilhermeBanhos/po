package calculadora;
class Inteiro {
    public int multiplicacao(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado += a;
        }
        return (b < 0) ? -resultado : resultado;
    }
    public int potencia(int a, int b) {
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = multiplicacao(resultado, a);
        }
        return resultado;
    }

   
    public int divisao(int a, int b) {
        if (b == 0) {
            System.out.println("Divisão por zero não é permitida.");
        }
        
        int resultado = 0;
        int valorAtual = Math.abs(a);
        int divisor = Math.abs(b);

        while (valorAtual >= divisor) {
            valorAtual -= divisor;
            resultado++;
        }

        return (a < 0) ^ (b < 0) ? -resultado : resultado; 
    }
    
    public boolean par(int a) {
        return resto(a, 2) == 0;
    }
    private int resto(int a, int b) {
        while (a >= b) {
            a -= b;
        }
        return a;
    }
}