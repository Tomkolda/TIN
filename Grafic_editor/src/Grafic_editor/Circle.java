package Grafic_editor;

public class Circle extends Object {

	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}


	@Override
	public void draw() {
		System.out.println("circle : x= " + getX() + " y = " + getY() + " radius= " + getR());

	}
}
