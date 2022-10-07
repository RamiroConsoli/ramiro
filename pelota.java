import java.awt.*;
import java.awt.geom.Rectangle2D;

public class pelota {
    private int x;
    private int y;
    private int ancho=15;
    private int alto=15;
    private int dx=1,dy=1;
    public pelota(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public Rectangle2D getpelota() {
        return new Rectangle2D.Double(x,y,ancho,alto);
    }
    public void mover(Rectangle limites,boolean colisionR1, boolean colisionR2)
    {
        x+=dx;
        y+=dy;

        if(colisionR1)
        {
            dx=-dx;
            x=25;
        }
        if(colisionR2)
        {
            dx=-dx;
            x=755;
        }
        if(x>limites.getMaxX())
        {
        dx=-dx;
        }
        if(y>limites.getMaxY())
        {
            dy=-dy;
        }
        if(x<0)
        {
            dx=-dx;
        }
        if(y<0)
        {
            dy=-dy;
        }
    }
}
