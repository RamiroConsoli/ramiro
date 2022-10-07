import java.awt.*;
import java.awt.geom.Rectangle2D;

public class raqueta {
    static int x,y;
    static final int w=10,h=40;
    public raqueta(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public static Rectangle2D getraqueta()
    {
        return new Rectangle2D.Double(x,y,w,h);
    }
    public void moverR1(Rectangle limites)
    {
        if(evento.w && y>limites.getMinY())
        {
            y--;
        }
        if(evento.s && y < limites.getMaxY()-h)
        {
            y++;
        }
    }
    public void moverR2(Rectangle limites)
    {
        if(evento.up && y>limites.getMinY())
        {
            y--;
        }
        if(evento.down && y < limites.getMaxY()-h)
        {
            y++;
        }
    }
}
