package tempoo;
public class Time {
    private int hora, minuto ,segundo;
    public Time() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    public Time(int hora) {
        setHora(hora);
        this.minuto = 0;
        this.segundo = 0;
    }
    public Time(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
        this.segundo = 0;
    }
    public Time(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida! Deve estar entre 0 e 23.");
        }
    }
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido! Deve estar entre 0 e 59.");
        }
    }
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido! Deve estar entre 0 e 59.");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    public void setTime(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    public String formatTime() {
        return String.format(hora + "/" + minuto + "/" + segundo);
    }
}
