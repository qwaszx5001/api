package api.lang.object;

/*
 * java.lang.Object �� �޼ҵ�
 * equals() : ���� ������ ���θ� üũ
 * �ν��Ͻ� ������ �ؽ��ڵ� ��(�� �ּҰ�)�� ���ϴ� �޼ҵ�
 * */

public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10); // 10���� �ʵ忡�ִ� num�� ������ �ִ�
		Temp t2 = new Temp(10);
		
		// result �� ���������̱� ������ �ݵ��!!! �ʱ�ȭ�� �ؾ��Ѵ�.
		String result = ""; 
		
		/* if(){}else{} �� ���´� �ϵ��ڵ����� �ͼ������� �Ѵ�.
		if(t1.equals(t2)){
			System.out.println("t1 �� t2�� ���� ����.");
		}else {
			System.out.println("t1 �� t2�� ���� �ٸ���.");
		}*/
		
		result = (t1.equals(t2)) ? "t1 �� t2�� ���� ����." : "t1 �� t2�� ���� �ٸ���."; 
		System.out.println("�����ڸ� ���� ������ �������� ���� �� :" +result);
		/* ���� �����ڴ� if else �� ��ü�ϴ� �����̴�. 
		������ (���ǽ�) ? "���ΰ��" : "������ ���"; 
		*/
		
		t2 = t1;
		result = t1.equals(t2) ? "t1 �� t2�� ���� ����." : "t1 �� t2�� ���� �ٸ���.";
		System.out.println("�������� ������ �Ҵ�� ���� ���� ���� �� :" +result);
		//(t1.equals(t2)) ���θ� �Ⱦ����.....  �̷��� �����ν� �ּҰ��� �̿��Ѵٴ� �� �˼��ִ�.
	}
}
class Temp { 
	int num;  //�ʵ忡 �ִ� �ν��Ͻ� ������ �ʱ�ȭ�� �ʿ����.
	public Temp(int num) {
		this.num = num;
		
	/*
	 * ��� ���´� ���� ����� �ν��Ͻ� ������ �� ���ÿ� �ִ� num ���������� �Ҵ�� ���� 
	 * �ν��Ͻ� ������ �Ѱ��ְ� ����(����)���� �ڽ��� ������� �ó������� ����ȴ�.
	 * */
		
		
	}
}