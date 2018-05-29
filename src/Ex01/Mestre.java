package Ex01;

public class Mestre extends Jedi{
	private boolean imortal;
	
	private int videncia; //anos-luz
	private int HP;
	
	public Golpes[] golpes = new Golpes[3];
	
	private static int index = 0;
	
	public void addGolpe(Golpes novo) {
		if(index>golpes.length) {
			System.out.println("Numero maximo de golpes extrapolado.");
			return;
		} else {
			this.golpes[index++] = novo;
		}
	}
	
	public Mestre(int hP) {
		setHP(hP);
	}
	
	public boolean isImortal() {
		return imortal;
	}
	public void setImortal(boolean imortal) {
		this.imortal = imortal;
	}
	public int getVidencia() {
		return videncia;
	}
	public void setVidencia(int videncia) {
		this.videncia = videncia;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}
	
}
