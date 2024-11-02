package exo2;

public class Helicoptere extends Vehicule implements Flight {
	private int heureDeVol;
	public Helicoptere(String marque,int dateAchat,int prix,int heureDeVol) {
		super(marque,dateAchat,prix);
		this.heureDeVol=heureDeVol;
	}
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
	public void canFly() {
		System.out.println("l'helicoptere peut voler");
	}
	@Override
	public boolean longDistanceFlight() {
		if(this.heureDeVol<1000)
			return true;
		else
			return false;
	}

}
