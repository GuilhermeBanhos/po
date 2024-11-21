import circuloo.Circulo;
        import java.util.Scanner;
public class posicaoCirculo {
    public static void main (String[]args){
      
        Scanner input= new Scanner(System.in);
                int x, y, opcao;
                double raio,aumento;
          System.out.println("informe a coordenada de x : ");
                  x= input.nextInt();
          System.out.println("informe a coordenada de y : ");
                  y= input.nextInt();
          System.out.println("informe o raio");
          raio=input.nextDouble();
          Circulo circulo= new Circulo(x,y,raio);

          do {
              System.out.println("menu: \n");
              System.out.println("1- mover \n");
              System.out.println("2- aumentar \n");
              System.out.println("3- imprimir \n");
              System.out.println("4- sair \n");
              System.out.println("selecione umas das opções");
              opcao= input.nextInt();

              if (opcao==1 ){
                System.out.print("qual a posição de x?: ");
                int moveX = input.nextInt();
                circulo.moveX(moveX);
                System.out.print("qual a posição de y?: ");
                int moveY = input.nextInt();
                circulo.moveY(moveY);
              }
              else if( opcao==2){
              System.out.println("quanto deseja aumentar o circulo?");
              aumento = input.nextDouble();
              circulo.aumenta(aumento);
              }

              else if( opcao==3){
                System.out.println(circulo.exibe());
              }
              else if (opcao==4){
                System.out.println("saindo");
              }
            } while (opcao !=4);
            input.close();
            
        }

    }
        
        