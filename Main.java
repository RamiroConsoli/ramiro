import java.util.Scanner;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        String nombreJ1="";
        String nombreJ2="";
        String torneo= "";
        int set;
        int pJ1 = 2;
        int pJ2 = 2;
        System.out.println("Que torneo esta jugando?");
        Scanner tecla = new Scanner(System.in);
        torneo = tecla.nextLine();
        System.out.println("Como se llama el primer jugador?");
        nombreJ1 = tecla.nextLine();
        System.out.println("Como se llama el segundo jugador?");
        nombreJ2 = tecla.nextLine();
        System.out.println("Que probabilidad tiene de ganas de 0 a 100 el primer jugador?");
        pJ1 = tecla.nextInt();
        System.out.println("Que probabilidad tiene de ganas de 0 a 100a el segundo jugador?");
        pJ2 = tecla.nextInt();
            if((pJ1 > 100 || pJ1 < 0)||(pJ2 > 100 || pJ2 < 0)) {
                System.out.println("La probabilidad debe ser de 0 a 100 con sino entrara en bucle");
                System.out.println("Reingrese las probabilidades de ambos jugadores");
                pJ1 = tecla.nextInt();
                pJ2 = tecla.nextInt();
            }
        System.out.println("Cuantos sets jugaran?");
        set=tecla.nextInt();
        if((set==3)|| (set==5))
        {
            System.out.println("El torneo esta por comenzar:");
            ventana ventana =new ventana();
            ventana.setTitle(" "+ torneo);
        }
        else
        {
            System.out.println("solo puede elegir 3 o 5 sets");
            set = tecla.nextInt();
        }
        return;
    }
}
