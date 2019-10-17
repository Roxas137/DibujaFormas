package formas;

import java.util.ArrayList;
import java.util.List;

public class Forma extends FormaComponent{
	
	private String nombre;
	private List<FormaComponent> listaComponentes;
	
	/** Forma compuesta por distintas formas que pueden ser Circulo, Rectangulo u otra Forma.
	 * 
	 * @param nombre nombre de la forma.
	 */
	public Forma(String nombre) {
		this.nombre=nombre;
		this.listaComponentes=new ArrayList<FormaComponent>();
	}
	
	@Override
	public void dibuja() {
		System.out.println("\tFORMA (" + nombre + ") {\n");
		
		for (FormaComponent fc : listaComponentes) {
			//System.out.print("\t");
			fc.dibuja();
		}
		
		System.out.println("\t}\n");
	}
	
	@Override
	public void anade(FormaComponent fc) {
		listaComponentes.add(fc);
	}
	
	@Override
	public void desplazaRelativo(int x, int y) {
		for (FormaComponent fc : listaComponentes) {
			//System.out.println("\t");
			fc.desplazaRelativo(x,y);
		}
	}
	
	@Override
	public void elimina(FormaComponent fc) {
		listaComponentes.remove(fc);
	}
	
}
