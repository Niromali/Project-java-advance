package p2;

import java.util.Vector;

public class Stock implements GestionProduit{
	
	private Vector<Produit> produits;
	
	public Vector<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Vector<Produit> produits) {
		this.produits = produits;
	}

	public Stock() {
		produits = new Vector<Produit>();
		Produit p1=new Produit("r1","clavier",30,80);
		Produit p2=new Produit("r2","souris",50,100);
		Produit p3=new Produit("r3","pc",1500,90);
		Produit p4=new Produit("r4","ecran",200,40);
		produits.add(p1);
		produits.add(p2);
		produits.add(p3);
		produits.add(p4);
	}
	
	public int ajouterProduit(Produit produit) {
		Produit pa=getProduit(produit.getReference());
		if (pa != null) {
			pa.setQuantite(pa.getQuantite()+produit.getQuantite());
			return 2;
		}
		produits.add(produit);
		return 1;
	}
	
	public void lister(){
		for(int i = 0; i <produits.size();i++) {
			Produit p = produits.get(i);
			System.out.println(p);
		}
		
		
	}
	public int nbProduit() {
		return produits.size();
	}
	
	public Produit getProduit(String reference) {
		for(int i = 0; i <produits.size();i++) {
			Produit p = produits.get(i);
			if (reference.equalsIgnoreCase(p.getReference())) {
				return p;
			}
		}
		return null;
	}
	
	public int getPosition(String reference) {
		for(int i = 0; i <produits.size();i++) {
			Produit p = produits.get(i);
			if (reference.equalsIgnoreCase(p.getReference())) {
				return i;
			}
		}
		return -1;
	}

	public int supprimerProduit(String reference) {
		int poss=getPosition(reference);
		if (poss == -1) {
			return 0;
		}
		produits.remove(poss);
		return 1;
	}

	public int modifier(String ref, Produit produit) {
		Produit pr=getProduit(ref);
		if(pr!=null) {
			supprimerProduit(ref);
			return ajouterProduit(produit);
		}
		return 0;
	}
	
}
