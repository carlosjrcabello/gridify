package br.inf.carlos.gridify;

/**
 * Default interface to represent all methods in {@code AlignHandler}
 * implementation.
 * 
 * @author Carlos Alberto Junior Spohr Poletto.
 */
public interface Grid {
	
	Gridify column(int column);
	
	Gridify line(int line);
	
	Gridify colspan(int cols);
	
	Gridify rowspan(int rows);
	
	Gridify width(double with);
	
	Gridify height(double height);
}
