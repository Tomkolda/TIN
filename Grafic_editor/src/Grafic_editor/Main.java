package Grafic_editor;

public class Main {

	public static void main(String[] args) {
		MyCanvas canvas = new MyCanvas();
		
		Multiple mul = new Multiple(100,100);
		Rectangle rec1 = new Rectangle(10, 20, 10);
		Rectangle rec2 = new Rectangle(20, 5, 30);
		Circle cir1 = new Circle(15, 10, 15);
		canvas.add(rec1);
		canvas.add(cir1);
		
		mul.addObject(cir1);
		mul.addObject(rec2);
		mul.addObject(rec1);
		canvas.add(mul);
		
		canvas.draw();



	}

}
