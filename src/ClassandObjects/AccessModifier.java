package ClassandObjects;

/**
 * <h3>접근 제어자(Access Modifier)</h3>
 * 
 * <h4>참고 사이트</h4>
 * <ul>
 * <li><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html">
 * Java Tutorials > Classes and Objects > Controlling Access to Members of a Class</a></li>
 * <li><a href="http://tcpschool.com/java/java_modifier_accessModifier">TCP School > JAVA > 35) 접근 제어자</a></li>
 * </ul>
 * 
 * @since JDK 11
 * @version 1.0.0.RELEASE
 * @author 강민성
 */
public class AccessModifier {
	/*
	 * 접근 제어자(access modifier)
	 * 1. 객체 지향에서 정보 은닉(data hiding)이란 사용자가 굳이 알 필요가 없는 정보는 사용자로부터 숨겨야 한다는 개념.
	 *    이렇게 함으로써 사용자는 언제나 최소한의 정보만으로 프로그램을 손쉽게 사용할 수 있게 된다.
	 * 2. 접근 제어자를 사용하면 클래스 외부에서의 직접적인 접근을 허용하지 않는 멤버를 설정하여 정보 은닉을 구체화할 수 있다.
	 * 3. 접근 제어자는 생략이 가능하며 생략했을 때는 자동으로 default임을 뜻한다.
	 * 4. 접근 제어자 종류: public, protected, default, private
	 * 
	 * 
	 * 접근 제어자의 접근 범위
	 * 1. 접근 범위가 큰 것부터 작은 순으로 public > protected > default > private.
	 * 2. 접근 제어자의 접근 범위표
	 * -----------------------------------------------------------------------------
	 *            |               같은 패키지             |       다른 패키지
	 * -----------------------------------------------------------------------------
	 * 접근 제어자 | 선언한 클래스  일반 클래스  자식 클래스 | 일반 클래스  자식 클래스
	 * public     |       O            O           O     |      O           O
	 * protected  |       O            O           O     |      X           O
	 * default    |       O            O           O     |      X           X
	 * private    |       O            X           X     |      X           X
	 * -----------------------------------------------------------------------------
	 * 
	 * 
	 * 접근 제어자 선택에 대한 팁
	 * 1. 여러 범위에서 고의적으로 사용해야되는 상황이 아니고서는 private 사용을 지향한다.
	 *    무조건 public으로 할 경우 프로그램 실행 시 의도치 않게 참조하게 될 수 있기 때문이다.
	 * 2. public은 주로 상수에 사용하는 것을 지향한다. 프로그램 실행 시 상수의 값은 변경이 불가하며
	 *    주로 여러 곳에서 값을 참조할 수 있게하는 용도로 사용하기 때문이다.
	 * 
	 * 
	 * public 접근 제어자
	 * 1. 선언된 클래스 멤버는 외부로 공개되며, 해당 객체를 사용하는 프로그램 어디에서나 직접 접근할 수 있다.
	 * 2. public 메소드를 통해서만 해당 객체의 private 멤버에 접근할 수 있다.
	 *    따라서 public 메소드는 private 멤버와 프로그램 사이의 인터페이스 역할을 수행한다고 할 수 있다.
	 * 
	 * 
	 * protected 접근 제어자
	 * 1. protected 멤버는 부모 클래스에 대해서는 public 멤버처럼 취급되며, 외부에서는 private 멤버처럼 취급한다.
	 * 
	 * 
	 * default 접근 제어자
	 * 1. 같은 클래스의 멤버와 같은 패키지에 속하는 멤버에서만 접근할 수 있다.
	 * 2. default를 위한 접근 제어자는 따로 존재하지 않으며,
	 *    접근 제어자가 지정되지 않으면 자동적으로 default 접근 제어를 가지게 된다.
	 * 
	 * 
	 * private 접근 제어자
	 * 1. 선언된 클래스 멤버는 외부에 공개되지 않으며, 외부에서는 직접 접근할 수 없다.
	 * 2. private 멤버에 직접 접근할 수 없으며, 해당 객체의 public 메소드를 통해서만 접근할 수 있다.
	 *    따라서 private 멤버는 public 인터페이스를 직접 구성하지 않고, 클래스 내부의 세부적인 동작을 구현하는데 사용된다.
	 */
	
	public String pubVar = "누구든지 허용"; // public 필드.
	protected String proVar = "다른 패키지에 속하는 자식 클래스까지 허용"; // protected 필드.
	String defVar = "같은 패키지는 허용"; // default 필드.
	private String priVar = "같은 클래스만 허용"; // private 필드
}
