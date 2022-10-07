import java.util.logging.Level;
import java.util.logging.Logger;

public class hilo extends Thread{
    tablero lamina;

    public hilo(tablero lamina) {

        this.lamina=lamina;
    }
    public void run()
    {
        while(true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            lamina.repaint();
        }


    }
}
