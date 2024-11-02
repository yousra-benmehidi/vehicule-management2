package exo2;

public class Voiture extends Vehicule implements Driving {
	//attributs
		private int nbrPortes, puissance, kilometrage;
		//constructeur
		public Voiture(String marque,int dateAchat,int prix, int nbrPortes,int puissance, int kilometrage) {
			super(marque,dateAchat,prix);
			this.nbrPortes=nbrPortes;
			this.puissance=puissance;
			this.kilometrage=kilometrage;
		}
		//setters
		public void setNbrPortes(int nbrPortes) {
			this.nbrPortes=nbrPortes;
		}
		public void setPuissance(int puissance) {
			this.puissance=puissance;
		}
		public void setKilometrage(int kilometrage) {
			this.kilometrage=kilometrage;
		}
		//getters
		public int getNbrPortes() {
			return  nbrPortes;
		}
		public int getPuissance() {
			return puissance;
		}
		public int getKilometrage() {
			return kilometrage;
		}
		//redef
	
	@Override
	public void afficher() {
		System.out.println("marque: "+this.getMarque()+"\ndate d'achat du vehicule: "+this.getDate()+"\nprix du vehicule: "+this.getPrix());
	}

	@Override
	public double calculPrix() {
		int d=2023-this.getDate();
		if(d!=0) {
			return this.getPrix()-this.getPrix()*0.05*d;
		}
		else
			return this.getPrix();
	}

	@Override
	public boolean equals(Object c) {
		if(this==c)
			return true;
		if(c==null||this.getClass()!=c.getClass())
			return false;
		Vehicule v = (Vehicule)c;
		if(this.getPrix()!=v.getPrix())
			return false;
		if(this.getMarque().equals(v.getMarque()))
			return false;
		if(this.getDate()!=v.getDate())
			return false;
		else
			return true;
		
	}
	@Override
	public void roadDriving() {
		System.out.println("la voiture a la possibilité de se déplacer sur des routes");
	}

}
