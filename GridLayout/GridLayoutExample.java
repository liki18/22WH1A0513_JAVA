package Cse513;
import java.awt.*;
import java.awt.event.*;


public class GridLayoutExample {
	Frame f;
	GridLayoutExample(){
		f = new Frame("Flwol");
		
		Button b1 = new Button("India");
		Button b2 = new Button("Australia");
		Button b3 = new Button("America");
		Button b4 = new Button("Italy");
		f.setLayout(new GridLayout(2,2));
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
	public static void main(String args[]) {
		new GridLayoutExample();
	}

}
