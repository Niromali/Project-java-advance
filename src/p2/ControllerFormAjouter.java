package p2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ControllerFormAjouter implements ActionListener {
	private Form form;
	public ControllerFormAjouter(Form form) {
		// TODO Auto-generated constructor stub
		this.form=form;
	}

	public ControllerFormAjouter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b.getText().equals("Quitter"))
		System.exit(0);
		else if(b.getText().equals("Vider")) {
			System.out.println("Vider");
			form.setTextv2("Nom :","");
			form.setTextv2("prenom :","");
		}
		else if(b.getText().equals("Afficher")) {
			
			System.out.println("Nom : "+form.getTextv2("Nom :"));
			System.out.println("Prenom : "+form.getTextv2("prenom :"));
			System.out.println("Genre : "+form.getSelectedOption("Genre :"));
			System.out.println("Ville : "+form.getSelectedItem("Ville :"));
			System.out.println("Pays : "+form.getSelectedItems("Pays :"));
			System.out.println("Loisirs : "+form.getSelectedOptions("Loisirs :"));
			System.out.println("Adresse : "+form.getValueTextArea("Adresse :"));
			System.out.println("Prix : "+form.getValue("Prix :"));
		}
	}
		

}
