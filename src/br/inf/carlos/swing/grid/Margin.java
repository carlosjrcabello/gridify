package br.inf.carlos.swing.grid;

/**
 * Default interface to represent all methods in {@code MarginHandler}
 * implementation.
 * 
 * @author Carlos Alberto Junior Spohr Poletto.
 */
public interface Margin {

	/**
	 * Sets all margins values to target component.
	 * 
	 * @param top
	 * @param left
	 * @param bottom
	 * @param right
	 * @return
	 */
	Gridify margin(int top, int left, int bottom, int right);
	
	/**
	 * Sets the top margin.
	 * 
	 * @param top
	 * @return
	 */
	Gridify top(int top);
	
	/**
	 * Sets the bottom margin.
	 * @param bottom
	 * @return
	 */
	Gridify bottom(int bottom);
	
	/**
	 * Sets the left margin.
	 * @param left
	 * @return
	 */
	Gridify left(int left);
	
	/**
	 * Sets the right margin.
	 * @param right
	 * @return
	 */
	Gridify right(int right);
}
