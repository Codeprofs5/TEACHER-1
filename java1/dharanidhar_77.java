import java.awt.*;
import java.awt.event.*;
public class AwtCounter extends Frame
{
	private Label LbL;
	private TextField txt;
	private Button btn;
	private Button btn1;
	private int count;
	AwtCounter()
	{
		setLayout(new FlowLayout());
		LbL=new Label("Counter");
		add (LbL);
		txt=new TextField(count+" ",0);
		txt.setEditable(false);
		add(txt);
		btn=new Button("count");
		add(btn);
		btn1=new Button("Reset");
		add(btn1);
		BtnCountListener Listener=new BtnCountListener();
		btn.addActionListener(Listener);
		BtnResetListener Listener1=new BtnResetListener();
		btn1.addActionListener(Listener1);
		setTitle("Awt Counter");
		setSize(200,100);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
		public static void main(String args[])
		{
			AwtCounter counter =new AwtCounter();
		}
		private class BtnCountListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				++count;
				txt.setText(count+" ");
			}
		}
		private class BtnResetListener implements ActionListener
		{
			public void ActionPerformed(ActionEvent e)
			{
				count=0;
				txt.setText(count+" ");
			}
		}
}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		