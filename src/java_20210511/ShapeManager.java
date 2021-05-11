package java_20210511;

public class ShapeManager {
	private static ShapeManager single; // ShapeManager의 멤버 변수-> ShapeManager는 레퍼런스 타입의 자료형(변수타입). 그리고 single은 변수명

	private ShapeManager() {  //ShapeManager의 생성자 => private이기 때문에 외부에서 객체생성 안됨 =인스턴스 할 수 없음
	}

	public static ShapeManager getInstance() {  // ShapeManager의 메서드
		if (single == null) {
			single = new ShapeManager();
		}
		return single;
	}
	
	public void run(Shape s) {
		s.draw();
	}
}
