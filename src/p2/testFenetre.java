package p2;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class testFenetre {

	public testFenetre() {
			Form03();
		
	}
	private void Form03() {
	    Form f = new Form();
	    
	    
	    String[] columns = {"Reference", "Designation", "Prix", "Quantite"};
	    DefaultTableModel model = new DefaultTableModel(columns, 0);
	    JTable table = new JTable(model);
	    Stock stock = new Stock();
	    for (Produit produit : stock.getProduits()) {
	        Object[] row = {produit.getReference(), produit.getDesignation(), produit.getPrix(), produit.getQuantite()};
	        model.addRow(row);
	    }
	    //table.setModel(model);
	    JScrollPane scrollPane = new JScrollPane(table);
	    f.add(scrollPane);
	    f.addLabelTextField("Ans Reference :",10);
	    f.addLabelTextField("Reference :",10);
	    f.addLabelTextField("Designation :",10);
	    f.addLabelTextField("Prix :",10);
	    f.addLabelTextField("Quantite :",10);
	    ControllerGestionProduit cfa = new ControllerGestionProduit(f,stock,model);
	    f.addPanelButtons(cfa,"Quitter","Effacer","Ajouter","Rechercher","Afficher","Modifier");
	    Fenetre fenetre = new Fenetre("titre", 600, 500, Fenetre.VISIBLE, f);
	}
	public void Form02() {
		Form form=new Form();
		form.addLabelTextField("Nom :", 10);
		form.addLabelTextField("prenom :", 10);
		form.addLabelRadioButton("Genre :","Masculin","Feminin");
		form.addLabelComboBox("Ville :","Fes","Rabat","Meknes","Tanger","Casablanca");
		form.addLabelList("Pays :",5,"Maroc","France","Espagne","USA","UK","Deutshland","Colombia","Gabon");
		form.addLabelCheckBox("Loisirs :","Foot","Natation","Coding","Voyage");
		form.addLabelTextArea("Adresse :", 3, 25);
		form.addLabelLabel("Prix :", "20 Dhs");
		
		form.setText("Nom","sd");
		form.setText("prenom","pppp");
		ControllerFormAjouter cfa=new ControllerFormAjouter(form);
		form.addPanelButtons(cfa,"Quitter","Vider","Afficher");
		
		Fenetre fenetre=new Fenetre("titre", 500, 900, Fenetre.VISIBLE, form);
		
	}
	public void Form01() {
		Form form=new Form();
		form.addLabelTextField("Nom :", 10);
		form.addLabelTextField("prenom :", 10);
		ControllerFormAjouter cfa=new ControllerFormAjouter();
		form.addPanelButtons(cfa,"Quitter");
		
		
		Fenetre fenetre=new Fenetre("titre", 500, 300, Fenetre.VISIBLE, form);
	}
	public void exp20(){
		LabelCheckBox lcom=new LabelCheckBox("Loisirs","Natation","Coding","Voyage");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, lcom);
		lcom.setSelectedOption("Natation","Voyage");
		
		System.out.println(lcom.getSelectedOptions());
	}
	public void exp19(){
		LabelList lcom=new LabelList("Pays",3,"Maroc","France","USA");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, lcom);
		lcom.setSelectedItems("Maroc","France");
		
		System.out.println(lcom.getSelectedItems());
	}
	public void exp18() {
		LabelRadioButton lcom=new LabelRadioButton("Ville","Masculin","Feminin");
		lcom.setSelectedOption("Feminin");
		String s=lcom.getSelectedOption();
		System.out.println(s);
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, lcom);
	}
	public void exp17() {
		LabelComboBox lcom=new LabelComboBox("Ville","Fes","Rabat","Casa","Tanger");
		lcom.setSelectedItem("Rabat");
		String s=lcom.getSelectedItem();
		System.out.println(s);
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, lcom);
	}
	public void exp16() {
		LabelTextArea tf=new LabelTextArea("Adresse:", 5,20);
		tf.setText("Text Texex"
				+ "xt Text Text Text Text"
				+ " Text Text Text ");
		String s=tf.getText();
		System.out.println(s);
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, tf);
		
	}
	public void exp15() {
		LabelLabel tf=new LabelLabel("Prix :","15 Dhs");
		tf.setText("20 DHs");
		String s=tf.getText();
		System.out.println(s);
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, tf);
		
	}
	public void exp14() {
		LabelTextField tf=new LabelTextField("Nom:", 10);
		tf.setText("hassan");
		String s=tf.getText();
		System.out.println(s);
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, tf);
		
	}
	
	public void exp13() {
		LabelCheckBox lcom=new LabelCheckBox("loisirs :","Foot","Swim","Dev");
		lcom.setSelectedOption("Dev","Swim");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, lcom);
		
	}
	public void exp12() {
		LabelRadioButton lcom=new LabelRadioButton("Genre :","Masculin","Feminin");
		lcom.setSelectedOption("Masculin");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, lcom);
		
	}
	public void exp11() {
		LabelList lcom=new LabelList("Pays:",5,"Maroc","France","Espagne","Turkey","USA","UK");
		lcom.setSelectedItem("USA");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, lcom);
		
	}
	public void exp10() {
		LabelComboBox lcom=new LabelComboBox("Ville","Fes","Rabat","Casa","Tanger");
		lcom.setSelectedItem("Rabat");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, lcom);
		
	}
	public void exp9() {
		LabelTextArea tf=new LabelTextArea("Adresse:", 5,20);
		tf.setText("Text Texex"
				+ "xt Text Text Text Text"
				+ " Text Text Text ");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, tf);
		
	}
	public void exp8() {
		LabelLabel tf=new LabelLabel("Nom:", "15 000 Dhs");
		tf.setText("0 Dhs");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, tf);
		
	}
	public void exp7() {
		LabelTextField tf=new LabelTextField("Nom:", 10);
		tf.setText("ali");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, tf);
		
	}
	private void exp6() {
	FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
	//FlowLayout fl=new FlowLayout(0);
	System.out.println(0);
	}
	public void exp5() {
		Form form=new Form();
		form.addLabelTextField("Reference:", 10);
		form.addLabelTextField("designation:", 10);
		form.addLabelLabel("Prix :", "5 Dhs");
		form.addLabelTextArea("Adresse :",6,30);
		form.addLabelList("Pays",3,"Maroc","France","Espagne","Portugal","Soudan","Maroc","France","Espagne","Portugal","Soudan","Maroc","France","Espagne","Portugal","Soudan","Maroc","France","Espagne","Portugal","Soudan");
		form.addLabelComboBox("Ville:", "Fès","Mekness","casa","dsd");
		form.addLabelCheckBox("Loisirs :", "Foot","Programmation","Developpement","Foot","Programmation","Developpement","Foot","Programmation","Developpement");
		form.addLabelRadioButton("Genre : ","Masculin","Feminin");
		form.addPanelButtons("Ajouter","Modifier","Supprimer");
		Fenetre fenetre=new Fenetre("titre", 1000, 600, Fenetre.VISIBLE, form);
		
	}
	
	public void exp4() {
		JFrame f=new JFrame("titre");
		
		Form form=new Form();
		form.addLabelTextField("Reference:", 10);
		form.addLabelTextField("designation:", 10);
		form.addLabelLabel("Prix :", "5 Dhs");
		
		f.setContentPane(form);
		
		f.setSize(500,500);
		f.setVisible(true);
	}
	public void exp3() {
		JFrame f=new JFrame("titre");
		
		
		Form form=new Form();
		form.addLabelTextField("Reference:", 10);
		form.addLabelTextField("designation:", 10);
		
		f.setContentPane(form);
		
		f.setSize(500,500);
		f.setVisible(true);
	}
	public void exp2() {
		JFrame f=new JFrame("titre");
		
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		
		LabelTextField l1=new LabelTextField("Reference :", 10);
		LabelTextField l2=new LabelTextField("Designation :", 10);
		
		JPanel pb=new JPanel();
		BoxLayout boxLayout=new BoxLayout(pb, BoxLayout.Y_AXIS);
		pb.setLayout(boxLayout);
		pb.add(l1);
		pb.add(l2);
		
		JPanel pf=new JPanel(fl);
		pf.add(pb);
		
		f.setContentPane(pf);
		
		f.setSize(500,500);
		f.setVisible(true);
	}
	public void exp1() {
		JFrame f=new JFrame("Fenetre");
		
		
		
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		
		JPanel panel=new JPanel();
		panel.setLayout(fl);
		JLabel label=new JLabel("Reference :");
		JTextField textField=new JTextField(10);
		panel.add(label);
		panel.add(textField);
		
		JPanel panel1=new JPanel();
		panel1.setLayout(fl);
		JLabel label1=new JLabel("Designation :");
		JTextField textField1=new JTextField(10);
		panel1.add(label1);
		panel1.add(textField1);
		
		
		JPanel pb=new JPanel();
		BoxLayout boxLayout=new BoxLayout(pb, BoxLayout.Y_AXIS);
		pb.setLayout(boxLayout);
		pb.add(panel);
		pb.add(panel1);
		
		JPanel pf=new JPanel(fl);
		pf.add(pb);
		
		f.setContentPane(pf);
		f.setSize(500,500);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new testFenetre();
	}

}
