package emsamablajecomputadoras.creacional;

public abstract class ComputadorBuilder {
	protected Computador com;
	public Computador getComputador() {
		return com;}
	
	public abstract void definirComputador();
	public abstract void definirMainboard();
	public abstract void definirSistemaOperativo();
	public abstract void definirExtrar();
	

}
