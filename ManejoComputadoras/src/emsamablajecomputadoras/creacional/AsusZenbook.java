package emsamablajecomputadoras.creacional;



public class AsusZenbook extends ComputadorBuilder{

	@Override
	public void definirComputador() {
		com = new Computador();
		com.marca = "Asus";
		com.modelo="Zenbook";
		com.tipoRam= "ddr3";
		com.ram=16;
		com.almacenamiento = 500;
		com.tipoAlmacenamiento = "SSD";
		
		
		
	}

	@Override
	public void definirMainboard() {
		com.placa = new Mainboard("Prime", "Z370");
		
	}

	@Override
	public void definirSistemaOperativo() {
		com.os = new SistemaOperativo("Windows 10 ", 64, "Home");
		
	}

	@Override
	public void definirExtrar() {
		com.coolerExterno=false;
				
	}

}
