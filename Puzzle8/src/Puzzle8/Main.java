package Puzzle8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

		 public static final int NAHORU = 1;
		 public static final int DOLU = 2;
		 public static final int VLEVO = 3;
		 public static final int VPRAVO = 4;

public static void main(String[] args) {
			
			
			/*Puzzle hraciPole1 = new Puzzle();
			
			hraciPole1.vypisPole();
			hraciPole1.posun(NAHORU);
			hraciPole1.vypisPole();
			
			Puzzle hraciPole2 = new Puzzle ();
			hraciPole2.vypisPole();
			hraciPole2.posun(DOLU);
			hraciPole2.vypisPole();
			


			
			HashSet<Puzzle> mn = new HashSet<>();
			mn.add(hraciPole1);
			mn.add(hraciPole2);
			
			

			System.out.println(hraciPole1.equals(hraciPole2));
			System.out.println(hraciPole2.equals(hraciPole1));
			System.out.println(hraciPole1.hashCode() == hraciPole2.hashCode());
			System.out.println(mn.size());*/
	
	
			
			/*Puzzle g = new Puzzle();
			 Ukol 1,2
			Random rnd = new Random();
			for (int i = 0; i < 100; i++) {
				int nahodne = rnd.nextInt(4);
				g.posun(1 + nahodne);
				g.toString();
				System.out.println(g.jeReseni()); 
			}
			g.toString();*/
			
			/*Ukol 3, 4
			System.out.println("Original:");
			g.toString();
			Puzzle g3 = g.klonujAPohni(NAHORU);
			
			System.out.println("Kopie s posunem: ");
			g3.toString();*/
			
			/*Ukol 5,6
			HashSet<Puzzle> set = new HashSet<Puzzle>();
			set.add(g);
			Puzzle g2 = g.klonujAPohni(NAHORU);
			g2.posun(DOLU);
			set.add(g2);
			System.out.println(set.contains(g2));
		
			System.out.println("Pocet prvku v mnozine je: " + set.size());*/
			
			/*Ukol 7
			LinkedList<Puzzle> fronta = new LinkedList<Puzzle>();
			Puzzle p1 = new Puzzle();
			Puzzle p2 = new Puzzle();
			
			fronta.addLast(p1);
			fronta.addLast(p2);
			
			for (int i = 0; i <= fronta.size(); i++) {
				fronta.getFirst().toString();
				fronta.removeFirst();
			}
			*/
	
			/*Ukol 9
			Puzzle p = new Puzzle();
			System.out.println(p.jeReseni());
			
			p.klonujAPohni(NAHORU);
			p.klonujAPohni(DOLU);
			p.klonujAPohni(VPRAVO);
			p.klonujAPohni(VPRAVO);
			p.klonujAPohni(VLEVO);
			p.klonujAPohni(NAHORU);
			p.klonujAPohni(VLEVO);
			p.klonujAPohni(DOLU);

			
			System.out.println(p.jeReseni());
			p.toString();*/
	
	
			/*Ukol 10*/
			HashSet<Puzzle> set = new HashSet<Puzzle>();
			LinkedList<Puzzle> fronta = new LinkedList<Puzzle>();
			Puzzle g = new Puzzle();
			fronta.addLast(g);
			set.add(g);
			for (int i = 0; i < 1; i++) {
				if (fronta.size() != 0) {
					Puzzle tmp = fronta.getFirst();
					if (g.jeReseni()) {
						System.out.println("Bylo nalezeno reseni");
						break;
					}
					else {
						Puzzle p1 = g.klonujAPohni(NAHORU);
						p1.toString();
						if (!set.contains(p1))
							fronta.add(p1);
						g = tmp;
						Puzzle p2 = g.klonujAPohni(DOLU);
						p2.toString();
						if (!set.contains(p2))
							fronta.add(p2);
						g = tmp;
						Puzzle p3 = g.klonujAPohni(VPRAVO);
						p3.toString();
						if (!set.contains(p3))
							fronta.add(p3);
						g = tmp;
						Puzzle p4 = g.klonujAPohni(VLEVO);
						p4.toString();
						if (!set.contains(p4))
							fronta.add(p4);
					}
				}
			}
			System.out.println("Reseni nebylo nalezeno");
			
		}
	}

