package Ex01;

public class Sith extends Seres{
	protected float raiva;
	private Academia Acad;
	protected Poderes Poder; //pode-se adquirir poderes e raiva
	
	public Academia getAcad() {
		return Acad;
	}
	public void setAcad(Academia acad) {
		Acad = acad;
	}
	public Poderes getPoder() {
		return Poder;
	}
	public void setPoder(Poderes poder) {
		Poder = poder;
	}
	public float getRaiva() {
		return raiva;
	}
	public void setRaiva(float raiva) {
		this.raiva = raiva;
	}

}
