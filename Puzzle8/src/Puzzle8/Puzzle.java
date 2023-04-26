package Puzzle8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Puzzle {
	public static final int NAHORU = 1;
	 public static final int DOLU = 2;
	 public static final int VLEVO = 3;
	 public static final int VPRAVO = 4;
	
	private int[][] pole = {{7,2,4},{5,0,6},{8,3,1}};
	private int x = 1;
	private int y = 1;
	private ArrayList<String> pohyby = new ArrayList<>();
	
	public void posun(int smer) {
		
		switch (smer){
		case NAHORU:
			if(y>0 && y<=2) {
				pole[y][x] = pole[y-1][x];
				pole[y-1][x] = 0;
				y--;
				pohyby.add("nahoru");
			}
			else {
				System.out.println("Tento pohyb nelze provest");
			}
			break;
		case DOLU:
			if(y<2 && y>=0) {
				pole[y][x] = pole[y+1][x];
				pole[y+1][x] = 0;
				y++;
				pohyby.add("dolu");
			}
			else {
				System.out.println("Tento pohyb nelze provest");
			}
			break;
		case VLEVO:
			if(x>0 && x <= 2) {
				pole[y][x] = pole[y][x-1];
				pole[y][x-1] = 0;
				x--;
				pohyby.add("vlevo");
			}
			else {
				System.out.println("Tento pohyb nelze provest");
			}
			break;
		case VPRAVO:
			if(x<2 && x >= 0) {
				pole[y][x] = pole[y][x+1];
				pole[y][x+1] = 0;
				x++;
				pohyby.add("vpravo");
			}
			else {
				System.out.println("Tento pohyb nelze provest");
			}
			break;
		
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(pole);
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Puzzle other = (Puzzle) obj;
		if (!Arrays.deepEquals(pole, other.pole))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	

	
	public String toString() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(pole[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("X = " + x + " Y = " + y);
		System.out.print("Pohyby: ");
		for (int k = 0; k < pohyby.size(); k++) {
			System.out.print(pohyby.get(k)+", ");
		}
		System.out.println();
		return "";
	}

	public boolean jeReseni() {
		int [][] reseni = {{1, 4, 7}, {2, 5, 8}, {3, 6, 0}};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(pole[i][j] != reseni[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public Puzzle klonujAPohni(int smer){
		posun(smer);
		return this;
	}
	
	
	
}
