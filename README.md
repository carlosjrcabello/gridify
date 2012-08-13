gridify
=======

Because GridBagLayout must be simple!
```
public static void main(String[] args) {
	GridBag grid = new Grid();
	
	JPanel panel =  new JPanel(new GridBagLayout());
	JButton bu = new JButton("champz");
	
	grid.atLine(0).atColumn(0).alignment(GridBag.LEFT).add(bu, panel);
	// or...many ways :D
	grid.atColumn(0).atLine(0).alignment(GridBag.LEFT).add(bu, panel);
}
```
