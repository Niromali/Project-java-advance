package p2;

import javax.swing.JComboBox;

public class LabelComboBox extends LabelComponents {
	public LabelComboBox(String label,String ...data ) {
		// TODO Auto-generated constructor stub
		super(label,new JComboBox<String>(data));
	}

	public void setSelectedItem(String value) {
		// TODO Auto-generated method stub
		JComboBox<String> combo = (JComboBox)getComponent(1);
		combo.setSelectedItem(value);
	}

	public String getSelectedItem() {
		// TODO Auto-generated method stub
		JComboBox<String> combo = (JComboBox)getComponent(1);
		return (String)combo.getSelectedItem();
	}
}
