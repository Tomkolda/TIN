package CV11;

public class Hrana {
	private Uzel u1;
	private Uzel u2;
	private int cena;
	public Hrana(Uzel u1, Uzel u2, int cena) {
		super();
		this.u1 = u1;
		this.u2 = u2;
		this.cena = cena;
	}
	public Object getOdkud() {
		return u1;
	}
	public Object getKam() {
		return u2;
	}
	public Integer getCena() {
		return cena;
	}
	
	
}
