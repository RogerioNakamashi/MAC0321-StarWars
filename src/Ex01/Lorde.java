package Ex01;

public class Lorde extends Sith{
	
	private int videncia;
	private String nomeSith;
	private int HP;
	private Golpes[] golpes = new Golpes[3];
	
	private static int index = 0;
	
	public void addGolpe(Golpes novo) {
		if(index>golpes.length) {
			System.out.println("Numero maximo de golpes extrapolado.");
			return;
		} else {
			this.golpes[index++] = novo;
		}
	}
	
	private Mission[] Missions = new Mission[100];
	
	public Lorde(String nome, int hP) {
		this.setNomeSith(nome);
		setHP(hP);
	}
	public int getVidencia() {
		return videncia;
	}
	public void setVidencia(int videncia) {
		this.videncia = videncia;
	}
	public Mission[] getMissions() {
		return Missions;
	}
	public void setMissions(Mission[] missions) {
		Missions = missions;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public String getNomeSith() {
		return nomeSith;
	}
	public void setNomeSith(String nomeSith) {
		this.nomeSith = nomeSith;
	}
}