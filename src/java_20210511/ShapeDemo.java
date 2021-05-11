package java_20210511;

public class ShapeDemo {

	public static void main(String[] args) {
		ShapeManager manager = ShapeManager.getInstance();
		Circle t = new Circle();
		manager.run(t);
		
	}
}
