
import java.awt.BorderLayout;
import java.awt.Container;// 

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI extends JFrame {

	String[] Posarray = { "FW", "ST", "RWF", "LWF", "OMF", "DMF", "CMF", "LMF", "RMF", "CB", "RSB", "LSB", "GK" };
	String[] numarray = { "80", "81", "82", "83" };
	JComboBox combop = new JComboBox(Posarray);
	JComboBox combon = new JComboBox(numarray);
	JButton button = new JButton("ガチャ");
	JTextField textplayer = new JTextField();
	JTextField textclub = new JTextField();
	Container container;
	
	public GUI(){
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("ウイイレガチャ");
		this.container = getContentPane();
	    this.container.add(combop,BorderLayout.WEST);
	    this.container.add(combon,BorderLayout.EAST);
	    this.container.add(button,BorderLayout.CENTER);
	    this.container.add(textplayer,BorderLayout.PAGE_END);
	    this.container.add(textclub,BorderLayout.NORTH);
	    this.setBounds(0,0,200,150);;
	    this.setVisible(true);		
		
		/*JFrame frame = new JFrame();
		
		
		//フレームの作成
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setBounds(10, 10, 300, 200);
		  frame.setTitle("タイトル");
	      frame.setVisible(true);
		    
	      JPanel p = new JPanel();
		    p.add(combop);
		    p.add(combon);
		    p.add(button);
		    p.add(labelplayer);
		    p.add(labelclub);
		    
		    getContentPane().add(p,BorderLayout.CENTER);*/
		    
	}

}
