package ClassandObjects;

/**
 * <h3>기타 제어자(Other Modifier)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html">
 * Java Tutorials > Classes and Objects > Understanding Class Members</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_modifier_ectModifier">TCP School > JAVA > 36) 기타 제어자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class OtherModifier {
	/*
	 * static 제어자
	 * 1. "공통적인"이라는 의미로 사용.
	 * 2. static이 선언된 필드를 정적 필드 또는 클래스 변수라고 한다.
	 * 3. 객체가 아닌 클래스와 연관되며, 클래스의 모든 인스턴스는 메모리의 고정된 위치에 있는 클래스 변수를 공유한다.
	 * 4. 모든 객체는 클래스 변수의 값을 변경할 수 있지만 클래스의 인스턴스를 만들지 않고도 클래스 변수를 조작 할 수 있다.
	 * 5. 메소드에 사용하면 해당 메소드를 클래스 메소드로 만들어 준다.
	 * 6. 초기화 블록에도 사용할 수 있다.
	 * 
	 * 
	 * static 제어자 가지는 멤버의 특징
	 * 1. 프로그램 시작시 최초에 단 한 번만 생성되고 초기화된다.
	 * 2. 인스턴스를 생성하지 않고도 바로 사용할 수 있다.
	 * 3. 해당 클래스의 모든 인스턴스가 공유한다.
	 * 
	 * 
	 * 허용되지 않는 인스턴스 및 클래스 변수와 메소드의 일부 조합
	 * 1. 인스턴스 메소드는 인스턴스 변수, 메소드와 클래스 변수, 메소드에 직접 액세스할 수 있다.
	 * 2. 클래스 메소드는 클래스 변수, 메소드에 직접 액세스할 수 있다.
	 * 3. 클래스 메소드는 객체 참조를 사용해야 하는 인스턴스 변수, 메소드에 직접 액세스할 수 없다.
	 * 4. 클래스 메소드는 this 키워드를 사용할 수 없다.
	 * 
	 * 
	 * final 제어자
	 * 1. "변경할 수 없다"는 의미로 사용.
	 * 2. 필드에 사용하면 해당 필드는 값을 변경할 수 없는 상수(constant)가 된다.
	 *    그래서 프로그램이 재할당하려고 하면 compile-time error가 발생된다.
	 * 3. 클래스에 사용하면 해당 클래스는 다른 클래스가 상속받을 수 없게 된다.
	 *    즉, 부모클래스로써 상속 불가. 하지만 자식클래스로써 상속 받을 수 있다. 객체화도 가능.
	 * 4. 메소드에 사용하면 해당 메소드는 오버라이딩(overriding)을 통한 재정의를 할 수 없게 된다.
	 * 5. 명명 규칙에 의해 final이 선언된 필드(상수)명은 영대문자로 표기하며, 
	 *    둘 이상의 단어로 구성된 경우 단어 사이에 밑줄(_)로 구분해야 한다.
	 */
	
	public static void main(String[] args) {
		// static.
		// 메모리에 미리 할당된 static block에 의해 결과: 1 출력. 
		StaticCar.var = 2; // statlc 초기화 블럭 실행 후 값 변경.
		System.out.println(StaticCar.var); // 결과: 2
		// 정적 필드, 메소드는 객체화가 필요없이 클래스명.변수명(or 메소드명)으로 바로 호출할 수 있다.
		StaticCar.brake(); // 결과: 2
		
		// final.
		FinalCar finalCar = new FinalCar(); // final class 객체화.
		System.out.println(finalCar.VAR); // 결과: 1
		// 인스턴스 생성 후 해당 인스턴스의 메소드 호출.
		System.out.println(new FinalCar().brake()); // 결과: 10.2
	}
}

// 자식 클래스로써 상속을 받을 수 있음.
final class FinalCar {
	final int VAR = 1; // 상수.

	final double brake() { // 이 메소드는 오버라이딩을 통해 재정의할 수 없음.
		final double MAX_NUM = 10.2; // 이 지역 변수는 상수화되어 값을 변경할 수 없음.
		return MAX_NUM;
	}
}

// final class 부모클래스로써 상속 불가.
//class test extends FinalCar { // error: The type test cannot subclass the final class FinalCar
//}

// final class 자식 클래스로써 상속을 받을 수 있음.
//class FinalCar extends OtherModifier {
//}

class StaticCar {
	static int var = 2; // 클래스 필드(static 변수).
	
	// 클래스 변수의 복잡한 초기화에 사용된다. 클래스가 처음 로딩될 때 한 번만 수행된다.
	static { // static 초기화 블록.
		var = 1;
		System.out.println(var);
	}

	static void brake() { // 클래스 메소드(static 메소드).
		System.out.println(var);
	}
}