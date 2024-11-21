package circuloo;
public class Circulo {
    private double raio;
    private int x, y;

    public Circulo(int x, int y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }
    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    public void moveX(int x1) {
        this.x += x1;
    }
    public void moveY(int y1) {
        this.y += y1;
    }
    public void aumenta(double r) {
        this.raio *= r;
    }
    public String exibe() {
        return "Raio: " + raio + "\n" +
               "Perímetro: " + perimetro() + "\n" +
               "Área: " + area() + "\n" +
               "centro : ("+ x +"," + y +")";
}
}
