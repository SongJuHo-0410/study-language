
import java.awt.event.*;


public class MyListener implements MouseListener
{    
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        ml.setLocation(x,y);
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}
