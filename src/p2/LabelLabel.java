package p2;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabelLabel extends LabelComponents {
	public LabelLabel(String label,String value) {
		super(label,new JLabel(value));
		
	}
	public void setText(String value) {
		JLabel label=(JLabel)getComponent(1);
		label.setText(value);
	}
	public String getText() {
		// TODO Auto-generated method stub
		JLabel label=(JLabel)getComponent(1);
		return label.getText();
	}
}
