package Cse513;
import java.awt.*;
import java.awt.event.*;

public class FlowLayoutExample {
	
	Frame f;
	FlowLayoutExample(){
		f = new Frame("Flwol");
		
		Button b1 = new Button("India");
		Button b2 = new Button("Australia");
		Button b3 = new Button("America");
		Button b4 = new Button("Italy");
		f.setLayout(new FlowLayout(FlowLayout.RIGHT));
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
		new FlowLayoutExample();
	}

}
