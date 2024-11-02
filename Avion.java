package exo2;

public class Avion extends Vehicule implements Flight {
	private int heureVol;
	//const
	public Avion(String marque,int dateAchat,int prix,int heuresVol) {
		super(marque,dateAchat,prix);
		this.heureVol=heureVol;
	}
	//setters
	public void setHeureVol(int heureVol) {
		this.heureVol=heureVol;
	}
	//getters
	public int getHeureVol() {
		return heureVol;
	}
	@Override
	public void canFly() {
		System.out.println("'l'avion peut voler");
	}

	@Override
	public boolean longDistanceFlight() {
		if(heureVol<1000)
			return true;
		else
			return false;
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

}
