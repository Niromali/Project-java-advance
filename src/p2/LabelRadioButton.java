package p2;

import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class LabelRadioButton extends LabelComponents {
	public LabelRadioButton(String label,String ...data) {
		super(label);
		ButtonGroup bg = new ButtonGroup();
		for (int i = 0; i < data.length; i++) {
			JRadioButton radiob = new JRadioButton(data[i]);
			bg.add(radiob);
			add(radiob);
		}
	}

	public void setSelectedOption(String value) {
		// TODO Auto-generated method stub
		for(int i=1;i<getComponents().length;i++) {
			JRadioButton jRadioButton=(JRadioButton)getComponent(i);
			if(jRadioButton.getText().equals(value)) {
				jRadioButton.setSelected(true);
				return ;
			}
		}
		
	}

	public String getSelectedOption() {
		for(int i=1;i<getComponents().length;i++) {
			JRadioButton jRadioButton=(JRadioButton)getComponent(i);
			if (jRadioButton.isSelected()) {
				return jRadioButton.getText();
			}
		}
		return null;
	}
}
