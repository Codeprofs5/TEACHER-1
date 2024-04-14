import java.awt.*;
import java.awt.event.*;
public class Mychoice extends Frame implements ItemListener
{
	private Label LbL;
	private Label LbL1;
	private TextField txt;
	private Button btn;
	String msg;
	Choice ch1;
	Font F = new Font ("Forte",Font.PLAIN,18);
	Mychoice()
	{
		setLayout(new FlowLayout());
		LbL=new Label("Enter item:-");
		LbL.setFont(F);
		add(LbL);
		txt=new TextField(20);
		txt.setFont(F);
		add(txt);
		LbL1=new Label("series this item:-");
		LbL1.setFont(F);
		add(LbL1);
		ch1=new Choice();
		ch1.add("coffee");
		ch1.add("tea");
		ch1.add("ice cream");
		add(ch1);
		ch1.addItemListener(this);
		btn=new Button("ADD");
		btn.setFont(F);
		add(btn);
		btn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		
		});
		setTitle("My choice box");
		setSize(300,300);
		setVisible(true);
	}
	public void itemstatechanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		Font StringFont = new Font("sanSerif",Font.PLAIN,18);
		g.setFont(StringFont);
		g.drawString("selectedItem:-",20,150);
		msg=ch1.getSelectedItem();
		g.drawString(msg,150,150);
	}
	public static void main(String args[])
	{
		Mychoice cs= new Mychoice();
	}
}

			
	
			

