import java.applet.Applet;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.TextField;
public class calculator extends Applet implements ActionListener
{ int x,y;
String msg="";
TextField t1,t2,t3;
Button b1,b2,b3,b4,b5;
public void init()
{
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("ADD" );
b2=new Button("SUB");
b3=new Button("MUL");
b4=new Button("DIV");
b5=new Button("MOD");
add(t1);
add(t2);
add(t3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int x = Integer.parseInt(t1.getText());
int y = Integer.parseInt(t2.getText());
int sum = x+y;
t3.setText(""+sum);
}
else if(e.getSource()==b2)
{
int x = Integer.parseInt(t1.getText());
int y = Integer.parseInt(t2.getText());
int sub = x-y;
t3.setText(""+sub);
}
else if(e.getSource()==b3)
{
int x = Integer.parseInt(t1.getText());
int y = Integer.parseInt(t2.getText());
int mul = x*y;
t3.setText(""+mul);
}
else if(e.getSource()==b4)
{
int x = Integer.parseInt(t1.getText());
int y = Integer.parseInt(t2.getText());
int div = x/y;
t3.setText(""+div);
}
else if(e.getSource()==b5)
{
int x = Integer.parseInt(t1.getText());
int y = Integer.parseInt(t2.getText());
int mod = x%y;
t3.setText(""+mod);
}
showStatus("Text & Button Example");
repaint();
}
}