package Cse513;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample implements ActionListener {
	Frame f;
	CardLayout c = new CardLayout();
	CardLayoutExample(){
		f = new Frame();
		
		Button b1 = new Button("India");
		Button b2 = new Button("Australia");
		Button b3 = new Button("America");
		Button b4 = new Button("Italy");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		f.setLayout(c);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		c.next(f);
	}
	public static void main(String args[]) {
		new CardLayoutExample();
	}

}
