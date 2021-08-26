import java.awt.*;
import java.awt.event.*;
public class ButtonExample extends Frame implements ActionListener
{	
Button b;
TextField tf;
public ButtonExample() 
{
  tf = new TextField();
  b=new Button("click Here");
  setLayout(null);  
  tf.setBounds(50,50,150,20);
  b.setBounds(100,150,60,30);
  add(b);	
  add(tf);
  setSize(300, 350);
  setVisible(true);
  b.addActionListener(this);
// window closing code
}
public void actionPerformed(ActionEvent e)
  {	
    tf.setText(" Hello CSE & IT Students ");	
  }
public static void main(String args[])

     {	
      new ButtonExample();
     }
}
