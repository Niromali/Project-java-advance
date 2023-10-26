package p2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ControllerGestionProduit implements ActionListener{
	private Form form;
	private Stock stock;
	private DefaultTableModel model;
	public ControllerGestionProduit(Form form,Stock stock,DefaultTableModel model) {
		// TODO Auto-generated constructor stub
		this.form=form;
		this.stock=stock;
		
		this.model=model;
	}

	public ControllerGestionProduit() {
		// TODO Auto-generated constructor stub
	}
	private void reset() {
		form.setTextv2("Reference :","");
		form.setTextv2("Designation :","");
		form.setTextv2("Prix :","");
		form.setTextv2("Quantite :","");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		if(b.getText().equals("Quitter"))
		System.exit(0);
		else if(b.getText().equals("Effacer")) {
			reset();
		}
		else if(b.getText().equals("Afficher")) {
			stock.lister();
		}
		else if(b.getText().equals("Ajouter")) {
			Produit produit = new Produit();
			produit.setReference(form.getTextv2("Reference :"));
			produit.setDesignation(form.getTextv2("Designation :"));
			produit.setPrix(Float.parseFloat(form.getTextv2("Prix :")));
			produit.setQuantite(Integer.parseInt(form.getTextv2("Quantite :")));
			int r=stock.ajouterProduit(produit);
			if( r == 1) {
			    Object[] row = {produit.getReference(), produit.getDesignation(), produit.getPrix(), produit.getQuantite()};
		        model.addRow(row);
				System.out.println("ajouté");
			}else {
				int rowIndex = -1;
				for (int i = 0; i < model.getRowCount(); i++) {
				    if (model.getValueAt(i, 0).equals(produit.getReference())) {
				        rowIndex = i;
				        break;
				    }
				}
				if (rowIndex != -1) {
					model.setValueAt((Integer) model.getValueAt(rowIndex, 3)+produit.getQuantite(), rowIndex, 3);
				}
				System.out.println("modification de quantite");
			}
			reset();
		}
		else if(b.getText().equals("Rechercher")) {
			Produit produit = stock.getProduit(form.getTextv2("Reference :"));
			form.setTextv2("Designation :",produit.getDesignation());
			form.setTextv2("Prix :",produit.getPrix()+"");
			form.setTextv2("Quantite :",produit.getQuantite()+"");
			
		}
		else if(b.getText().equals("Modifier")) {
			Produit produit = new Produit();
			produit.setReference(form.getTextv2("Reference :"));
			produit.setDesignation(form.getTextv2("Designation :"));
			produit.setQuantite(Integer.parseInt(form.getTextv2("Quantite :")));
			produit.setPrix(Float.parseFloat(form.getTextv2("Prix :")));
			int r=stock.modifier(form.getTextv2("Ans Reference :"),produit);
			if(r==0)System.out.println("Produit n'exist pas");
			else if(r==1) {
				int rowIndex = -1;
				for (int i = 0; i < model.getRowCount(); i++) {
				    if (model.getValueAt(i, 0).equals(form.getTextv2("Ans Reference :"))) {
				        rowIndex = i;
				        break;
				    }
				}
				if (rowIndex != -1) {
					model.setValueAt(produit.getReference(), rowIndex, 0);
					model.setValueAt(produit.getDesignation(), rowIndex, 1);
					model.setValueAt(produit.getPrix(), rowIndex, 2);
					model.setValueAt(produit.getQuantite(), rowIndex, 3);
				}
				System.out.println("Produit Modifier");
			}
			else {
				System.out.println("Modification de quantite");
			}
		}
	}
		

}
