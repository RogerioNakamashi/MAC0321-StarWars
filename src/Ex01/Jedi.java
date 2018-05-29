package Ex01;

public class Jedi extends Seres {
	protected Poderes Poder; //pode-se adquirir poderes e paz interna
	protected float pazInterna;
	private Academia Acad;
	
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
	public float getPazInterna() {
		return pazInterna;
	}
	public void setPazInterna(float pazInterna) {
		this.pazInterna = pazInterna;
	}
	
}
