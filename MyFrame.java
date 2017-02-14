import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame
{
	private BigPanel bp=null;

	public MyFrame() {
		super();
		bp=new BigPanel();
		this.getContentPane().add(bp);
		this.setTitle("Stuff");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,300);
		this.setVisible(true);
		
		
	
	}

}
