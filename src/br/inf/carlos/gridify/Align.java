package br.inf.carlos.gridify;

/**
 * Default interface to represent all methods in {@code AlignHandler}
 * implementation.
 * 
 * @author Carlos Alberto Junior Spohr Poletto.
 */
public interface Align {
	
	Gridify label();
	
	/**
	 * Aligns the current component to top centered.
	 * 
	 * @return
	 */
	Gridify top();
	
	/**
	 * Align the current component to top anchored to right.
	 * 
	 * @return
	 */
	Gridify topRight();
	
	/**
	 * Align the current component to top anchored to left.
	 * 
	 * @return
	 */
	Gridify topLeft();
	
	/**
	 * Aligns the current component to bottom centered.
	 * 
	 * @return
	 */
	Gridify bottom();
	
	/**
	 * Align the current component to bottom anchored to right.
	 * 
	 * @return
	 */
	Gridify bottomRight();
	
	/**
	 * Align the current component to bottom anchored to left.
	 * 
	 * @return
	 */
	Gridify bottomLeft();
	
	/**
	 * Align the current component to center of container.
	 * 
	 * @return
	 */
	Gridify centered();
	
	/**
	 * Align the current component to left.
	 * 
	 * @return
	 */
	Gridify left();
	
	/**
	 * Align the current component to right.
	 * 
	 * @return
	 */
	Gridify right();
}
