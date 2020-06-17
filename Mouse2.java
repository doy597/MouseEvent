import java.awt.*;
import javax.swing.*;

import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;

class Mouse2 extends JFrame{
  /**オブジェクトを作成 */
  Canvas c;
  int x,y;

  Mouse2(){
      c= new Canvas();
      c.setBackground(Color.pink);
      setSize(400,400);
      Container container = this.getContentPane();
      container.add(c);
      c.addMouseMotionListener(new MouseEv());
      c.addMouseListener(new MouseEv2());
  }
  class MouseEv extends MouseMotionAdapter{
      public void mouseMoved(MouseEvent e){
          x=e.getX();
          y=e.getY();
          System.out.println(x+"×"+y);       
      }
  }
  class MouseEv2 extends MouseAdapter{
      public void mousePressed(MouseEvent e){
        Graphics g = c.getGraphics();

        int red=(int)(Math.random()*255);
        int green=(int)(Math.random()*255);
        int blue=(int)(Math.random()*255);
        Color iro=new Color(red,green,blue);
        g.setColor(iro);
        g.fillOval(x-10,y-10,20,20);
      }
  }

  public static void main(String args[]){
      Mouse2 f;
      f = new Mouse2();

      f.setVisible(true);
  }
}