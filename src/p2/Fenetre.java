package p2;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	public static final boolean VISIBLE = true;
	public static final boolean HIDDEN = false;
	public Fenetre(String titre,int width,int height,boolean visibility,JPanel panel) {
		super(titre);
		setSize(width, height);
		setContentPane(panel);

		setVisible(visibility);
	}
}
