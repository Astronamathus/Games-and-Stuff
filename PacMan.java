import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GamePanel extends JPanel implements ActionListener, KeyListener
{
    Timer timer;
    int pacX = 100, pacY = 100;
    int pacSpeed = 5;
    int dx = 0, dy = 0;
    public GamePanel() 
    {
        setFocusable(true);
        addKeyListener(this);
        timer = new Timer(30, this); // ~33 FPS
        timer.start();
    }
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.YELLOW);
        g.fillArc(pacX, pacY, 30, 30, 30, 300); // Pac-Man
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        pacX += dx;
        pacY += dy;
        repaint();
    }
    @Override
    public void keyPressed(KeyEvent e) 
    {
        switch (e.getKeyCode()) 
        {
            case KeyEvent.VK_UP -> { dx = 0; dy = -pacSpeed; }
            case KeyEvent.VK_DOWN -> { dx = 0; dy = pacSpeed; }
            case KeyEvent.VK_LEFT -> { dx = -pacSpeed; dy = 0; }
            case KeyEvent.VK_RIGHT -> { dx = pacSpeed; dy = 0; }
        }
    }
    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
}
public class PacMan 
{
    public static void main() 
    {
        JFrame frame = new JFrame("Pac-Man");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new GamePanel());
        frame.setVisible(true);
    }
}
