import tempoo.Time;
import java.util.Scanner;
public class timer {
    public static void main (String[]args){
        int hora,minuto,segundo,opcao;
        Scanner input = new Scanner (System.in);
        Time time= new Time();
do{
        System.out.println("selecione uma das opções:");
        System.out.println("1- mudar as horas completas");
        System.out.println(" 2- mudar as horas");
        System.out.println("3- mudar os minutos");
        System.out.println("4- mudar os segundos");
        System.out.println("5- exibir a hora");
        opcao= input.nextInt();
        
        if (opcao==1){
            System.out.println("informe as horas:");
            hora=input.nextInt();
            System.out.println("informe os minutos:");
            minuto=input.nextInt();
            System.out.println("informe os segundos");
            segundo= input.nextInt();

            time.setTime(hora,minuto,segundo);}
    
        else if (opcao==2){
        System.out.println("informe as horas ");
       hora =input.nextInt();
       time.setHora(hora);
        }

        else if (opcao==4){
            System.out.println("informe os segundos");
            segundo= input.nextInt();
            time.setSegundo(segundo);
        }
            else if (opcao==3){
                System.out.println("informe os minutos");
                minuto=input.nextInt();
                time.setMinuto(minuto);
            }
            else if (opcao==5){
                System.out.println(time.formatTime());
            }
    } while(opcao < 1 && opcao >5);{
            input.close() ;   }
        
    }
    
}
