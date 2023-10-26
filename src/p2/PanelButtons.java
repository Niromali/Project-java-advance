package p2;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelButtons extends JPanel {
	public PanelButtons(String ...etqs) {
		for (int i = 0; i < etqs.length; i++) {
			JButton btn = new JButton(etqs[i]);
			add(btn);
		}
	}
	public PanelButtons(ActionListener actionListener,String ...etqs) {
		for (int i = 0; i < etqs.length; i++) {
			JButton btn = new JButton(etqs[i]);
			btn.addActionListener(actionListener);
			add(btn);
		}
	}
	
}
