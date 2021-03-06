package Variables;

/**
 * <h3>변수(Variables)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html">
 * Java Tutorials > Language Basics > Variables</a></li>
 * <li><a href="https://ko.wikipedia.org/wiki/%EC%9D%B8%EC%8A%A4%ED%84%B4%EC%8A%A4_%EB%B3%80%EC%88%98">위키백과 - 인스턴스 변수</a></li>
 * <li><a href="https://ko.wikipedia.org/wiki/%ED%81%B4%EB%9E%98%EC%8A%A4_%EB%B3%80%EC%88%98">위키백과 - 클래스 변수</a></li>
 * <li><a href="https://ko.wikipedia.org/wiki/%EC%A7%80%EC%97%AD_%EB%B3%80%EC%88%98">위키백과 - 지역 변수</a></li>
 * <li><a href="https://ko.wikipedia.org/wiki/%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98_(%EC%BB%B4%ED%93%A8%ED%84%B0_%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D)">위키백과 - 매개 변수</a></li>
 * <li><a href="http://www.tcpschool.com/java/java_member_field">TCP School > JAVA > 37) 필드의 구분</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class Variables {
	/*
	 * 변수(Variable)
	 * 1. Java 프로그래밍 언어에서 클래스의 필드(field)란 클래스에 포함된 변수(variable)를 의미한다.
	 * 2. 특정 값(data)을 저장하기 위해 프로그램에 의해 이름을 할당받은 메모리 공간을 뜻한다.
	 * 3. 해당 메모리 공간에는 허용되는 범위 내에 어떤 값이든 저장할 수 있으므로 변수라고 하며, 저장된 값은 변경될 수 있다.
	 *    반대로 허용되는 범위보다 큰 값을 저장하려고 할 때 Overflow가 발생하여 다른 값이 저장될 수 있다.
	 * 
	 * 
	 * 인스턴스 변수(instance variable(non-static fields, 비정적 필드))
	 * 1. 클래스 영역에 정의된 변수(예: 전역 변수) 중 static 키워드를 가지지 않는 변수.
	 * 2. 비정적 필드에서 클래스의 각 인스턴스(즉, 각 객체)에 고유하기 때문에 인스턴스 변수라고도 한다.
	 *    그래서 인스턴스 변수들의 값을 바꿔도 다른 모든 인스턴스에 영향을 미치지 않는다.
	 * 3. 메소드가 정적으로 선언되어 있지 않은 경우 모든 클래스 메소드들에 의해 사용될 수 있다.
	 * 4. 주로 인스턴스마다 가져야 하는 고유한 값을 유지하기 위해 사용된다.
	 * 
	 * 
	 * 클래스 변수(class variable(static fields, 정적 필드))
	 * 1. 클래스 영역에 위치한 변수 중 static 키워드를 가지는 변수. 공유 변수(shared variable)라고도 한다.
	 * 2. static으로 선언된 어떤 필드든 컴파일러에게 클래스가 몇 번 인스턴스화되었든 상관없이
	 *    이 변수의 복사본이 정확히 하나 존재한다는 것을 말해준다.
	 * 3. 주로 해당 클래스의 모든 인스턴스가 공유해야 하는 값을 유지하기 위해 사용된다.
	 * 
	 * 
	 * 지역 변수(local variable)
	 * 1. 메소드나 생성자, 초기화 블록({}) 내에 선언된 변수.
	 * 2. 함수 내부에서만 접근할 수 있으며, 전역 변수(멤버 필드)에서 액세스 할 수 없다.
	 * 3. 함수 내부에서 선언된 변수는 함수의 호출이 종료되면 메모리에서 제거된다.
	 * 4. 지역 변수를 선언하는 구문은 필드를 선언하는 것과 유사하다.
	 * 
	 * 
	 * 매개 변수(parameters=인자값=인자)
	 * 1. 메소드나 생성자, 제어문을 정의 할 때 조건식(()) 안에 선언된 변수로,
	 *    외부로부터 받아들이는 임의의 값을 의미한다.
	 * 2. 보통 매개 변수=parameter=인자값(or 인자)라 말한다.
	 * 3. 대부분의 경우 매개 변수는 값에 의한 전달(call by value)의 형태로 동작한다.
	 * 4. 전달 인자(argument=인수값=인수) : 메소드를 호출할 때 전달되는 실제 값을 의미한다.
	 * 
	 * 
	 * 변수 3종 구분표(매개 변수 제외)
	 * 변수           생성 시기                           소멸 시기            저장 메모리  사용 방법 
	 * 클래스 변수    클래스가 메모리에 올라갈 때           프로그램이 종료될 때  메소드 영역  클래스이름.변수이름
	 * 인스턴스 변수  인스턴스가 생성될 때                  인스턴스가 소멸할 때  힙 영역      인스턴스이름.변수이름
	 * 지역 변수      블록 내에서 변수의 선언문이 실행될 때  블록을 벗어날 때     스택 영역    변수이름
	 * 
	 * 
	 * 변수 선언 방식
	 * 1. [예약어] [변수명] = [초기화];
	 * => 일반적인 변수 초기화(ex.).
	 * 
	 * 2. [예약어] [변수명]; [변수명] = [초기화];
	 * => 전역 변수로 놓고, 한 클래스 내에서 참조하기 위한 방식(ex. int i; i = 0;).
	 * 
	 * 3. [예약어] [변수명] = [초기화], [변수명] = [초기화], ... ;
	 * => 한 클래스 내에서 같은 데이터 형식을 묶어서 사용하는 방식.
	 *    주로 같은 의미의 변수들을 묶어서 사용한다(ex. 환율: double krw = 0.0, jpy = 0.0, usd = 0.0;).
	 */
	
	int i = 1; // 인스턴스 변수.
	static int j = 2; // 클래스 변수.

	static void addition(int x, int y) { // 매개 변수(인자).
		int i = x + y; // 지역 변수.
		System.out.println("지역변수 : " + i);
	}

	public static void main(String[] args) {
		System.out.println("인스턴스 변수 : " + new Variables().i);
		System.out.println("클래스 변수 : " + j);
		addition(1, 2); // 매개 변수(인수).
	}
}