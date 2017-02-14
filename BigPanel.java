import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class BigPanel extends JPanel{
	private JTextField jt=null;
	private JTextField ft=null;
	private TFHandler th=null;
	private JPanel keypad=null,north=null,south=null;
	private ArrayList<JButton> jb =null;
public BigPanel()
{
	super();
	this.setBackground(Color.GREEN);
	jt=new JTextField();
	ft=new JTextField(20);
	keypad=new JPanel();
	north=new JPanel();
	south=new JPanel();
	th=new TFHandler();
	jb=new ArrayList<JButton>();
	north.setBackground(new Color(235,36,72));
	for(int i=0;i<3;i++)
	{
		jb.add(new JButton("B"+i));
		
		
	}
	
	this.setLayout(new BorderLayout());
	jt.addActionListener(th);
	ft.setEditable(false);
	keypad.setLayout(new GridLayout());
	south.add(ft);
	north.add(jt);
	this.add(north,BorderLayout.NORTH);
	this.add(south,BorderLayout.SOUTH);
	this.add(keypad,BorderLayout.CENTER);
	north.add(jt);
	south.add(ft);
	jt.setEditable(true);
	jt.setText("Enter College name: ");
	jt.setDisabledTextColor(Color.gray);
	jt.setSelectedTextColor(Color.YELLOW);

	for(int i=0;i<jb.size();i++)
	{
		jb.get(i).addActionListener(th);
		keypad.add(jb.get(i));
		
		
	}

	
}
private class TFHandler implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jt)
		{
			
			ft.setText("Welcome to : "+jt.getText());
		}
		String x=e.getActionCommand();
		switch(x)
		{
		case "B0": north.setBackground(Color.black); break;
		case "B1": ft.setText(""); break;
		case "B2": System.exit(0); break;
		}
		
	}
	
}
}
