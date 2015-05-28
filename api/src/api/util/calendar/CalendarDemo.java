package api.util.calendar;

import java.util.Calendar;


/*
 * java.util.Calendar
 * 
 * */
public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = {"1��","2��","3��","4��",
				"5��","26��","7��","8��",
				"9��","10��","11��","12��"};
		// Calendar.getInstance() �� ����������
		// ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ����̴�.
		// �������� �ν��Ͻ��� �������� �ʵ��� �����Ϸ��� 
		// �������� �ڵ��Ǿ���.
		Calendar date = Calendar.getInstance();
		
		System.out.print(" ù��° ���� ��¥ :");
		System.out.print(date.get(Calendar.YEAR)+"��");
		// �Ʒ��� 3�� ���� �ǹ��ϱ�� ??
		System.out.print((Calendar.MONTH +3) +"��");
		System.out.print(date.get(Calendar.DATE)+"��");
		System.out.println();
		
		System.out.print(" �ι�° ���� ��¥ :");
		System.out.print(date.get(Calendar.YEAR)+"��");
		// API ���� calendars is JANUARY which is 0 �Ǿ� �����Ƿ�
		// �Ʒ� ��ó�� ���� ���� ���� 1�� ���ؾ� �Ѵ�.
		// ���� 1�� ������ ������ ���� ���� 5���̸� 4���� ��µȴ�.
		System.out.print((date.get(Calendar.MONTH) + 1)+"��");
		System.out.print(date.get(Calendar.DATE)+"��");
		
		System.out.println();
		
		System.out.print("�ð� :");
		System.out.print(date.get(Calendar.HOUR)+"��");
		System.out.print(date.get(Calendar.MINUTE)+"��");
		System.out.print(date.get(Calendar.SECOND)+"��");
		System.out.println();
		System.out.println("=== ����� 1 �� �� ���� ������� ������ ��===");
		date.add(Calendar.MONTH, 1);  // ���� ��¥�� 1���� ���� ���
		System.out.println("������ ��"+toString(date));
		/*
		 * ��µ� ����� : java.util.GregorianCalendar �� ��µǹǷ�
		 * �������̵��� �ʿ��ϴ�.
		 * */
		
		System.out.println("=== 7�� ��===");
		date.add(Calendar.DATE, -7);
		System.out.println(toString(date));
		/*
		 * ��µ� ����� : java.util.GregorianCalendar �� ��µǹǷ�
		 * �������̵��� �ʿ��ϴ�.
		 * */
		
		System.out.println("Ư�� �ð����� ����");
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 46);
		
		System.out.println("������ �ð� ���");
		System.out.print(Calendar.HOUR + "��");
		System.out.print(Calendar.MINUTE + "��");
		System.out.print(Calendar.SECOND+"��");
		/*
		 * ������ �ð� ��°������ 101213 ó�� �Ǿ� �������̵��� �ʿ��ϴ�.
		 * */
		
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"��"
				+ date.get(Calendar.MONTH)+"��" // ���� 0���� �����ϹǷ� +1�� �ؾ��Ѵ�.
				+ date.get(Calendar.DATE)+"��";
	}
}







/*package api.util.calendar;

import java.util.Calendar;

 java.util.Calendar
 * 
 * 

public class CalendarDemo {

	public static void main(String[] args) {
		String[] months = {"1��","2��","3��","4��","5��","6��",
				"7��","8��","9��","10��","11��","12��"};
		Calendar.getInstance()�� ���������� ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ����̴�.
		 * �������� �ν��Ͻ��� �������� �ʵ��� �����Ϸ��� �������� �ڵ��Ǿ���.	
		Calendar date = Calendar.getInstance();
		
		System.out.print("��¥ : ");
		System.out.print(date.get(Calendar.YEAR)+"��");
		System.out.print(date.get(Calendar.MONTH)+"��");
		System.out.print(date.get(Calendar.DATE)+"��");
		
		System.out.println();
		
		System.out.print("�ð� : ");
		System.out.print(date.get(Calendar.HOUR)+"�ð�");
		System.out.print(date.get(Calendar.MINUTE)+"��");
		System.out.print(date.get(Calendar.SECOND)+"��");
		
		System.out.println("=== 1�� �� ===");
		date.add(Calendar. MONTH, 1);  // ���� ��¥�� 1���� ���� ���
		System.out.println("������ ��"+(toString(date));
		// ��µ� ����� : java.util.GregorianCalendar �� ��µǹǷ� �������̵��� �ʿ��ϴ�.
		
		
		System.out.println("=== 7�� �� ===");
		date.add(Calendar. DATE, -7);  
		System.out.println(toString(date));
		// ��µ� ����� : java.util.GregorianCalendar �� ��µǹǷ� �������̵��� �ʿ��ϴ�.
		
		System.out.println("Ư�� ��¥�� ����"); //������ǥ���� �̰ɷ� ���夻
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 30);
		
		System.out.println("������ �ð� ���");
		System.out.print(Calendar.HOUR + "��");
		System.out.print(Calendar.MINUTE + "��");
		System.out.print(Calendar.SECOND + "��");
		
		// ������ �ð� ��°������ 101213 ó�� �Ǿ� �������̵��� �ʿ��ϴ�.
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"
				+date.get(Calendar.MONTH)+"��"  // ���� 8���� �����ϹǷ� +1�� �ؾ��Ѵ�.
				+date.get(Calendar.DATE)+"��";
	}
	public static String getNowMonth(Calendar date) { 
		return date.add(Calendar.MONTH,1);
	}
	}*/