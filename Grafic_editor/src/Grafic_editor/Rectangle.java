package Grafic_editor;

public class Rectangle extends Object {

	private int size;

	public Rectangle(int x, int y, int size) {
		super(x, y);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}


	@Override
	public void draw() {
		System.out.println("rectangle : x= " + getX() + " y = " + getY() + " size= " + getSize());

	}
}
