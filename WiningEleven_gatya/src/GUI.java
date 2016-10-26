
import java.awt.BorderLayout;
import java.awt.Container;// 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {

	String[] Posarray = { "CF", "ST", "RWF", "LWF", "OMF", "DMF", "CMF", "LMF", "RMF", "CB", "RSB", "LSB", "GK" };
	String[] numarray = { "80", "81", "82", "83" };
	JComboBox combop = new JComboBox(Posarray);
	JComboBox combon = new JComboBox(numarray);
	JButton button = new JButton("ガチャ");
	
	
	JTextField textplayer = new JTextField();
	JTextField textclub = new JTextField();
	Container container;
	
	String position;
	String num;
	
	public GUI(){
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("ウイイレガチャ");
		this.container = getContentPane();
	    this.container.add(combop,BorderLayout.WEST);
	    this.container.add(combon,BorderLayout.EAST);
	    this.container.add(button,BorderLayout.CENTER);
	    button.addActionListener(this);
	    this.container.add(textplayer,BorderLayout.PAGE_END);
	    this.container.add(textclub,BorderLayout.NORTH);
	    this.setBounds(0,0,200,150);;
	    this.setVisible(true);		

	}
	
	public void actionPerformed(ActionEvent e){
		
		num =(String)combon.getSelectedItem();
		position = (String)combop.getSelectedItem();
		
		int num1 = Integer.parseInt(num);
		
		GetDateFromCSV2 gd = new GetDateFromCSV2();
		
		try {
			gd.GetPlayer(num1, position);
		} catch (Exception e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
		String test = gd.getPlayername();
		textplayer.setText(gd.getPlayername());
		// TODO 自動生成されたメソッド・スタブ

	}

	
	

}
