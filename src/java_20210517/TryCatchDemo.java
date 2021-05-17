package java_20210517;

public class TryCatchDemo {
	public static double getAvgs(int k, int e) {
		int sum = k + e;
		double avg =(double) sum / 2;
		return avg;
	}
	//javac TryCatchDemoth.java => compile
	//java TryCatchDemo 10 20 30
	//Run Configurations -> Arguments -> Program arguments -> 10 20
	//10 a -> NumberFormatException
	// 10 -> ArrayIndexOutOfBoundsException
	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]);
			int english = Integer.parseInt(args[1]); 
			
			double average = getAvgs(korean, english);
			
			System.out.printf("국어와 영어의 평균점수는 %.1f점 입니다.%n", average);
			
		}catch(NumberFormatException e) {
			//catch 블럭의 수행문을 만들때 2가지 형태로 코딩한다.
			//1. 에러 메세지를 출력 (개발자) => 개발 단계에서 예외 출력
			//2. 에러 메세지를 출력(사용자) => 서비스 단계에서 예외 출력
			//e.printStackTrace(); //error stack 모두 다 보고싶은 경우 => 반환값이 void이기 때문에 syso 필요없음
			System.err.println(e.getMessage()); //에러 메세지만 보고싶은 경우
			System.err.println("문자말고 숫자를 넣어!");
		
			
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace(); //error stack 모두 다 보고 싶은 경우 => 반환값이 void이기 때문에 syso필요 없음)
			System.err.println(e.getMessage());
			System.out.println("인자는 2개가 필요해!");
			
		}finally {
			System.out.println("무조건 수행되는 블럭 - finally");
		}
	}

}