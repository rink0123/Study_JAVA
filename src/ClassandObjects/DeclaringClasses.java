package ClassandObjects;

/**
 * <h3>클래스 선언(Declaring Classes)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html">
 * Java Tutorials > Classes and Objects > Classes</a></li>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/classdecl.html">
 * Java Tutorials > Classes and Objects > Declaring Classes</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_class_intro">TCP School > JAVA > 26) 클래스의 개념</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_class_component">TCP School > JAVA > 27) 클래스의 구성</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_class_declaration">TCP School > JAVA > 28) 클래스의 선언</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class DeclaringClasses {

	/* 
	 * 객체 지향 프로그래밍(OOP, Object-Oriented Programming)
	 * 1. 모든 데이터를 객체(object)로 취급하며, 이러한 객체가 바로 프로그래밍의 중심이 된다.
	 * 2. 객체(object)란 간단히 이야기하자면 실생활에서 우리가 인식할 수 있는 사물로 설명할 수 있다.
	 *    이러한 객체의 상태(state)와 행동(behavior)을 구체화하는 형태의 프로그래밍이 바로 객체 지향 프로그래밍이다.
	 * 3. 객체를 만들어 내기 위한 설계도와 같은 개념을 클래스(class)라고 한다.
	 * 
	 * 
	 * class(클래스)
	 * 1. class는 객체 지향 프로그래밍(OOP, Object-Oriented Programming)를 정의하는 개념 중 하나로,
	 *    특정 객체를 생성하기 위해 variable(변수)와 method(함수)를 정의하는 일종의 틀(Blueprint, 청사진)이다.
	 * 2. 객체를 정의하기 위한 상태(member variable=field)와 객체의 행동을 나타내는 method(함수)로 구성된다.
	 *    또한, 생성된 객체의 field를 초기화해주는 특별한 method인 constructor(생성자)를 가진다.
	 * 3. 객체는 class로 규정된 instance로서, 변수 대신 실제값을 가진다.
	 * 
	 * 
	 * class 선언 방법
	 * public class Car { -> 순서대로 접근제어자, 키워드, class명.
	 *     private String modelName; -> class 필드;.
	 *     private int modelYear;
	 *     ...
	 *     public void brake() {} -> class 메소드;.
	 *     ...
	 * } -> class의 멤버
	 * 
	 * 
	 * instance(객체화)
	 * 1. 클래스로부터 객체를 선언하는 과정을 클래스의 인스턴스화(=객체화)라고 한다.
	 *    또한, 이렇게 선언된 해당 클래스 타입의 객체를 인스턴스(instance)라고 한다.
	 *    즉, 인스턴스란 메모리에 할당된 객체를 의미한다.
	 * 2. 하나의 클래스로부터 여러 개의 인스턴스를 생성할 수 있다.
	 * 3. 생성된 인스턴스는 독립된 메모리 공간에 저장된 자신만의 필드를 가질 수 있다.
	 * 4. 해당 클래스의 모든 method(함수)는 해당 클래스에서 생성된 모든 인스턴스가 공유하게 된다.
	 * 
	 * 
	 * instance 선언 방법
	 * 1. Car myCar; -> 클래스이름 객체참조변수이름;
	 *    myCar = new Car(); -> 객체참조변수이름 = new 클래스이름();
	 * 2. Car myCar = new Car(); -> 클래스이름 객체참조변수이름 = new 클래스이름();
	 */
	
	// 필드 cadence, speed, gear는 객체의 상태를 나타낸다.
	int cadence = 0;
	int speed = 0;
	int gear = 1;

	// 메소드(changeCadence, changeGear, speedUp 등)는 외부의 상호 작용을 정의한다.
	public void changeCadence(int newValue) {
		cadence = newValue;
	}

	public void changeGear(int newValue) {
		gear = newValue;
	}

	public void speedUp(int increment) {
		speed = speed + increment;
	}

	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
        System.out.printf("cadence: %d, speed: %d, gear: %d\n", cadence, speed, gear);
	}
	
	public static void main(String[] args) {
		// 변수명만 다른 두 가지 같은 객체 생성.
		DeclaringClasses bike1 = new DeclaringClasses();
		DeclaringClasses bike2 = new DeclaringClasses();
                
        // 해당 객체의 메소드 호출.
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();
        // 결과: cadence: 50, speed: 10, gear: 2
 
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        // 결과: cadence: 40, speed: 20, gear: 3
        
		/* 
		 * 변수명만 다른 같은 클래스를 객체화하여 해당 객체 내부의 method를 실행하면 서로 다른 값이 나온다.
		 * 그 이유는 결정적인 키워드인 new를 통해 새로운 메모리 영역을 만들어 자기 자신에게 대입해 독립적인 객체가 된 것이다.
		 * 또한 독립된 객체를 구분하기 위해선 변수명을 서로 다르게 해야한다는 것이다.
		 */
	}
}