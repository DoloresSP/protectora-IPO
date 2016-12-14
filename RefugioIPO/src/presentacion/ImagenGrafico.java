package presentacion;

import java.io.Serializable;

import java.awt.Image;


public class ImagenGrafico extends ObjetoGrafico implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9065237484317288730L;
	private Image imagen;
	
	public ImagenGrafico(int x, int y, Image imagen) {
		super (x, y);
		this.imagen = imagen;
	}
	
	public void setImagen(Image imagen) {this.imagen = imagen;}
	public Image getImagen() {return imagen;}
}