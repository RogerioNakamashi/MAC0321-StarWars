package Ex01;

public class Planeta {
	private String Nome;
	private String Sistema;
	private String Cor;
	private double Diametro;
	
	public Planeta(String nome, String sistema, String cor, double diametro) {
		super();
		Nome = nome;
		Sistema = sistema;
		Cor = cor;
		Diametro = diametro;
	}
	public Planeta() {
		super();
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSistema() {
		return Sistema;
	}
	public void setSistema(String sistema) {
		Sistema = sistema;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public double getDiametro() {
		return Diametro;
	}
	public void setDiametro(double diametro) {
		Diametro = diametro;
	}
	
}
