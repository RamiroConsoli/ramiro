import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tablero extends JPanel{
    pelota pelota= new pelota(0,0);
    raqueta r1=new raqueta(794-774,200);
    raqueta r2=new raqueta(794-20,200);//aca
    public tablero()
    {
        setBackground(Color.PINK);
    }
    public void paintComponent( Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.yellow);
        //g2.fill(new Rectangle2D.Double(0,0,20,20));
        dibujar(g2);
        actualizar();
    }
    public void dibujar(Graphics2D g)
    {
        g.fill(pelota.getpelota());
        g.fill(r2.getraqueta());
        g.fill(r1.getraqueta());

    }
    public void actualizar()
    {
        pelota.mover(getBounds(),colision(r1.getraqueta()),colision(r2.getraqueta()));
        r1.moverR1(getBounds());
        r2.moverR2(getBounds());


    }
    public void iterar()
    {
        while(true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private boolean colision(Rectangle2D r)
    {
        return pelota.getpelota().intersects(r);
    }
}
