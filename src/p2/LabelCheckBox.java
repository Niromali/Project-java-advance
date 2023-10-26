package p2;


import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class LabelCheckBox extends LabelComponents {
	public LabelCheckBox(String label , String ...data) {
		super(label);
		for (int i = 0; i < data.length; i++) {
			JCheckBox chbox = new JCheckBox(data[i]);
			add(chbox);
		}
		
	}

	public void setSelectedOption(String ...value) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList(value);  
		//List list=Array.as 
		for(int i=1;i<getComponents().length;i++) {
			JCheckBox chbox=(JCheckBox)getComponent(i);
			if(list.contains(chbox.getText()))
					chbox.setSelected(true);
				
			}
			
		
	}

	public List<String> getSelectedOptions() {
		List<String> values = new Vector<String>();
		for(int i=1;i<getComponents().length;i++) {
			JCheckBox checkbox=(JCheckBox)getComponent(i);
			if (checkbox.isSelected()) {
				values.add(checkbox.getText());
			}
		}
		return values;
	}
}
