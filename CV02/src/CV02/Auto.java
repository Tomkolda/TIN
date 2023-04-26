package CV02;

public class Auto {
	private String nazev;
	private int x;
	private int y;
	
	
	
	public Auto(String nazev, int x, int y) {
		super();
		this.nazev = nazev;
		this.x = x;
		this.y = y;
	}
	
	public String getNazev() {
		return nazev;
	}
	public void setNazev(String nazev) {
		this.nazev = nazev;
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
	
	
	
}
