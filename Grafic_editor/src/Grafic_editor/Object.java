package Grafic_editor;

public abstract class Object {
	private int x;
	private int y;


	public Object(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	

	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public void PrintObject(int x) {
		System.out.println(x);
	}

	
	public abstract void draw();
}
