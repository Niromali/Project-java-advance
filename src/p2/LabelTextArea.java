package p2;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;

public class LabelTextArea extends LabelComponents {
	public LabelTextArea(String label,int ligne,int colonne) {
		//super(label,new JTextArea(ligne,colonne));
		super(label,new JScrollPane(new JTextArea(ligne,colonne)));
	}

	public void setText(String value) {
		JScrollPane scrollPane = (JScrollPane)getComponent(1);
		JViewport viewport = scrollPane.getViewport(); 
		JTextArea textArea = (JTextArea)viewport.getView(); 
		textArea.setText(value);
	}

	public String getText() {
		// TODO Auto-generated method stub
		JScrollPane scrollPane = (JScrollPane)getComponent(1);
		JViewport viewport = scrollPane.getViewport(); 
		JTextArea textArea = (JTextArea)viewport.getView(); 
		return textArea.getText();
	}
}
