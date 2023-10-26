package p2;

import java.awt.FlowLayout;
import java.util.List;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Form extends JPanel {
	private JPanel pb;
	private Hashtable<String, LabelComponents> hashtable;
	public Form() {
		super(new FlowLayout(FlowLayout.LEFT));
		pb=new JPanel();
		BoxLayout bl=new BoxLayout(pb, BoxLayout.Y_AXIS);
		pb.setLayout(bl);
		hashtable=new Hashtable<String, LabelComponents>();
		add(pb);
	}
	public void addLabelTextField(String label ,int size) {
		LabelTextField l=new LabelTextField(label, size);
		hashtable.put(label, l);
		pb.add(l);
	}
	public void addLabelLabel(String label,String value) {
		LabelLabel ll = new LabelLabel(label, value);
		hashtable.put(label, ll);
		pb.add(ll);
	}
	public void addLabelTextArea(String label, int ligne, int colonne) {
		LabelTextArea lta = new LabelTextArea(label, ligne, colonne);
		hashtable.put(label, lta);
		pb.add(lta);
	}
	public void addLabelComboBox(String label,String ...data) {
		LabelComboBox lcb = new LabelComboBox(label,data);
		hashtable.put(label, lcb);
		pb.add(lcb);
	}
	public void addLabelList(String label,int visibleRowCount, String ...data) {
		LabelList llist = new LabelList(label,visibleRowCount,data);
		hashtable.put(label, llist);
		pb.add(llist);
	}
	public void addLabelCheckBox(String label,String ...data) {
		LabelCheckBox lchbox  = new LabelCheckBox(label, data);
		hashtable.put(label, lchbox);
		pb.add(lchbox);
	}
	public void addLabelRadioButton(String label,String ...data) {
		LabelRadioButton lrb = new LabelRadioButton(label,data);
		hashtable.put(label, lrb);
		pb.add(lrb);
	}
	public void addPanelButtons(String ...data) {
		PanelButtons btn = new PanelButtons(data);
		pb.add(btn);
	}
	public void addPanelButtons(ActionListener actionListener ,String ...data) {
		PanelButtons btn = new PanelButtons(actionListener,data);
		pb.add(btn);
	}
	public void setText(String etq, String value) {
		for(int i=0;i<pb.getComponents().length;i++) {
			LabelComponents lc=(LabelComponents)pb.getComponent(i);
			if( lc instanceof LabelTextField) {
				if(lc.getEtiquette().contains(etq)) {
					LabelTextField ltf=(LabelTextField)lc;
					ltf.setText(value);
					return ;
				}
			}
		}
		
	}
	public String getText(String etq) {
		for(int i=0;i<pb.getComponents().length;i++) {
			LabelComponents lc=(LabelComponents)pb.getComponent(i);
			if( lc instanceof LabelTextField) {
				if(lc.getEtiquette().contains(etq)) {
					LabelTextField ltf=(LabelTextField)lc;
					return ltf.getText();
				}
			}
		}
		return null;
	}
	public String getValueTextArea(String etq) {
		LabelTextArea lrb = (LabelTextArea)hashtable.get(etq);
		return lrb.getText();
	}
	public String getTextv2(String etq) {
		
		LabelTextField lt=(LabelTextField)hashtable.get(etq); 
		return lt.getText();
	}
	public String getSelectedItem(String etq) {
		LabelComboBox lrb = (LabelComboBox)hashtable.get(etq);
		return lrb.getSelectedItem();
	}
	public List<String> getSelectedItems(String etq) {
		LabelList lrb = (LabelList)hashtable.get(etq);
		return lrb.getSelectedItems();
	}
	public String getSelectedOption(String etq) {
		
		LabelRadioButton lrb = (LabelRadioButton)hashtable.get(etq);
		return lrb.getSelectedOption();
	}
	public List<String> getSelectedOptions(String etq) {
		
		LabelCheckBox lrb = (LabelCheckBox)hashtable.get(etq);
		return lrb.getSelectedOptions();
	}
	public void setTextv2(String etq, String value) {
		LabelTextField lt=(LabelTextField)hashtable.get(etq); 
		lt.setText(value);
	}
	public String getValue(String etq) {
		// TODO Auto-generated method stub
		LabelLabel lt=(LabelLabel)hashtable.get(etq); 
		return lt.getText();
	}
	
}
