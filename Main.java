package cz.vutbr.feec.cisla;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

public class P10BFS {
	public static void main(String[] args) {
		HraciPole h = null;
		HraciPole g = new HraciPole();
		Random rnd = new Random();
		for (int i = 0; i < 100000; i++) {
			// nahodne cislo 0 - 3
			int nahodne = rnd.nextInt(4);
			g.pohni(1 + nahodne);
		}
		HashSet<HraciPole> closed = new HashSet<HraciPole>();
		LinkedList<HraciPole> fronta = new LinkedList<HraciPole>();
		g.setPohyby();
		closed.add(g);
		fronta.add(g);
		int k = 0;
		int i = 0;
		
		while(!fronta.isEmpty()) {
			i++;
			HraciPole tmp = fronta.getFirst();
			fronta.removeFirst();
			closed.add(tmp);
			if (tmp.jeReseni()) {
				System.out.println("Bylo nalezeno reseni");
				k = 1;
				break;
			}
			HraciPole h1 = tmp.klonujAPohni(1);
			if (!closed.contains(h1))
				if (h1 != null) {
					fronta.add(h1);
					
				}
			HraciPole h2 = tmp.klonujAPohni(2);
			if (!closed.contains(h2)) {
				if (h2 != null)
				fronta.add(h2);
				
			}
			HraciPole h3 = tmp.klonujAPohni(3);
			if (!closed.contains(h3)){
				if (h3 != null) {
					fronta.add(h3);
					
				}
			}
			HraciPole h4 = tmp.klonujAPohni(4);
			if (!closed.contains(h4))
				if (h4 != null) {
					fronta.add(h4);
					
				}
			
		}
		if(k != 1) {
			System.out.println("Nebylo nalezeno reseni");
		}
		System.out.println(i);
	}
}
