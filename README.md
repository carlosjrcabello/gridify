gridify
=======

Working progress... :D

Because GridBagLayout must be simple!
```
public static void main(String[] args) {
	GridBag grid = new Grid();
	
	JPanel panel =  new JPanel(new GridBagLayout());
	
	Gridify gridify = new GridifyHandler();
		
	gridify.align().left().margin().left(10).add(new JLabel("Foo: "), panel);
}
```

Or you can still use the uglly javax.swing way... 

```
public static void main(String[] args) {
	GridBag grid = new Grid();
	
	JPanel panel =  new JPanel(new GridBagLayout());
	
	GridBagConstraints c = new GridBagConstraints();
	
	c.gridy 		= 0;
	c.gridx 		= 0;
	c.gridheight 	= 3;
	c.insets		= new Insets(10, 0, 0, 10);
	c.anchor		= GridBagConstraints.CENTER;
	c.fill 			= GridBagConstraints.HORIZONTAL;
	
	panel.add(new JLabel("Ahhhh!!"), c);
}
```


Will be bealtiful
