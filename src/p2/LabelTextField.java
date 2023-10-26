package p2;

import javax.swing.JComponent;
import javax.swing.JTextField;

public class LabelTextField extends LabelComponents {
	public LabelTextField(String label,int size) {
		super(label,new JTextField(size));
		
	}

	public void setText(String value) {
		JTextField t=(JTextField)getComponent(1);
		t.setText(value);
	}

	public String getText() {
		// TODO Auto-generated method stub
		JTextField t=(JTextField)getComponent(1);
		return t.getText();
	}
	
}
