import java.awt.*;
import java.awt.event.*;
public class AwtCounter extends Frame
{
	private label LbL;
	private TextField txt;
	private Button btn;
	private Button btn1;
	private int count;
	AwtCounter()
	{
		SetLayout(new FlowLayout());
		LbL=new Label("Counter");
		add (LbL);
		txt=new TextField(Count" ",0);
		txt.SetEditable(False);
		add(txt);
		btn=new Button("count");
		add(btn);
		btn1=new Button("Reset");
		add(btn1);
		BtnCountListener Listener=new BtnCountListener();
		btn.addActionListener(Listener);
		BtnResetListener Listener1=new BtnResetListener();
		btn1.addActionListener(Listener1);
		SetTitle("Awt Counter");
		SetSize(200,100);
		SetVisible(true);
		addwindowListener(new windowAdapter()
		{
			public static windowCloning(Window-Event e)
			{
				System.exit(0);
			}
		});
		public static void main(String args[])
		{
			AwtCounter counter =new AwtCounter();
		}
		private class BtnCountListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				ttcount;
				txt.SetText(count+" ");
			}
		}
		private class BtnResetListener implements ActionListener
		{
			public void ActionPerformed(ActionEvent e)
			{
				count=0;
				txt.SetText(count+" ");
			}
		}
	}
}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		0
		