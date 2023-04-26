package Grafic_editor;

import java.util.ArrayList;

public class MyCanvas{
	ArrayList<Object> objects = new ArrayList<Object>();
	
	public void add(Object o) {
		objects.add(o);
	}

	public void draw() {
		for (int i = 0; i < objects.size(); i++) {
			objects.get(i).draw();
		}
	}

}
