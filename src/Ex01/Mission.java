package Ex01;

public class Mission {
	private String name;
	private String objetivo;
	private Planeta[] Planetas = new Planeta[100];
	private Seres[] SeresEnvolvidos = new Seres[100];
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Planeta[] getPlanetas() {
		return Planetas;
	}
	public void setPlanetas(Planeta[] planetas) {
		Planetas = planetas;
	}
	public Seres[] getSeresEnvolvidos() {
		return SeresEnvolvidos;
	}
	public void setSeresEnvolvidos(Seres[] seresEnvolvidos) {
		SeresEnvolvidos = seresEnvolvidos;
	}
	public String getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
}
