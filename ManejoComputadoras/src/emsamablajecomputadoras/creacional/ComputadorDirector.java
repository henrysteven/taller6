package emsamablajecomputadoras.creacional;

public class ComputadorDirector {
	protected ComputadorBuilder builder;
	
	public ComputadorDirector(ComputadorBuilder builder) {
		this.builder=builder;
	}
	
	public void construirComputador() {
		builder.definirComputador();
		builder.definirExtrar();
		builder.definirMainboard();
		builder.definirSistemaOperativo();
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
}
