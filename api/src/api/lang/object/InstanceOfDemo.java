package api.lang.object;

/*
 * ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� instanceof �����ڸ� ����Ѵ�.
 * ������ ����� true �� false �� �ϳ��� �����Ѵ�.
 * */

public class InstanceOfDemo {
	public static void main(String[] args) {
		FiareCar fireCar = new FireCar();
		Ambluance ambluance = new Ambluance();
		
		
		InstanceOfDemo test = new InstanceOfDemo();
		test.doWork(fireCar);
		test.doWork(ambluance);
	}
	public void doWork(Car c) {

		 // �ҹ����� Car Ÿ������ Ȯ�� ��...�´ٸ� (FireCar) �� ��ü ĳ������ �϶�

		if(c instanceof FireCar) {
			FireCar f = (FireCar) c;
			f.driver();
			f.stop();
			f.shootWater();
			
			// amblulance Car Ÿ������ Ȯ�� ��...�´ٸ� (amblulance) �� ��ü ĳ������ �϶�
			
		}else if(c instanceof Amblulance) {
			Amblulance a = (Amblulance) c;
			a.driver();
			a.stop();
			a.siren();
		}
	}
}
class Car {
	String color;
	int door;
	void driver(){System.out.println("������...");}
	void stop(){System.out.println("����!!");}
}
class FireCar extends Car{ //carŬ������ ��ӹ��� �ҹ���
	void shootWater(){
		System.out.println("���ѷ�������");
	}
	
class Amblulance
}
