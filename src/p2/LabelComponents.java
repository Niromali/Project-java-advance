package p2;

import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class LabelComponents extends JPanel {
	private String etiquette;
	public LabelComponents(String etq,JComponent component) {
		super(new FlowLayout(FlowLayout.LEFT));
		JLabel label=new JLabel(etq);
		add(label);
		add(component);
		this.setEtiquette(etq);
	}
	public LabelComponents(String etq) {
		super(new FlowLayout(FlowLayout.LEFT));
		JLabel label=new JLabel(etq);
		add(label);
		
	}
	public LabelComponents() {
		super(new FlowLayout(FlowLayout.LEFT));
	}
	public String getEtiquette() {
		return etiquette;
	}
	public void setEtiquette(String etiquette) {
		this.etiquette = etiquette;
	}
	
}
