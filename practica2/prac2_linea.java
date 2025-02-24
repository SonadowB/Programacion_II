import javax.swing.*;
import java.awt.*;
class Punto {
    int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Linea extends JPanel {
    Punto p1, p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
        setPreferredSize(new Dimension(400, 400));
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawLine(p1.x*10, p1.y*10, p2.x*10, p2.y*10);
    }
    public void dibujalinea() {
        JFrame frame = new JFrame("Dibujar Línea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }
}
public class LineaG {
    public static void main(String[] args) {
        Punto p1 = new Punto(5, 5);
        Punto p2 = new Punto(3, 3);
        Linea linea = new Linea(p1, p2);
        linea.dibujalinea();
    }
}
