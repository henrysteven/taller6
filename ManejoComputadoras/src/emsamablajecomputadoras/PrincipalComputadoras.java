/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.creacional.*;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Necesito ensamblar 2 computadoras
		// AsusROGE
		ComputadorDirector directorRoge = new ComputadorDirector(new AsusROGE());
		directorRoge.construirComputador();
		Computador roge = directorRoge.getComputador();
	
		// AsusZenbook
		ComputadorDirector directorZenbook = new ComputadorDirector(new AsusZenbook());
		directorZenbook.construirComputador();
		Computador zenbook = directorZenbook.getComputador();
		
		//Mostrar las caracteristicas de ambas computadoras 
		System.out.print(roge.toString());
		System.out.print(zenbook.toString());
		

	}

}
