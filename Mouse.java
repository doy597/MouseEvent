import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

import java.awt.event.MouseListener;  /**�}�E�X�𑀍삵���� */
import java.awt.event.MouseAdapter; /**�C�x���g�ɂȂ���@�\ */
import java.awt.event.MouseEvent; /**�C�x���g�@�\ */

class Mouse extends JFrame{
    Canvas c; /** �I�u�W�F�N�g��class������ */
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