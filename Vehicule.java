package exo2;

import exo3.Vehicule;

public abstract class Vehicule {
	//attributs
		private String marque;
		private int prix,dateAchat;
		//constructeur
		public Vehicule(String marque,int dateAchat,int prix) {
			this.marque=marque;
			this.prix=prix;
			this.dateAchat=dateAchat;
		}
		//setters
		public void setMarque(String marque) {
			this.marque=marque;
		}
		public void setPrix(int prix) {
			this.prix=prix;
		}
		public void setDate(int dateAchat) {
			this.dateAchat=dateAchat;
		}
		//getters
		public String getMarque() {
			return marque;
		}
		public int getPrix() {
			return prix;
		}
		public int getDate() {
			return dateAchat;
		}
		//methodes
		public abstract void afficher();
		public abstract double calculPrix();
		@Override
		public abstract boolean equals(Object v);
}
