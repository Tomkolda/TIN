package Grafic_editor;

import java.util.ArrayList;

public class Multiple extends Object {

	ArrayList<Object> objects = new ArrayList<Object>();

	public Multiple(int x, int y) {
		super(x, y);
	}

	public void addObject(Object object) {
		objects.add(object);
	}

	@Override
	public void draw() {
		for (int i = 0; i < objects.size(); i++) {
			objects.get(i).draw();
		}

	}

}