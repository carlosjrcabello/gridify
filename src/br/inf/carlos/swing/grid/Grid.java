package br.inf.carlos.swing.grid;

/**
 * Default interface to represent all methods in {@code AlignHandler}
 * implementation.
 * 
 * @author Carlos Alberto Junior Spohr Poletto.
 */
public interface Grid {
	
	Gridify column(int column);
	
	Gridify line(int line);
}
