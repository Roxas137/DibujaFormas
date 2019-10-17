package formas;

public class Rectangulo extends FormaComponent{

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	/** Rectangulo compuesto por los puntos inferior izquierdo y superior derecho.
	 * 
	 * @param x1 posicion en x del punto inferior izquierdo del rectangulo.
	 * @param y1 posicion en y del punto inferior izquierdo del rectangulo.
	 * @param x2 posicion en x del punto superior derecho del rectangulo.
	 * @param y2 posicion en y del punto superior derecho del rectangulo.
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
}
