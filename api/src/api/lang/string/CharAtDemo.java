package api.lang.string;
/*
 java.lang.String �� ���� �޼ҵ�
 charAt() : ������ ��ġ�� �ִ� ���ڸ� ������. index�� 0���� ����
 indexOf() : �־��� ���ڰ� �����ϴ��� Ȯ���Ͽ� ��ġ�� �˷��� ������ -1��ȯ
 * */
public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = "800101-155555";
		// index�� 0���� �����ϹǷ� ���ฦ �����ϴ� 1���� 7��° �ε����� ��ġ�Ѵ�.
		// char isMan = ssn.charAt(7);
		
		char isMan = ssn.charAt(ssn.indexOf("-"+1));
		/*indexOf()�� �Ķ���ͷ� �־��� String ���� ��ġ���� �����Ѵ�. 
		 "-"(������ũ��) �� �������� ���ฦ �����ϴ� ���̹Ƿ� +1�� �־���.*/
		
		switch(isMan){
		case '1' :case '3' : System.out.println("����"); break;
		case '2' :case '4' : System.out.println("����"); break;
		default : System.out.println("�߸��� �Է°��Դϴ�."); break;
		}
	}
}
