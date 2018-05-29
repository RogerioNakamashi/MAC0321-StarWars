package Ex01;

public class Aprendiz extends Sith{
	public boolean constroiSabre;
	private Lorde treinador;
	public void setConstroiSabre(boolean set) {
		this.constroiSabre = set;
	}
	public Lorde getTreinador() {
		return treinador;
	}
	public void setTreinador(Lorde treinador) {
		this.treinador = treinador;
	}
}

