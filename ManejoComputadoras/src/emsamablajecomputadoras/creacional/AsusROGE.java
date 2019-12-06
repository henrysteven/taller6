package emsamablajecomputadoras.creacional;

public class AsusROGE extends ComputadorBuilder{

	@Override
	public void definirComputador() {
		com = new Computador();
		com.marca = "Asus";
		com.modelo="ROG";
		com.tipoRam= "ddr4";
		com.ram=32;
		com.almacenamiento = 1000;
		com.tipoAlmacenamiento = "HDD";
		
		
		
	}

	@Override
	public void definirMainboard() {
		com.placa = new Mainboard("Strix", "x99");
		
	}

	@Override
	public void definirSistemaOperativo() {
		com.os = new SistemaOperativo("Windows 10 ", 64, "PRO");
		
	}

	@Override
	public void definirExtrar() {
		com.coolerExterno=false;
		
		
	}
	
	
	
	
	

	
	

}
