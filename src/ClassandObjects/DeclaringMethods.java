package ClassandObjects;

/**
 * <h3>메소드 선언(Declaring Methods)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html">
 * Java Tutorials > Classes and Objects > Declaring Methods</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_methodConstructor_method">TCP School > JAVA > 29) 메소드의 개념</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class DeclaringMethods {

	/* 
	 * method(함수)
	 * 1. 어떠한 특정 작업을 수행하기 위한 명령문의 집합.
	 * 
	 * 
	 * method(함수) 사용 목적
	 * 1. class에서 method를 작성하여 사용하는 이유는 중복되는 코드의 반복적인 프로그래밍을 피할 수 있기 때문.
	 * 2. 모듈화로 인해 코드의 가독성도 좋아진다.
	 * 3. 프로그램에 문제가 발생하거나 기능의 변경이 필요할 때도 손쉽게 유지보수를 할 수 있다.
	 * 
	 * 
	 * method(함수) 정의
	 * 접근제어자 반환타입 메소드명(매개변수) { // 선언부
	 *   // 구현부
	 * }
	 * 1. 접근 제어자: 해당 method에 접근할 수 있는 범위를 명시.
	 * 2. 반환 타입: method가 모든 작업을 마치고 반환하는 데이터의 타입을 명시.
	 *              만약 반환하지 않는 method로 사용할 경우 void 키워드로 변경.
	 * 3. method명: method를 호출하기 위한 이름을 명시.
	 * 4. 매개변수 목록(Parameters): method 호출 시에 전달되는 인수의 값을 저장할 변수들을 명시.
	 *                              여러 개를 명시할 수 있으며 쉼표(,)로 구분.
	 *                              매개 변수가 없으면 빈 괄호(())로 놔두면 된다.
	 * 5. 구현부: method의 고유 기능을 수행하는 명령문의 집합.
	 * 
	 * 
	 * method(함수) 호출
	 * 1. 클래스명 변수명 = new 클래스명(); -> 객체화.
	 *    객체참조변수명.메소드명(인수1, 인수2, ...); -> method 호출.
	 * 2. new 클래스명().메소드명(); -> instance 생성 후 method 호출.
	 * 3. 정적(static) method로 정의.
	 *    메소드명(인수1, 인수2, ...); -> method 호출.
	 * 
	 * 
	 * method signature(함수 서명)
	 * 1. method의 선언부에 명시되는 매개 변수의 목록을 가리킨다. method overloading의 핵심이다.
	 * 
	 * 
	 * method overloading(함수 오버로딩)
	 * 1. method signature만 다르게 하여 같은 이름의 method를 중복하여 정의하는 것.
	 *    즉, class 내 매개 변수 목록이 다른 method가 있는 경우 동일한 method명을 가질 수 있다.
	 * 2. 객체 지향 프로그래밍의 특징 중 하나인 다형성(polymorphism)을 구현하는 방법 중 하나이다.
	 * 3. 주로 어떤 객체(class)에서 하나의 기능(method)에 여러 계산식이 있거나 부여하고 싶을 경우 사용된다.
	 *    ex. 산술 연산자 method 여러 개 정의.
	 *    public int arithmeticOperators(int x, int y) {...}
	 *    public int arithmeticOperators(int x, int y, int z) {...}
	 * 
	 * 
	 * method overloading(함수 오버로딩) 조건
	 * 1. method명이 같아야 한다.
	 * 2. method signature, 즉 매개 변수의 갯수 또는 타입이 달라야 한다.
	 * 3. 반환 타입과는 관계가 없다. 만약 method signature는 같은데 반환 타입만 다른 경우 overloading이 성립하지 않는다.
	 */
	
	// return type(반환 타입)이 있는 method(함수) 선언.
	public String returnMethod() {
		return "return method";
	}

	// return type(반환 타입)이 없는 method(함수) 선언.
	public void voidMethod() {
		System.out.println("void method");
	}

	// static method(정적 함수) 선언.
	public static String staticReturnMethod() {
		return "static return method";
	}
	public static void staticVoidMethod() {
		System.out.println("static void method");
	}

	// method overloading(함수 오버로딩).
	public static int arithmeticOperators(int x, int y) {
		return x + y;
	}
	public static int arithmeticOperators(int x, int y, int z) {
		return x + y - z;
	}

	public static void main(String[] args) {
		// 객체화 후 return type(반환 타입)이 있는 method(함수) 호출.
		DeclaringMethods dm = new DeclaringMethods();
		System.out.println(dm.returnMethod()); // 결과: return method

		// instance 생성 후 return type(반환 타입)이 없는 method(함수) 호출.
		new DeclaringMethods().voidMethod(); // 결과: void method

		// static method(정적 함수) 호출.
		// 올바르지 않는 정적 함수 호출 방법. 구동하는데 문제는 없지만 "정적 방법으로 액세스해야 합니다"라고 경고 메시지를 띄운다. 즉, 올바른 호출 방법은 아니다.
		System.out.println(new DeclaringMethods().staticReturnMethod()); // 결과: static return method
		// 올바른 정적 함수 호출 방법.
		staticVoidMethod(); // 결과: static void method

		// method overloading(함수 오버로딩) 호출.
		System.out.println(arithmeticOperators(1, 2)); // 결과: 3
		System.out.println(arithmeticOperators(1, 2, 3)); // 결과: 0
	}
}