package java_20210510;

//수강생 결제 형태 관련

public class MemberPay {
	private int seq;
	private int group;
	private String name;
	private int price;
	private boolean valid;
	private String status; //일반, 학생할인 등등
	private String sdate; //수강 시작일
	private String edate; //수강 마감일
	private String regdate; //결제일
	
	//seq의 setter => seq를 수정할 때 사용
	public void setSeq(int seq) {
		//this를 사용한 이유는 로컬 변수와 멤버 변수를 구분하기 위해서 사용
		this.seq = seq; //왼쪽은 멤버 변수고 오른쪽은 로컬 변수
		//seq = seq; 로 쓰게되면, 멤버 변수는 변하지 않게됨(둘다 로컬 변수이기 때문에)
	}
	//seq의 getter => seq의 정보를 가져올 때 사용
	public int getSeq() {
		return seq;
		//return this.seq => 이것도 가능. 그러나 잘 안씀. 왜? 로컬변수가 없기 때문에 멤버 변수와 헷갈릴 이유 없음
	}
	//group의 setter생성
	public void setGroup(int group) {
		this.group = group;
	}
	
	//group의 getter 생성
	public int getGroup() {
		return group;
	}
	//name의 setter생성
	public void setName (String name) {
		this.name = name;
		
	}
	//name의 getter 생성
	public String getName() {
		return name;
	}
	
	//price의 setter생성
	public void setPrice(int price) {
		this.price = price;
	}
	
	//price의 getter생성
	public int getPrice() {
		return price;
	}
	//valid의 setter생성 (boolean)
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	//valid의 getter생성 (boolean) => valid자료형이 boolean일 경우는 getXXX가 아니라 isXXX로 생성한다.
	public boolean isValid() {
		return valid;
	}
	
	//status
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	
	//sdate
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getSdate() {
		return sdate;
	}

	//edate
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getEdate() {
		return edate;
	}
	
	//regdate
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getRegdate() {
		return regdate;	
	}	
	
}

