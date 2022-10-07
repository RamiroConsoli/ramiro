import javax.swing.JFrame;

public class ventana extends JFrame {
    int ancho=800;
    int alto=500;
    private tablero lamina;
    private hilo hilo;
        public ventana()
        {
            setSize(ancho,alto);
            setLocationRelativeTo(null);
            setResizable(false);
            lamina=new tablero();
            add(lamina);
            addKeyListener(new evento());
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            hilo=new hilo(lamina);
            hilo.start();
            lamina.iterar();
        }
    }

