package CV02;

public class Main {

	public static void main(String[] args) {
		Mapa mapa = new Mapa();

        Auto a1 = new Auto("Skoda", 10, 10);
        Auto a2 = new Auto("Mazda", 20, 10);

        mapa.addAuto(a1);
        mapa.addAuto(a2);
        
        System.out.println(mapa.getPocetAut());
        mapa.vypisVsechnaAuta();
        
        System.out.println(mapa.getAuto(1).getNazev());
        
        mapa.removeAuto(0);
        
        
        System.out.println(mapa.getPocetAut());
        mapa.vypisVsechnaAuta();
        
     
        Packet p1 = new Packet();
        Packet p2 = new Packet();
        Packet p3 = new Packet();
        Packet p4 = new Packet();
        
        p1.setDalsi(p2);
        p2.setDalsi(p3);
        p3.setDalsi(p4);
        
        Adresar ad1 = new Adresar();
        Adresar ad2 = new Adresar();
        Adresar ad3 = new Adresar();
        Adresar ad4 = new Adresar();
        Adresar ad5 = new Adresar();
        
        ad1.setLevy(ad4);
        ad1.setPravy(ad2);
        ad2.setLevy(ad3);
        ad2.setPravy(ad5);
        
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        
        n1.addNode(n2);
        n1.addNode(n6);
        n1.addNode(n5);
        n1.addNode(n4);
        
        n2.addNode(n1);
        n2.addNode(n3);
        n2.addNode(n5);
        
        System.out.println(n1);
        System.out.println(n1.getNode(2));
        System.out.println(n5);
        n1.printNodes();
        
        
        
        
        
	}
}
