package api.lang.object;

/*
 * 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 instanceof 연산자를 사용한다.
 * 연산의 결과로 true 와 false 중 하나를 리턴한다.
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

		 // 소방차가 Car 타입인지 확인 후...맞다면 (FireCar) 로 객체 캐스팅을 하라

		if(c instanceof FireCar) {
			FireCar f = (FireCar) c;
			f.driver();
			f.stop();
			f.shootWater();
			
			// amblulance Car 타입인지 확인 후...맞다면 (amblulance) 로 객체 캐스팅을 하라
			
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
	void driver(){System.out.println("운전중...");}
	void stop(){System.out.println("스톱!!");}
}
class FireCar extends Car{ //car클래스를 상속받은 소방차
	void shootWater(){
		System.out.println("물뿌려끄는중");
	}
	
class Amblulance
}
