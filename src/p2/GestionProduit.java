package p2;

public interface GestionProduit {
	
	public int ajouterProduit(Produit produit);
	public void lister();
	public Produit getProduit(String reference);
	public int getPosition(String reference);
	public int supprimerProduit(String reference);
	
}
