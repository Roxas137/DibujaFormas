package formas;

public class Circulo extends FormaComponent{

	private int x1;
	private int y1;
	private int radio;
	
	/** Circulo compuesto por la posicion del centro y el radio.
	 * 
	 * @param x1 posicion en x del centro.
	 * @param y1 posicion en y del centro.
	 * @param radio radio del circulo.
	 */
	public Circulo(int x1, int y1, int radio) {
		this.x1=x1;
		this.y1=y1;
		this.radio=radio;
	}
}
