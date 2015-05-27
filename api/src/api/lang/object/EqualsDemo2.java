package api.lang.object;

public class EqualsDemo2 {  // 실무에서 회원가입시 막는 코딩
	public static void main(String[] args) {
		Person p1 = new Person("800101-155555");
		Person p2 = new Person("800101-155555");
		String result = ""; // 스태틱 메소드 내부라서 지역변수가 스태틱이 되었다.
		result = (p1 == p2) ? "p1과 p2는 같은 사람" : "p1과 p2는 다른사람";
		System.out.println("(p1 == p2) 에 대한 결과값 : "+ result);
		
		result = (p1.equals(p2)) ? "p1과 p2는 같은 사람" : "p1과 p2는 다른사람";
		System.out.println("(p1.equals(p2)) 에 대한 결과값 : "+ result);
	}
}
class Person{
	private String ssn; // 주민번호
	public Person(String ssn) {
		this.ssn = ssn;
	}
	// ALT + SHIFT + S...generate getter setter 클릭
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	// ALT + SHIFT + S...generate hashcode() and equals()
	// 해시코드 나오면 지웠따

	@Override
	public boolean equals(Object obj) {
		
		/*Object 는 모든 데이터 타입을 의미하기 때문에 반드시 주민번호를 갖고 있는 Person인지를 확인해야
		주민번호 일치 여부를 따질 수 있기 때문에 객체캐스팅 연산자 instanceof를 사용한다.
		이런 기능을 Validation 유효성 체크라고 한다....자바스크립트에 많이 쓰이는 기능*/
		
		if(obj != null && obj instanceof Person) {
			return ssn == ((Person)obj).ssn;
		
		/*java.lang.Object 의 객체 캐스팅은 ((객체타입))obj)....의 형태로 이뤄진다.
		 * 
		 */
		}else {
			return false;
		}
	}
}