package cz.vutbr.feec.cisla;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class HraciPole{
	private int[][] data = { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, -1 } };
	private int x = 2;
	private int y = 2;
	private ArrayList<Integer> pohyby = new ArrayList<Integer>();

	public static final int UP = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int RIGHT = 4;

	public HraciPole klonujAPohni(int smer) {
		HraciPole nove = new HraciPole();
		nove.x = this.x;
		nove.y = this.y;
		nove.pohyby.addAll(this.pohyby);
		nove.pohyby.add(smer);
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				nove.data[x][y] = this.data[x][y];
			}
		}

		boolean jeMozny = nove.pohni(smer);
		if (jeMozny) {
			return nove;
		} else {
			return null;
		}
	}

	public boolean pohni(int smer) {
		switch (smer) {
		case UP:
			// nahoru
			if (y < 1) {
				return false;
			}
			data[x][y] = data[x][y - 1];
			data[x][y - 1] = -1;
			y = y - 1; // y--;
			//pohyby.add(1);
			return true;
		case DOWN:
			// nahoru
			if (y > 1) {
				return false;
			}
			data[x][y] = data[x][y + 1];
			data[x][y + 1] = -1;
			y++; // y = y + 1;
			//pohyby.add(2);
			return true;
		case LEFT:
			// nahoru
			if (x < 1) {
				return false;
			}
			data[x][y] = data[x - 1][y];
			data[x - 1][y] = -1;
			x = x - 1; // y--;
			//pohyby.add(3);
			return true;
		case RIGHT:
			if (x > 1) {
				return false;
			}
			data[x][y] = data[x + 1][y];
			data[x + 1][y] = -1;
			x++; // y = y + 1;
			//pohyby.add(4);
			return true;// TODO
		}
		return false;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(data);
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
		HraciPole other = (HraciPole) obj;
		if (!Arrays.deepEquals(data, other.data))
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	public boolean jeReseni() {
		int [][] reseni = {{1, 4, 7}, {2, 5, 8}, {3, 6, -1}};
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(data[i][j] != reseni[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public String toString() {
		String res = "pohyby:" + pohyby + "\n";
		for (int iy = 0; iy < 3; iy++) {
			for (int ix = 0; ix < 3; ix++) {
				res += data[ix][iy] + ",";
			}
			res += "\n";
		}
		return res;
	}

	public int[][] getData() {
		return data;
	}

	public void setData(int[][] data) {
		this.data = data;
	}

	public ArrayList<Integer> getPohyby() {
		return pohyby;
	}


	public void setPohyby() {
		pohyby = new ArrayList<Integer>();
		
	}
	
	
	
}

