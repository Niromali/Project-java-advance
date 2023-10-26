package p2;

public class Produit {
private String reference;
private String designation;
private int quantite;
private float prix;

	public Produit() {
		reference = "";
		designation = "";
		quantite = 0;
		prix = 0;
	}
	
	public Produit(String reference,String designation,int quantite, float prix) {
		this.reference = reference;
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
	}
	
	public String getReference() {
		return reference;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public int getQuantite() {
		return quantite;
	}
	
	public Float getPrix() {
		return prix;
	}
	
	public void setReference(String reference) {
		this.reference = reference;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public void setPrix(float prix ){
		this.prix = prix;
	}
	
	public String toString() {
		return "Produit[Reference = "+reference +", Designation = "+designation+", Quantite = "+quantite+", Prix = "+prix+"]";
	}


	public boolean equals(Produit produit) {
		if(produit.reference.equals(reference)) {
		//or if(reference.equals(produit.reference))
			return true;
		}
		return false;
	}
	
	public void modifierProduit(String reference, String designation, float prix, int quantite) {
		if (this.reference == reference) {
			this.designation = designation;
			this.prix = prix;
			this.quantite = quantite;
		}	
	}
	
	
	public void supprimerProduit(String reference) {
		if (this.reference == reference) {
			reference = null;
		}
	}
	
	
	
	public String rechercherProduit(String reference) {
		if (this.reference == reference) {
			return "Produit[Reference = "+reference +", Designation = "+designation+", Quantite = "+quantite+", Prix = "+prix+"]";
		}
			return "Produit introuvable";
		}
	
	
	
	
	
}
