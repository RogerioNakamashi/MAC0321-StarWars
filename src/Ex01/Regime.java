package Ex01;

public class Regime {
	private int AnoInstituicao;
	private int AnoDissolvido;
	private String Capital;
	private Seres Chefe_de_Estado;
	private Planeta[] Planetas = new Planeta[100];
	private int index = 0;
	
	public int getAnoInstituicao() {
		return AnoInstituicao;
	}
	public void setAnoInstituicao(int anoInstituicao) {
		AnoInstituicao = anoInstituicao;
	}
	public int getAnoDissolvido() {
		return AnoDissolvido;
	}
	public void setAnoDissolvido(int anoDissolvido) {
		AnoDissolvido = anoDissolvido;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	public Seres getChefe_de_Estado() {
		return Chefe_de_Estado;
	}
	public void setChefe_de_Estado(Seres chefe_de_Estado) {
		Chefe_de_Estado = chefe_de_Estado;
	}
	
	public void addPlaneta(Planeta novo) {
		if(index>Planetas.length) {
			System.out.println("Numero maximo de planetas extrapolado.");
			return;
		} else {
			this.Planetas[index++] = novo;
		}
	}
	
}
