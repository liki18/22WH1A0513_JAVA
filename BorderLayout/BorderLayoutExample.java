package Cse513;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample {
	BorderLayoutExample(){
	   Frame f = new Frame("Border Layout");
		
		Button b1 = new Button("India");
		Button b2 = new Button("Australia");
		Button b3 = new Button("America");
		Button b4 = new Button("Italy");
		Button b5 = new Button("Home");
		f.setLayout(new BorderLayout());
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		f.add(b5, BorderLayout.CENTER);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new BorderLayoutExample();
	}

}
