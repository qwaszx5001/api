package api.util.vector;

import java.util.Vector;

/*
java.util.vector 의 메소드인 addElement()는 기본적으로 add() 와 동일하다.
*/
public class AddElementDemo {
	public static void main(String[] args) { 
		String[] heros = {"iron man","thor","hulk","hawk"};
		Vector<String> avengers = new Vector<String>();
		// 백터에 배열의 요소를 저장 addElement()
		for (int i = 0; i < heros.length; i++) {
			avengers.addElement(heros[i]);
		}
		// 토르가 존재하는 지 체크 contains() 를 사용한다.
		String thor = "thor";
		if(avengers.contains(thor)) {
			int idx = avengers.indexOf(thor);
			System.out.println("토르는" + idx + "번째에 있습니다.");
		}else {
			System.out.println("토르는 없습니다.");
		}
		/*
		 * 첫번째 맴버(요소) 삭제
		 * 백터의 인덱스도 0부터 시작한다. 0이 곧 첫번째 요소임
		 * */
		System.out.println(avengers);
		avengers.removeElementAt(0);
		System.out.println("삭제 후 맴버 위치 인덱스 변화");
		for(int j=0; j<avengers.size(); j++) {
			System.out.println("Avengers의 " + (j+1) + "번째의 맴버는"
					+ avengers.elementAt(j));
			
		}
	}

}
