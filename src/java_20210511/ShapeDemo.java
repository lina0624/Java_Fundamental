package java_20210511;

public class ShapeDemo {

	public static void main(String[] args) {
		ShapeManager manager = ShapeManager.getInstance(); //ShapeManager의 인스턴스 생성
		Triangle t = new Triangle();
		manager.run(t);
	}
}
