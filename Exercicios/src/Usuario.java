package src;
public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ? :" + smartTv.ligada + "/n");
        System.out.println("Canal Atual ? :" + smartTv.canal);
        System.out.println("Volume Atual ? :" + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();

        smartTv.ligar();
        System.out.println(" Novo Status = Tv Ligada ? :" + smartTv.ligada + "/n");

        smartTv.desligar();
        System.out.println(" Novo Status = Tv Ligada ? :" + smartTv.ligada +"/n");

            int numero1 = 1;
            String numero2 = "2";
            System.out.println(numero1+numero2); 
          }
    }


