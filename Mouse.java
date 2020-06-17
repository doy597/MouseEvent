import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

import java.awt.event.MouseListener;  /**マウスを操作したら */
import java.awt.event.MouseAdapter; /**イベントにつなげる機能 */
import java.awt.event.MouseEvent; /**イベント機能 */

class Mouse extends JFrame{
    Canvas c; /** オブジェクトはclass直下で */
    Mouse(){
      setSize(400,400);
      c = new Canvas();
      getContentPane().add(c);
      c.addMouseListener(new MouseEv());
    }

    class MouseEv extends MouseAdapter{
      public void mousePressed(MouseEvent e){
          Graphics g;
          g = c.getGraphics();
          g.fillOval(e.getX(),e.getY(),10,10);
      }
    }
      public static void main(String args[]){
            new Mouse().setVisible(true);
    }
}