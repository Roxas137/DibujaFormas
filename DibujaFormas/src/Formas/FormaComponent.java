package Formas;

public abstract class FormaComponent {

	/** Muestra por pantalla el nombre de la clase del objeto y su posicion.
	 * 
	 */
	public void dibuja() {
		
	}
	
	/** Cambia la posicion del objeto.
	 * 
	 * @param x Desplazamiento en el eje X.
	 * @param y Desplazamiento en el eje Y.
	 */
	public void desplazaRelativo(int x, int y) {
		
	}
	
	/**
	 * 
	 * @param fc FormaComponent que se pretende anyadir.
	 */
	public void anade(FormaComponent fc) {
		
	}
	
	/** 
	 * 
	 * @param fc FormaComponent que se pretende eliminar.
	 * @return true si se ha eliminado correctamente.
	 * @return false si no se ha eliminado correctamente.
	 */
	public boolean elimina(FormaComponent fc) {
		
		return false;
	}
	
}
