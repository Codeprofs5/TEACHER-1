import java.applet.Applet;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
public class mbarassign extends Applet
{
MenuBar mb;
Menu m1,m2;
MenuItem  mi1,mi2,mi3,mi4;
Frame f;
public void init()
{
f=new Frame("JAVA");
f.setVisible(true);
f.setLayout(null);
f.setSize(400,400);
mb=new MenuBar();
m1=new Menu("file");
m2=new Menu("Edit");
mi1=new MenuItem("open");
mi2=new MenuItem("close");
mi3=new MenuItem("undo");
mi4=new MenuItem("redo");
mb.add(m1);
mb.add(m2);
m1.add(mi1);
m1.add(mi2);
m2.add(mi3);
m2.add(mi4);
f.setMenuBar(mb);
}
}








	