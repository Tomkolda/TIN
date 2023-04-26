package CV02;

import java.util.Vector;

public class Mapa {
	public Vector<Auto> seznamAut = new Vector<Auto>();
	
	public void addAuto(Auto noveauto) {
		seznamAut.add(noveauto);
	}
	
	public Auto getAuto(int poradi) {
		return seznamAut.get(poradi);
	}
	
	public void removeAuto(int poradi) {
		seznamAut.remove(poradi);
	}
	
	public Integer getPocetAut() {
		return seznamAut.size();
	}

	public void vypisVsechnaAuta() {
		for(int i = 0; i < seznamAut.size(); i++) {
			System.out.print("Nazev: " + seznamAut.get(i).getNazev() + " souradnice x: " + seznamAut.get(i).getX() + " souradnice y: " + seznamAut.get(i).getY() + "\n");
		}
	}
	
	
	
}
